package com.datafaber.crashplan;

import org.joda.time.DateTime;

/**
 * Used for displaying the backup usage data for a computer and a target
 */
public class ComputerTargetData {

  private String mTargetName;
  private String mComputerName;
  private DateTime mLastConnected;
  private DateTime mLastBackup;
  private DateTime mLastCompletedBackup;
  private String mPercentComplete;
  private Long mSelectedFiles;
  private String mSelectedBytes;
  private Long mRemainingFiles;
  private String mRemainingBytes;

  public ComputerTargetData (String pTargetName, String pComputerName, DateTime pLastConnected, DateTime pLastBackup, DateTime pLastCompletedBackup, String pPercentComplete, Long pSelectedFiles, String pSelectedBytes, Long pRemainingFiles, String pRemainingBytes) {
    mTargetName = pTargetName;
    mComputerName = pComputerName;
    mLastConnected = pLastConnected;
    mLastBackup = pLastBackup;
    mLastCompletedBackup = pLastCompletedBackup;
    mPercentComplete = pPercentComplete;
    mSelectedFiles = pSelectedFiles;
    mSelectedBytes = pSelectedBytes;
    mRemainingFiles = pRemainingFiles;
    mRemainingBytes = pRemainingBytes;
  }

  public String getTargetName () {
    return mTargetName;
  }

  public String getComputerName () {
    return mComputerName;
  }

  public DateTime getLastConnected () {
    return mLastConnected;
  }

  public DateTime getLastBackup () {
    return mLastBackup;
  }

  public DateTime getLastCompletedBackup () {
    return mLastCompletedBackup;
  }

  public String getPercentComplete () {
    return mPercentComplete;
  }

  public Long getSelectedFiles () {
    return mSelectedFiles;
  }

  public String getSelectedBytes () {
    return mSelectedBytes;
  }

  public Long getRemainingFiles () {
    return mRemainingFiles;
  }

  public String getRemainingBytes () {
    return mRemainingBytes;
  }
}
