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
public class Data {

  @SerializedName("computers")
  @Expose
  private List<Computer> computers = new ArrayList<Computer>();

  /**
   * No args constructor for use in serialization
   */
  public Data () {
  }

  /**
   * @param computers
   */
  public Data (List<Computer> computers) {
    this.computers = computers;
  }

  /**
   * @return The computers
   */
  public List<Computer> getComputers () {
    return computers;
  }

  /**
   * @param computers The computers
   */
  public void setComputers (List<Computer> computers) {
    this.computers = computers;
  }

  @Override
  public String toString () {
    return ToStringBuilder.reflectionToString(this);
  }

  @Override
  public int hashCode () {
    return new HashCodeBuilder().append(computers).toHashCode();
  }

  @Override
  public boolean equals (Object other) {
    if (other == this) {
      return true;
    }
    if ((other instanceof Data) == false) {
      return false;
    }
    Data rhs = ((Data) other);
    return new EqualsBuilder().append(computers, rhs.computers).isEquals();
  }

}
