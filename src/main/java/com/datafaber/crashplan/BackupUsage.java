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
public class BackupUsage {

  @SerializedName("targetComputerId")
  @Expose
  private Integer targetComputerId;
  @SerializedName("targetComputerParentId")
  @Expose
  private Object targetComputerParentId;
  @SerializedName("targetComputerParentGuid")
  @Expose
  private Object targetComputerParentGuid;
  @SerializedName("targetComputerGuid")
  @Expose
  private String targetComputerGuid;
  @SerializedName("targetComputerName")
  @Expose
  private String targetComputerName;
  @SerializedName("targetComputerOsName")
  @Expose
  private Object targetComputerOsName;
  @SerializedName("targetComputerType")
  @Expose
  private String targetComputerType;
  @SerializedName("selectedFiles")
  @Expose
  private Long selectedFiles;
  @SerializedName("selectedBytes")
  @Expose
  private Long selectedBytes;
  @SerializedName("todoFiles")
  @Expose
  private Long todoFiles;
  @SerializedName("todoBytes")
  @Expose
  private Long todoBytes;
  @SerializedName("archiveBytes")
  @Expose
  private Long archiveBytes;
  @SerializedName("billableBytes")
  @Expose
  private Long billableBytes;
  @SerializedName("sendRateAverage")
  @Expose
  private Integer sendRateAverage;
  @SerializedName("completionRateAverage")
  @Expose
  private Integer completionRateAverage;
  @SerializedName("lastBackup")
  @Expose
  private String lastBackup;
  @SerializedName("lastCompletedBackup")
  @Expose
  private String lastCompletedBackup;
  @SerializedName("lastConnected")
  @Expose
  private String lastConnected;
  @SerializedName("lastMaintenanceDate")
  @Expose
  private String lastMaintenanceDate;
  @SerializedName("lastCompactDate")
  @Expose
  private Object lastCompactDate;
  @SerializedName("modificationDate")
  @Expose
  private String modificationDate;
  @SerializedName("creationDate")
  @Expose
  private String creationDate;
  @SerializedName("using")
  @Expose
  private Boolean using;
  @SerializedName("alertState")
  @Expose
  private Integer alertState;
  @SerializedName("alertStates")
  @Expose
  private List<String> alertStates = new ArrayList<String>();
  @SerializedName("percentComplete")
  @Expose
  private Double percentComplete;
  @SerializedName("storePointId")
  @Expose
  private Integer storePointId;
  @SerializedName("storePointName")
  @Expose
  private String storePointName;
  @SerializedName("serverId")
  @Expose
  private Integer serverId;
  @SerializedName("serverGuid")
  @Expose
  private String serverGuid;
  @SerializedName("serverName")
  @Expose
  private String serverName;
  @SerializedName("serverHostName")
  @Expose
  private String serverHostName;
  @SerializedName("isProvider")
  @Expose
  private Boolean isProvider;
  @SerializedName("archiveGuid")
  @Expose
  private String archiveGuid;
  @SerializedName("archiveFormat")
  @Expose
  private String archiveFormat;

  /**
   * No args constructor for use in serialization
   */
  public BackupUsage () {
  }

