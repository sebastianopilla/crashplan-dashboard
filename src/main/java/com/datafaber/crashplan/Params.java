package com.datafaber.crashplan;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Params {

  @SerializedName("incBackupUsage")
  @Expose
  private String incBackupUsage;
  @SerializedName("active")
  @Expose
  private String active;

  /**
   * No args constructor for use in serialization
   */
  public Params () {
  }

  /**
   * @param incBackupUsage
   * @param active
   */
  public Params (String incBackupUsage, String active) {
    this.incBackupUsage = incBackupUsage;
    this.active = active;
  }

  /**
   * @return The incBackupUsage
   */
  public String getIncBackupUsage () {
    return incBackupUsage;
  }

  /**
   * @param incBackupUsage The incBackupUsage
   */
  public void setIncBackupUsage (String incBackupUsage) {
    this.incBackupUsage = incBackupUsage;
  }

  /**
   * @return The active
   */
  public String getActive () {
    return active;
  }

  /**
   * @param active The active
   */
  public void setActive (String active) {
    this.active = active;
  }

  @Override
  public String toString () {
    return ToStringBuilder.reflectionToString(this);
  }

  @Override
  public int hashCode () {
    return new HashCodeBuilder().append(incBackupUsage).append(active).toHashCode();
  }

  @Override
  public boolean equals (Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof Params) == false) {
      return false;
    }
    Params rhs = ((Params) other);
    return new EqualsBuilder().append(incBackupUsage, rhs.incBackupUsage).append(active, rhs.active).isEquals();
  }

}
