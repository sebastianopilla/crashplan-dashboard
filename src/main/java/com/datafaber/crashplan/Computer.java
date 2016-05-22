package com.datafaber.crashplan;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;
import java.util.ArrayList;
import java.util.List;

@Generated("org.jsonschema2pojo")
public class Computer {

  @SerializedName("computerId")
  @Expose
  private Integer computerId;
  @SerializedName("name")
  @Expose
  private String name;
  @SerializedName("guid")
  @Expose
  private String guid;
  @SerializedName("type")
  @Expose
  private String type;
  @SerializedName("status")
  @Expose
  private String status;
  @SerializedName("active")
  @Expose
  private Boolean active;
  @SerializedName("blocked")
  @Expose
  private Boolean blocked;
  @SerializedName("alertState")
  @Expose
  private Integer alertState;
  @SerializedName("alertStates")
  @Expose
  private List<String> alertStates = new ArrayList<String>();
  @SerializedName("userId")
  @Expose
  private Integer userId;
  @SerializedName("userUid")
  @Expose
  private String userUid;
  @SerializedName("orgId")
  @Expose
  private Integer orgId;
  @SerializedName("orgUid")
  @Expose
  private String orgUid;
  @SerializedName("computerExtRef")
  @Expose
  private Object computerExtRef;
  @SerializedName("notes")
  @Expose
  private Object notes;
  @SerializedName("parentComputerId")
  @Expose
  private Object parentComputerId;
  @SerializedName("parentComputerGuid")
  @Expose
  private Object parentComputerGuid;
  @SerializedName("lastConnected")
  @Expose
  private String lastConnected;
  @SerializedName("osName")
  @Expose
  private String osName;
  @SerializedName("osVersion")
  @Expose
  private String osVersion;
  @SerializedName("osArch")
  @Expose
  private String osArch;
  @SerializedName("address")
  @Expose
  private String address;
  @SerializedName("remoteAddress")
  @Expose
  private String remoteAddress;
  @SerializedName("javaVersion")
  @Expose
  private String javaVersion;
  @SerializedName("modelInfo")
  @Expose
  private Object modelInfo;
  @SerializedName("timeZone")
  @Expose
  private String timeZone;
  @SerializedName("version")
  @Expose
  private String version;
  @SerializedName("productVersion")
  @Expose
  private String productVersion;
  @SerializedName("buildVersion")
  @Expose
  private String buildVersion;
  @SerializedName("creationDate")
  @Expose
  private String creationDate;
  @SerializedName("modificationDate")
  @Expose
  private String modificationDate;
  @SerializedName("loginDate")
  @Expose
  private String loginDate;
  @SerializedName("service")
  @Expose
  private String service;
  @SerializedName("backupUsage")
  @Expose
  private List<BackupUsage> backupUsage = new ArrayList<BackupUsage>();

  /**
   * No args constructor for use in serialization
   */
  public Computer () {
  }

  /**
   * @param alertStates
   * @param computerExtRef
   * @param osArch
   * @param parentComputerId
   * @param timeZone
   * @param type
   * @param version
   * @param orgId
   * @param orgUid
   * @param parentComputerGuid
   * @param userId
   * @param name
   * @param loginDate
   * @param alertState
   * @param blocked
   * @param javaVersion
   * @param buildVersion
   * @param computerId
   * @param modelInfo
   * @param osVersion
   * @param status
   * @param backupUsage
   * @param productVersion
   * @param guid
   * @param creationDate
   * @param lastConnected
   * @param address
   * @param remoteAddress
   * @param userUid
   * @param service
   * @param active
   * @param modificationDate
   * @param notes
   * @param osName
   */
  public Computer (Integer computerId, String name, String guid, String type, String status, Boolean active, Boolean blocked, Integer alertState, List<String> alertStates, Integer userId, String userUid, Integer orgId, String orgUid, Object computerExtRef, Object notes, Object parentComputerId, Object parentComputerGuid, String lastConnected, String osName, String osVersion, String osArch, String address, String remoteAddress, String javaVersion, Object modelInfo, String timeZone, String version, String productVersion, String buildVersion, String creationDate, String modificationDate, String loginDate, String service, List<BackupUsage> backupUsage) {
    this.computerId = computerId;
    this.name = name;
    this.guid = guid;
    this.type = type;
    this.status = status;
    this.active = active;
    this.blocked = blocked;
    this.alertState = alertState;
    this.alertStates = alertStates;
    this.userId = userId;
    this.userUid = userUid;
    this.orgId = orgId;
    this.orgUid = orgUid;
    this.computerExtRef = computerExtRef;
    this.notes = notes;
    this.parentComputerId = parentComputerId;
    this.parentComputerGuid = parentComputerGuid;
    this.lastConnected = lastConnected;
    this.osName = osName;
    this.osVersion = osVersion;
    this.osArch = osArch;
    this.address = address;
    this.remoteAddress = remoteAddress;
    this.javaVersion = javaVersion;
    this.modelInfo = modelInfo;
    this.timeZone = timeZone;
    this.version = version;
    this.productVersion = productVersion;
    this.buildVersion = buildVersion;
    this.creationDate = creationDate;
    this.modificationDate = modificationDate;
    this.loginDate = loginDate;
    this.service = service;
    this.backupUsage = backupUsage;
  }

