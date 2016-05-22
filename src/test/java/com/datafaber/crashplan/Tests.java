package com.datafaber.crashplan;

import com.google.gson.Gson;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Test cases
 */
public class Tests {

  @Test
  public void testParseJson () throws Exception {
    String jsonData = new String(Files.readAllBytes(Paths.get(getClass().getResource("/crashplan.json").toURI())));
    Gson gson = new Gson();
    CrashPlanData cpdata = gson.fromJson(jsonData, CrashPlanData.class);
    Assert.assertNotNull(cpdata);
    Assert.assertNotNull(cpdata.getData());
    Assert.assertNotNull(cpdata.getData().getComputers());
    Assert.assertTrue(cpdata.getData().getComputers().size() == 9);
  }

  @Test
  public void testParseDate () throws Exception {
    String dateStr = "2016-05-14T15:04:24.261-05:00";
    DateTimeFormatter fmt = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZZ");
    DateTime dt = fmt.withOffsetParsed().parseDateTime(dateStr);
    Assert.assertEquals(2016, dt.getYear());
    Assert.assertEquals(4, dt.getMinuteOfHour());
    Assert.assertEquals(261, dt.getMillisOfSecond());
    Assert.assertEquals("GMT-05:00", dt.getZone().toTimeZone().getDisplayName());
  }
}
