package com.datafaber.crashplan;

import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.request.GetRequest;
import freemarker.cache.ClassTemplateLoader;
import freemarker.cache.FileTemplateLoader;
import freemarker.template.Configuration;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.ModelAndView;
import spark.template.freemarker.FreeMarkerEngine;

import java.io.File;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.*;

import static spark.Spark.before;
import static spark.Spark.get;
import static spark.Spark.staticFiles;

/**
 * Main application class
 */
public class Dashboard {

  // names of request attributes
  private static final String CP_USERNAME = "CP_USERNAME";
  private static final String CP_PASSWORD = "CP_PASSWORD";

  // URL of the Crashplan request
  private static final String CRASHPLAN_ENDPOINT = "https://www.crashplan.com/api/Computer";

  // date-time pattern to parse dates returned by the Crashplan API
  private static final String DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSZZ";

  // names of system properties
  private static final String STATICS_BASE_DIR = "statics.baseDir";

  // formatting of bytes
  private static final String FORMAT_HUMAN_READABLE = "h";
  private static final String FORMAT_RAW = "r";
  private static final long ONE_MB = 1024L * 1024L;
  private static final long ONE_GB = 1024L * ONE_MB;

  // logger
  private static final Logger mLogger = LoggerFactory.getLogger(Dashboard.class);

  /**
   * Entry point for requests
   * @param pArgs arguments
   */
  public static void main (String[] pArgs) throws Exception {
    String ctx = "main - ";

    // specify the external location for static files by looking at the "statics.base" system property
    String staticsBaseDir = System.getProperty(STATICS_BASE_DIR, "");
    if (!"".equals(staticsBaseDir)) {
      staticFiles.externalLocation(staticsBaseDir);
    }

    // initialize Freemarker to render the template
    // use a file template loader if the "statics.base" system property exists, use a classpath template loader instead
    FreeMarkerEngine freeMarkerEngine = new FreeMarkerEngine();
    Configuration freeMarkerConfiguration = new Configuration();
    if ("".equals(staticsBaseDir)) {
      freeMarkerConfiguration.setTemplateLoader(new ClassTemplateLoader(Dashboard.class, "/"));
    } else {
      String templatesDir = staticsBaseDir + File.separator + "templates";
      try {
        freeMarkerConfiguration.setTemplateLoader(new FileTemplateLoader(new File(templatesDir)));
        freeMarkerConfiguration.setTemplateUpdateDelay(0);
      } catch (IOException ioe) {
        mLogger.error(ctx + "could not configure Freemarker template loader for directory " + templatesDir, ioe);
        throw new Exception(ioe);
      }
    }
    freeMarkerConfiguration.setObjectWrapper(new JodaAwareObjectWrapper());
    freeMarkerEngine.setConfiguration(freeMarkerConfiguration);

    // request filter to ask for the crashplan credentials
    before("/*", (pRequest, pResponse) -> {
      boolean authenticated = false;
      String authHeader = pRequest.headers("Authorization");
      if (authHeader != null && authHeader.startsWith("Basic")) {
        String rawCredentials = authHeader.substring("Basic".length()).trim();
        String decodedCredentials = new String(Base64.getDecoder().decode(rawCredentials));
        String[] credentials = decodedCredentials.split(":");
        if (credentials.length != 2) {
          mLogger.error(ctx + "need to give username and password");
        } else {
          // need to piggyback on request attributes because of the silly lambda final variables requirements
          pRequest.attribute(CP_USERNAME, credentials[0]);
          pRequest.attribute(CP_PASSWORD, credentials[1]);
          authenticated = true;
        }
      }
      if (!authenticated) {
        pResponse.header("WWW-Authenticate", "Basic realm=\"Crashplan Login and Password\"");
        pResponse.status(401);
      }
    });

    // ask the crashplan servers for the computer statuses, then fill the template with the data and render it
    get("/", (pRequest, pResponse) -> {
      GetRequest cpRequest = Unirest.get(CRASHPLAN_ENDPOINT);
      HttpResponse<JsonNode> cpResponse = cpRequest
              .basicAuth(pRequest.attribute(CP_USERNAME), pRequest.attribute(CP_PASSWORD))
              .queryString("active", "true")
              .queryString("incBackupUsage", "true")
              .asJson();
      if (cpResponse.getStatus() != 200) {
        pResponse.status(cpResponse.getStatus());
        return cpResponse.getStatusText();
      } else {
        Gson gson = new Gson();
        CrashPlanData cpdata = gson.fromJson(cpResponse.getBody().toString(), CrashPlanData.class);
        Map<String,List<ComputerTargetData>> usageData = extractUsageData(cpdata.getData(), pRequest.queryParams("format"));
        Map<String,Object> templateData = new HashMap<>();
        templateData.put("usageData", usageData);
        return freeMarkerEngine.render(new ModelAndView(templateData, "backup.ftl"));
      }
    });

  } // end main