  /**
   * @return The computerId
   */
  public Integer getComputerId () {
    return computerId;
  }

  /**
   * @param computerId The computerId
   */
  public void setComputerId (Integer computerId) {
    this.computerId = computerId;
  }

  /**
   * @return The name
   */
  public String getName () {
    return name;
  }

  /**
   * @param name The name
   */
  public void setName (String name) {
    this.name = name;
  }

  /**
   * @return The guid
   */
  public String getGuid () {
    return guid;
  }

  /**
   * @param guid The guid
   */
  public void setGuid (String guid) {
    this.guid = guid;
  }

  /**
   * @return The type
   */
  public String getType () {
    return type;
  }

  /**
   * @param type The type
   */
  public void setType (String type) {
    this.type = type;
  }

  /**
   * @return The status
   */
  public String getStatus () {
    return status;
  }

  /**
   * @param status The status
   */
  public void setStatus (String status) {
    this.status = status;
  }

  /**
   * @return The active
   */
  public Boolean getActive () {
    return active;
  }

  /**
   * @param active The active
   */
  public void setActive (Boolean active) {
    this.active = active;
  }

  /**
   * @return The blocked
   */
  public Boolean getBlocked () {
    return blocked;
  }

  /**
   * @param blocked The blocked
   */
  public void setBlocked (Boolean blocked) {
    this.blocked = blocked;
  }

  /**
   * @return The alertState
   */
  public Integer getAlertState () {
    return alertState;
  }

  /**
   * @param alertState The alertState
   */
  public void setAlertState (Integer alertState) {
    this.alertState = alertState;
  }

  /**
   * @return The alertStates
   */
  public List<String> getAlertStates () {
    return alertStates;
  }

  /**
   * @param alertStates The alertStates
   */
  public void setAlertStates (List<String> alertStates) {
    this.alertStates = alertStates;
  }

  /**
   * @return The userId
   */
  public Integer getUserId () {
    return userId;
  }

  /**
   * @param userId The userId
   */
  public void setUserId (Integer userId) {
    this.userId = userId;
  }

  /**
   * @return The userUid
   */
  public String getUserUid () {
    return userUid;
  }

  /**
   * @param userUid The userUid
   */
  public void setUserUid (String userUid) {
    this.userUid = userUid;
  }

  /**
   * @return The orgId
   */
  public Integer getOrgId () {
    return orgId;
  }

  /**
   * @param orgId The orgId
   */
  public void setOrgId (Integer orgId) {
    this.orgId = orgId;
  }

  /**
   * @return The orgUid
   */
  public String getOrgUid () {
    return orgUid;
  }

  /**
   * @param orgUid The orgUid
   */
  public void setOrgUid (String orgUid) {
    this.orgUid = orgUid;
  }

  /**
   * @return The computerExtRef
   */
  public Object getComputerExtRef () {
    return computerExtRef;
  }

  /**
   * @param computerExtRef The computerExtRef
   */
  public void setComputerExtRef (Object computerExtRef) {
    this.computerExtRef = computerExtRef;
  }

  /**
   * @return The notes
   */
  public Object getNotes () {
    return notes;
  }

  /**
   * @param notes The notes
   */
  public void setNotes (Object notes) {
    this.notes = notes;
  }

  /**
   * @return The parentComputerId
   */
  public Object getParentComputerId () {
    return parentComputerId;
  }

  /**
   * @param parentComputerId The parentComputerId
   */
  public void setParentComputerId (Object parentComputerId) {
    this.parentComputerId = parentComputerId;
  }

  /**
   * @return The parentComputerGuid
   */
  public Object getParentComputerGuid () {
    return parentComputerGuid;
  }

  /**
   * @param parentComputerGuid The parentComputerGuid
   */
  public void setParentComputerGuid (Object parentComputerGuid) {
    this.parentComputerGuid = parentComputerGuid;
  }

  /**
   * @return The lastConnected
   */
  public String getLastConnected () {
    return lastConnected;
  }

  /**
   * @param lastConnected The lastConnected
   */
  public void setLastConnected (String lastConnected) {
    this.lastConnected = lastConnected;
  }

  /**
   * @return The osName
   */
  public String getOsName () {
    return osName;
  }

  /**
   * @param osName The osName
   */
  public void setOsName (String osName) {
    this.osName = osName;
  }

  /**
   * @return The osVersion
   */
  public String getOsVersion () {
    return osVersion;
  }

  /**
   * @param osVersion The osVersion
   */
  public void setOsVersion (String osVersion) {
    this.osVersion = osVersion;
  }

  /**
   * @return The osArch
   */
  public String getOsArch () {
    return osArch;
  }

  /**
   * @param osArch The osArch
   */
  public void setOsArch (String osArch) {
    this.osArch = osArch;
  }

  /**
   * @return The address
   */
  public String getAddress () {
    return address;
  }

  /**
   * @param address The address
   */
  public void setAddress (String address) {
    this.address = address;
  }

