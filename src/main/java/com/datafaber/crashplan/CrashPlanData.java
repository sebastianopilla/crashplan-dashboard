package com.datafaber.crashplan;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class CrashPlanData {

  @SerializedName("metadata")
  @Expose
  private Metadata metadata;
  @SerializedName("data")
  @Expose
  private Data data;

  /**
   * No args constructor for use in serialization
   */
  public CrashPlanData () {
  }

  /**
   * @param data
   * @param metadata
   */
  public CrashPlanData (Metadata metadata, Data data) {
    this.metadata = metadata;
    this.data = data;
  }

  /**
   * @return The metadata
   */
  public Metadata getMetadata () {
    return metadata;
  }

  /**
   * @param metadata The metadata
   */
  public void setMetadata (Metadata metadata) {
    this.metadata = metadata;
  }

  /**
   * @return The data
   */
  public Data getData () {
    return data;
  }

  /**
   * @param data The data
   */
  public void setData (Data data) {
    this.data = data;
  }

  @Override
  public String toString () {
    return ToStringBuilder.reflectionToString(this);
  }

  @Override
  public int hashCode () {
    return new HashCodeBuilder().append(metadata).append(data).toHashCode();
  }

  @Override
  public boolean equals (Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof CrashPlanData) == false) {
      return false;
    }
    CrashPlanData rhs = ((CrashPlanData) other);
    return new EqualsBuilder().append(metadata, rhs.metadata).append(data, rhs.data).isEquals();
  }

}
