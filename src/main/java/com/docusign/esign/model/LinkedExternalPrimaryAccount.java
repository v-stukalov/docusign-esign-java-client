package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * LinkedExternalPrimaryAccount
 */

public class LinkedExternalPrimaryAccount {
  @JsonProperty("accountName")
  private String accountName = null;

  @JsonProperty("configurationId")
  private String configurationId = null;

  @JsonProperty("email")
  private String email = null;

  @JsonProperty("linkId")
  private String linkId = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("userId")
  private String userId = null;

  public LinkedExternalPrimaryAccount accountName(String accountName) {
    this.accountName = accountName;
    return this;
  }

   /**
   * 
   * @return accountName
  **/
  @ApiModelProperty(value = "")
  public String getAccountName() {
    return accountName;
  }

  public void setAccountName(String accountName) {
    this.accountName = accountName;
  }

  public LinkedExternalPrimaryAccount configurationId(String configurationId) {
    this.configurationId = configurationId;
    return this;
  }

   /**
   * 
   * @return configurationId
  **/
  @ApiModelProperty(value = "")
  public String getConfigurationId() {
    return configurationId;
  }

  public void setConfigurationId(String configurationId) {
    this.configurationId = configurationId;
  }

  public LinkedExternalPrimaryAccount email(String email) {
    this.email = email;
    return this;
  }

   /**
   * 
   * @return email
  **/
  @ApiModelProperty(value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public LinkedExternalPrimaryAccount linkId(String linkId) {
    this.linkId = linkId;
    return this;
  }

   /**
   * 
   * @return linkId
  **/
  @ApiModelProperty(value = "")
  public String getLinkId() {
    return linkId;
  }

  public void setLinkId(String linkId) {
    this.linkId = linkId;
  }

  public LinkedExternalPrimaryAccount status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.
   * @return status
  **/
  @ApiModelProperty(value = "Indicates the envelope status. Valid values are:  * sent - The envelope is sent to the recipients.  * created - The envelope is saved as a draft and can be modified and sent later.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public LinkedExternalPrimaryAccount userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * 
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkedExternalPrimaryAccount linkedExternalPrimaryAccount = (LinkedExternalPrimaryAccount) o;
    return Objects.equals(this.accountName, linkedExternalPrimaryAccount.accountName) &&
        Objects.equals(this.configurationId, linkedExternalPrimaryAccount.configurationId) &&
        Objects.equals(this.email, linkedExternalPrimaryAccount.email) &&
        Objects.equals(this.linkId, linkedExternalPrimaryAccount.linkId) &&
        Objects.equals(this.status, linkedExternalPrimaryAccount.status) &&
        Objects.equals(this.userId, linkedExternalPrimaryAccount.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountName, configurationId, email, linkId, status, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkedExternalPrimaryAccount {\n");
    
    sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
    sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    linkId: ").append(toIndentedString(linkId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