  /**
   * Walk the data returned by Crashplan to find all the different backup targets
   * Once a target is found, aggregate the usage data for all the computers backing up to it
   * @param pData crashplan data
   * @param pFormat "h" for formatting bytes in MB, GB, TB, "r" for the raw bytes values
   * @return usage data by target
   */
  @SuppressWarnings("unchecked")
  private static Map<String,List<ComputerTargetData>> extractUsageData (Data pData, String pFormat) {
    String ctx = "extractUsageData - ";
    if (pData == null) {
      return Collections.EMPTY_MAP;
    }
    Map<String,List<ComputerTargetData>> usageData = new TreeMap<>();
    List<Computer> computers = pData.getComputers();
    if (computers == null || computers.isEmpty()) {
      return Collections.EMPTY_MAP;
    }

    // use human readable format by default
    String formatParam = pFormat != null ? pFormat : FORMAT_HUMAN_READABLE;

    DateTimeFormatter fmt = DateTimeFormat.forPattern(DATE_FORMAT).withOffsetParsed();
    for (Computer computer : computers) {
      List<BackupUsage> backupUsages = computer.getBackupUsage();
      if (backupUsages == null || backupUsages.isEmpty()) {
        continue;
      }
      for (BackupUsage backupUsage : backupUsages) {
        ComputerTargetData ctd = new ComputerTargetData(backupUsage.getTargetComputerName(),
                computer.getName(),
                backupUsage.getLastConnected() != null ? fmt.parseDateTime(backupUsage.getLastConnected()) : null,
                backupUsage.getLastBackup() != null ? fmt.parseDateTime(backupUsage.getLastBackup()) : null,
                backupUsage.getLastCompletedBackup() != null ? fmt.parseDateTime(backupUsage.getLastCompletedBackup()) : null,
                String.valueOf(backupUsage.getPercentComplete()),
                backupUsage.getSelectedFiles(),
                formatBytes(backupUsage.getSelectedBytes(), formatParam),
                backupUsage.getTodoFiles(),
                formatBytes(backupUsage.getTodoBytes(), formatParam));
        List<ComputerTargetData> computersForTarget = usageData.get(backupUsage.getTargetComputerName());
        if (computersForTarget == null) {
          computersForTarget = new ArrayList<>();
        }
        computersForTarget.add(ctd);
        usageData.put(backupUsage.getTargetComputerName(), computersForTarget);
      }
    }
    return usageData;
  } // end extractUsageData


  private static String formatBytes (Long pVal, String pFormatParam) {
    if (!FORMAT_HUMAN_READABLE.equals(pFormatParam)) {
      return String.valueOf(pVal);
    }
    if (pVal >= ONE_GB) {
      return String.valueOf(NumberFormat.getInstance().format(pVal / ONE_GB)) + " GB";
    }
    if (pVal >= ONE_MB) {
      return String.valueOf(NumberFormat.getInstance().format(pVal / ONE_MB)) + " MB";
    }
    return String.valueOf(pVal);
  }

}
