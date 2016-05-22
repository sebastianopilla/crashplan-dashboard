package com.datafaber.crashplan;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")
public class Metadata {

  @SerializedName("timestamp")
  @Expose
  private String timestamp;
  @SerializedName("params")
  @Expose
  private Params params;

  /**
   * No args constructor for use in serialization
   */
  public Metadata () {
  }

  /**
   * @param timestamp
   * @param params
   */
  public Metadata (String timestamp, Params params) {
    this.timestamp = timestamp;
    this.params = params;
  }

  /**
   * @return The timestamp
   */
  public String getTimestamp () {
    return timestamp;
  }

  /**
   * @param timestamp The timestamp
   */
  public void setTimestamp (String timestamp) {
    this.timestamp = timestamp;
  }

  /**
   * @return The params
   */
  public Params getParams () {
    return params;
  }

  /**
   * @param params The params
   */
  public void setParams (Params params) {
    this.params = params;
  }

  @Override
  public String toString () {
    return ToStringBuilder.reflectionToString(this);
  }

  @Override
  public int hashCode () {
    return new HashCodeBuilder().append(timestamp).append(params).toHashCode();
  }

  @Override
  public boolean equals (Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof Metadata) == false) {
      return false;
    }
    Metadata rhs = ((Metadata) other);
    return new EqualsBuilder().append(timestamp, rhs.timestamp).append(params, rhs.params).isEquals();
  }

}