  /**
   * @param lastCompactDate
   * @param using
   * @param alertStates
   * @param targetComputerId
   * @param targetComputerType
   * @param todoBytes
   * @param lastMaintenanceDate
   * @param selectedBytes
   * @param serverHostName
   * @param serverGuid
   * @param storePointName
   * @param selectedFiles
   * @param billableBytes
   * @param sendRateAverage
   * @param alertState
   * @param serverId
   * @param storePointId
   * @param percentComplete
   * @param targetComputerName
   * @param targetComputerParentGuid
   * @param targetComputerGuid
   * @param todoFiles
   * @param serverName
   * @param targetComputerOsName
   * @param archiveFormat
   * @param targetComputerParentId
   * @param creationDate
   * @param isProvider
   * @param lastConnected
   * @param lastCompletedBackup
   * @param archiveGuid
   * @param archiveBytes
   * @param modificationDate
   * @param lastBackup
   * @param completionRateAverage
   */
  public BackupUsage (Integer targetComputerId, Object targetComputerParentId, Object targetComputerParentGuid, String targetComputerGuid, String targetComputerName, Object targetComputerOsName, String targetComputerType, Long selectedFiles, Long selectedBytes, Long todoFiles, Long todoBytes, Long archiveBytes, Long billableBytes, Integer sendRateAverage, Integer completionRateAverage, String lastBackup, String lastCompletedBackup, String lastConnected, String lastMaintenanceDate, Object lastCompactDate, String modificationDate, String creationDate, Boolean using, Integer alertState, List<String> alertStates, Double percentComplete, Integer storePointId, String storePointName, Integer serverId, String serverGuid, String serverName, String serverHostName, Boolean isProvider, String archiveGuid, String archiveFormat) {
    this.targetComputerId = targetComputerId;
    this.targetComputerParentId = targetComputerParentId;
    this.targetComputerParentGuid = targetComputerParentGuid;
    this.targetComputerGuid = targetComputerGuid;
    this.targetComputerName = targetComputerName;
    this.targetComputerOsName = targetComputerOsName;
    this.targetComputerType = targetComputerType;
    this.selectedFiles = selectedFiles;
    this.selectedBytes = selectedBytes;
    this.todoFiles = todoFiles;
    this.todoBytes = todoBytes;
    this.archiveBytes = archiveBytes;
    this.billableBytes = billableBytes;
    this.sendRateAverage = sendRateAverage;
    this.completionRateAverage = completionRateAverage;
    this.lastBackup = lastBackup;
    this.lastCompletedBackup = lastCompletedBackup;
    this.lastConnected = lastConnected;
    this.lastMaintenanceDate = lastMaintenanceDate;
    this.lastCompactDate = lastCompactDate;
    this.modificationDate = modificationDate;
    this.creationDate = creationDate;
    this.using = using;
    this.alertState = alertState;
    this.alertStates = alertStates;
    this.percentComplete = percentComplete;
    this.storePointId = storePointId;
    this.storePointName = storePointName;
    this.serverId = serverId;
    this.serverGuid = serverGuid;
    this.serverName = serverName;
    this.serverHostName = serverHostName;
    this.isProvider = isProvider;
    this.archiveGuid = archiveGuid;
    this.archiveFormat = archiveFormat;
  }

  /**
   * @return The targetComputerId
   */
  public Integer getTargetComputerId () {
    return targetComputerId;
  }

  /**
   * @param targetComputerId The targetComputerId
   */
  public void setTargetComputerId (Integer targetComputerId) {
    this.targetComputerId = targetComputerId;
  }

  /**
   * @return The targetComputerParentId
   */
  public Object getTargetComputerParentId () {
    return targetComputerParentId;
  }

  /**
   * @param targetComputerParentId The targetComputerParentId
   */
  public void setTargetComputerParentId (Object targetComputerParentId) {
    this.targetComputerParentId = targetComputerParentId;
  }

  /**
   * @return The targetComputerParentGuid
   */
  public Object getTargetComputerParentGuid () {
    return targetComputerParentGuid;
  }

  /**
   * @param targetComputerParentGuid The targetComputerParentGuid
   */
  public void setTargetComputerParentGuid (Object targetComputerParentGuid) {
    this.targetComputerParentGuid = targetComputerParentGuid;
  }

  /**
   * @return The targetComputerGuid
   */
  public String getTargetComputerGuid () {
    return targetComputerGuid;
  }

  /**
   * @param targetComputerGuid The targetComputerGuid
   */
  public void setTargetComputerGuid (String targetComputerGuid) {
    this.targetComputerGuid = targetComputerGuid;
  }

  /**
   * @return The targetComputerName
   */
  public String getTargetComputerName () {
    return targetComputerName;
  }

  /**
   * @param targetComputerName The targetComputerName
   */
  public void setTargetComputerName (String targetComputerName) {
    this.targetComputerName = targetComputerName;
  }

  /**
   * @return The targetComputerOsName
   */
  public Object getTargetComputerOsName () {
    return targetComputerOsName;
  }

  /**
   * @param targetComputerOsName The targetComputerOsName
   */
  public void setTargetComputerOsName (Object targetComputerOsName) {
    this.targetComputerOsName = targetComputerOsName;
  }

  /**
   * @return The targetComputerType
   */
  public String getTargetComputerType () {
    return targetComputerType;
  }

  /**
   * @param targetComputerType The targetComputerType
   */
  public void setTargetComputerType (String targetComputerType) {
    this.targetComputerType = targetComputerType;
  }

  /**
   * @return The selectedFiles
   */
  public Long getSelectedFiles () {
    return selectedFiles;
  }

  /**
   * @param selectedFiles The selectedFiles
   */
  public void setSelectedFiles (Long selectedFiles) {
    this.selectedFiles = selectedFiles;
  }