  /**
   * @return The remoteAddress
   */
  public String getRemoteAddress () {
    return remoteAddress;
  }

  /**
   * @param remoteAddress The remoteAddress
   */
  public void setRemoteAddress (String remoteAddress) {
    this.remoteAddress = remoteAddress;
  }

  /**
   * @return The javaVersion
   */
  public String getJavaVersion () {
    return javaVersion;
  }

  /**
   * @param javaVersion The javaVersion
   */
  public void setJavaVersion (String javaVersion) {
    this.javaVersion = javaVersion;
  }

  /**
   * @return The modelInfo
   */
  public Object getModelInfo () {
    return modelInfo;
  }

  /**
   * @param modelInfo The modelInfo
   */
  public void setModelInfo (Object modelInfo) {
    this.modelInfo = modelInfo;
  }

  /**
   * @return The timeZone
   */
  public String getTimeZone () {
    return timeZone;
  }

  /**
   * @param timeZone The timeZone
   */
  public void setTimeZone (String timeZone) {
    this.timeZone = timeZone;
  }

  /**
   * @return The version
   */
  public String getVersion () {
    return version;
  }

  /**
   * @param version The version
   */
  public void setVersion (String version) {
    this.version = version;
  }

  /**
   * @return The productVersion
   */
  public String getProductVersion () {
    return productVersion;
  }

  /**
   * @param productVersion The productVersion
   */
  public void setProductVersion (String productVersion) {
    this.productVersion = productVersion;
  }

  /**
   * @return The buildVersion
   */
  public String getBuildVersion () {
    return buildVersion;
  }

  /**
   * @param buildVersion The buildVersion
   */
  public void setBuildVersion (String buildVersion) {
    this.buildVersion = buildVersion;
  }

  /**
   * @return The creationDate
   */
  public String getCreationDate () {
    return creationDate;
  }

  /**
   * @param creationDate The creationDate
   */
  public void setCreationDate (String creationDate) {
    this.creationDate = creationDate;
  }

  /**
   * @return The modificationDate
   */
  public String getModificationDate () {
    return modificationDate;
  }

  /**
   * @param modificationDate The modificationDate
   */
  public void setModificationDate (String modificationDate) {
    this.modificationDate = modificationDate;
  }

  /**
   * @return The loginDate
   */
  public String getLoginDate () {
    return loginDate;
  }

  /**
   * @param loginDate The loginDate
   */
  public void setLoginDate (String loginDate) {
    this.loginDate = loginDate;
  }

  /**
   * @return The service
   */
  public String getService () {
    return service;
  }

  /**
   * @param service The service
   */
  public void setService (String service) {
    this.service = service;
  }

  /**
   * @return The backupUsage
   */
  public List<BackupUsage> getBackupUsage () {
    return backupUsage;
  }

  /**
   * @param backupUsage The backupUsage
   */
  public void setBackupUsage (List<BackupUsage> backupUsage) {
    this.backupUsage = backupUsage;
  }

  @Override
  public String toString () {
    return ToStringBuilder.reflectionToString(this);
  }

  @Override
  public int hashCode () {
    return new HashCodeBuilder().append(computerId).append(name).append(guid).append(type).append(status).append(active).append(blocked).append(alertState).append(alertStates).append(userId).append(userUid).append(orgId).append(orgUid).append(computerExtRef).append(notes).append(parentComputerId).append(parentComputerGuid).append(lastConnected).append(osName).append(osVersion).append(osArch).append(address).append(remoteAddress).append(javaVersion).append(modelInfo).append(timeZone).append(version).append(productVersion).append(buildVersion).append(creationDate).append(modificationDate).append(loginDate).append(service).append(backupUsage).toHashCode();
  }

  @Override
  public boolean equals (Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof Computer) == false) {
      return false;
    }
    Computer rhs = ((Computer) other);
    return new EqualsBuilder().append(computerId, rhs.computerId).append(name, rhs.name).append(guid, rhs.guid).append(type, rhs.type).append(status, rhs.status).append(active, rhs.active).append(blocked, rhs.blocked).append(alertState, rhs.alertState).append(alertStates, rhs.alertStates).append(userId, rhs.userId).append(userUid, rhs.userUid).append(orgId, rhs.orgId).append(orgUid, rhs.orgUid).append(computerExtRef, rhs.computerExtRef).append(notes, rhs.notes).append(parentComputerId, rhs.parentComputerId).append(parentComputerGuid, rhs.parentComputerGuid).append(lastConnected, rhs.lastConnected).append(osName, rhs.osName).append(osVersion, rhs.osVersion).append(osArch, rhs.osArch).append(address, rhs.address).append(remoteAddress, rhs.remoteAddress).append(javaVersion, rhs.javaVersion).append(modelInfo, rhs.modelInfo).append(timeZone, rhs.timeZone).append(version, rhs.version).append(productVersion, rhs.productVersion).append(buildVersion, rhs.buildVersion).append(creationDate, rhs.creationDate).append(modificationDate, rhs.modificationDate).append(loginDate, rhs.loginDate).append(service, rhs.service).append(backupUsage, rhs.backupUsage).isEquals();
  }

}