  /**
   * @return The selectedBytes
   */
  public Long getSelectedBytes () {
    return selectedBytes;
  }

  /**
   * @param selectedBytes The selectedBytes
   */
  public void setSelectedBytes (Long selectedBytes) {
    this.selectedBytes = selectedBytes;
  }

  /**
   * @return The todoFiles
   */
  public Long getTodoFiles () {
    return todoFiles;
  }

  /**
   * @param todoFiles The todoFiles
   */
  public void setTodoFiles (Long todoFiles) {
    this.todoFiles = todoFiles;
  }

  /**
   * @return The todoBytes
   */
  public Long getTodoBytes () {
    return todoBytes;
  }

  /**
   * @param todoBytes The todoBytes
   */
  public void setTodoBytes (Long todoBytes) {
    this.todoBytes = todoBytes;
  }

  /**
   * @return The archiveBytes
   */
  public Long getArchiveBytes () {
    return archiveBytes;
  }

  /**
   * @param archiveBytes The archiveBytes
   */
  public void setArchiveBytes (Long archiveBytes) {
    this.archiveBytes = archiveBytes;
  }

  /**
   * @return The billableBytes
   */
  public Long getBillableBytes () {
    return billableBytes;
  }

  /**
   * @param billableBytes The billableBytes
   */
  public void setBillableBytes (Long billableBytes) {
    this.billableBytes = billableBytes;
  }

  /**
   * @return The sendRateAverage
   */
  public Integer getSendRateAverage () {
    return sendRateAverage;
  }

  /**
   * @param sendRateAverage The sendRateAverage
   */
  public void setSendRateAverage (Integer sendRateAverage) {
    this.sendRateAverage = sendRateAverage;
  }

  /**
   * @return The completionRateAverage
   */
  public Integer getCompletionRateAverage () {
    return completionRateAverage;
  }

  /**
   * @param completionRateAverage The completionRateAverage
   */
  public void setCompletionRateAverage (Integer completionRateAverage) {
    this.completionRateAverage = completionRateAverage;
  }

  /**
   * @return The lastBackup
   */
  public String getLastBackup () {
    return lastBackup;
  }

  /**
   * @param lastBackup The lastBackup
   */
  public void setLastBackup (String lastBackup) {
    this.lastBackup = lastBackup;
  }

  /**
   * @return The lastCompletedBackup
   */
  public String getLastCompletedBackup () {
    return lastCompletedBackup;
  }

  /**
   * @param lastCompletedBackup The lastCompletedBackup
   */
  public void setLastCompletedBackup (String lastCompletedBackup) {
    this.lastCompletedBackup = lastCompletedBackup;
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
   * @return The lastMaintenanceDate
   */
  public String getLastMaintenanceDate () {
    return lastMaintenanceDate;
  }

  /**
   * @param lastMaintenanceDate The lastMaintenanceDate
   */
  public void setLastMaintenanceDate (String lastMaintenanceDate) {
    this.lastMaintenanceDate = lastMaintenanceDate;
  }

  /**
   * @return The lastCompactDate
   */
  public Object getLastCompactDate () {
    return lastCompactDate;
  }

  /**
   * @param lastCompactDate The lastCompactDate
   */
  public void setLastCompactDate (Object lastCompactDate) {
    this.lastCompactDate = lastCompactDate;
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
   * @return The using
   */
  public Boolean getUsing () {
    return using;
  }

  /**
   * @param using The using
   */
  public void setUsing (Boolean using) {
    this.using = using;
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
   * @return The percentComplete
   */
  public Double getPercentComplete () {
    return percentComplete;
  }

  /**
   * @param percentComplete The percentComplete
   */
  public void setPercentComplete (Double percentComplete) {
    this.percentComplete = percentComplete;
  }

  /**
   * @return The storePointId
   */
  public Integer getStorePointId () {
    return storePointId;
  }

  /**
   * @param storePointId The storePointId
   */
  public void setStorePointId (Integer storePointId) {
    this.storePointId = storePointId;
  }

  /**
   * @return The storePointName
   */
  public String getStorePointName () {
    return storePointName;
  }

  /**
   * @param storePointName The storePointName
   */
  public void setStorePointName (String storePointName) {
    this.storePointName = storePointName;
  }

  /**
   * @return The serverId
   */
  public Integer getServerId () {
    return serverId;
  }

  /**
   * @param serverId The serverId
   */
  public void setServerId (Integer serverId) {
    this.serverId = serverId;
  }

  /**
   * @return The serverGuid
   */
  public String getServerGuid () {
    return serverGuid;
  }

  /**
   * @param serverGuid The serverGuid
   */
  public void setServerGuid (String serverGuid) {
    this.serverGuid = serverGuid;
  }

  /**
   * @return The serverName
   */
  public String getServerName () {
    return serverName;
  }

  /**
   * @param serverName The serverName
   */
  public void setServerName (String serverName) {
    this.serverName = serverName;
  }

  /**
   * @return The serverHostName
   */
  public String getServerHostName () {
    return serverHostName;
  }

  /**
   * @param serverHostName The serverHostName
   */
  public void setServerHostName (String serverHostName) {
    this.serverHostName = serverHostName;
  }

  /**
   * @return The isProvider
   */
  public Boolean getIsProvider () {
    return isProvider;
  }

  /**
   * @param isProvider The isProvider
   */
  public void setIsProvider (Boolean isProvider) {
    this.isProvider = isProvider;
  }

  /**
   * @return The archiveGuid
   */
  public String getArchiveGuid () {
    return archiveGuid;
  }

  /**
   * @param archiveGuid The archiveGuid
   */
  public void setArchiveGuid (String archiveGuid) {
    this.archiveGuid = archiveGuid;
  }

  /**
   * @return The archiveFormat
   */
  public String getArchiveFormat () {
    return archiveFormat;
  }

  /**
   * @param archiveFormat The archiveFormat
   */
  public void setArchiveFormat (String archiveFormat) {
    this.archiveFormat = archiveFormat;
  }

  @Override
  public String toString () {
    return ToStringBuilder.reflectionToString(this);
  }

  @Override
  public int hashCode () {
    return new HashCodeBuilder().append(targetComputerId).append(targetComputerParentId).append(targetComputerParentGuid).append(targetComputerGuid).append(targetComputerName).append(targetComputerOsName).append(targetComputerType).append(selectedFiles).append(selectedBytes).append(todoFiles).append(todoBytes).append(archiveBytes).append(billableBytes).append(sendRateAverage).append(completionRateAverage).append(lastBackup).append(lastCompletedBackup).append(lastConnected).append(lastMaintenanceDate).append(lastCompactDate).append(modificationDate).append(creationDate).append(using).append(alertState).append(alertStates).append(percentComplete).append(storePointId).append(storePointName).append(serverId).append(serverGuid).append(serverName).append(serverHostName).append(isProvider).append(archiveGuid).append(archiveFormat).toHashCode();
  }

  @Override
  public boolean equals (Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof BackupUsage) == false) {
      return false;
    }
    BackupUsage rhs = ((BackupUsage) other);
    return new EqualsBuilder().append(targetComputerId, rhs.targetComputerId).append(targetComputerParentId, rhs.targetComputerParentId).append(targetComputerParentGuid, rhs.targetComputerParentGuid).append(targetComputerGuid, rhs.targetComputerGuid).append(targetComputerName, rhs.targetComputerName).append(targetComputerOsName, rhs.targetComputerOsName).append(targetComputerType, rhs.targetComputerType).append(selectedFiles, rhs.selectedFiles).append(selectedBytes, rhs.selectedBytes).append(todoFiles, rhs.todoFiles).append(todoBytes, rhs.todoBytes).append(archiveBytes, rhs.archiveBytes).append(billableBytes, rhs.billableBytes).append(sendRateAverage, rhs.sendRateAverage).append(completionRateAverage, rhs.completionRateAverage).append(lastBackup, rhs.lastBackup).append(lastCompletedBackup, rhs.lastCompletedBackup).append(lastConnected, rhs.lastConnected).append(lastMaintenanceDate, rhs.lastMaintenanceDate).append(lastCompactDate, rhs.lastCompactDate).append(modificationDate, rhs.modificationDate).append(creationDate, rhs.creationDate).append(using, rhs.using).append(alertState, rhs.alertState).append(alertStates, rhs.alertStates).append(percentComplete, rhs.percentComplete).append(storePointId, rhs.storePointId).append(storePointName, rhs.storePointName).append(serverId, rhs.serverId).append(serverGuid, rhs.serverGuid).append(serverName, rhs.serverName).append(serverHostName, rhs.serverHostName).append(isProvider, rhs.isProvider).append(archiveGuid, rhs.archiveGuid).append(archiveFormat, rhs.archiveFormat).isEquals();
  }

}
