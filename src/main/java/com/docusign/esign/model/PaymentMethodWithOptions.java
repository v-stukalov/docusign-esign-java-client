package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * PaymentMethodWithOptions
 */

public class PaymentMethodWithOptions {
  @JsonProperty("supportedCurrencies")
  private java.util.List<String> supportedCurrencies = null;

  @JsonProperty("supportedOptions")
  private java.util.List<String> supportedOptions = null;

  @JsonProperty("type")
  private String type = null;

  public PaymentMethodWithOptions supportedCurrencies(java.util.List<String> supportedCurrencies) {
    this.supportedCurrencies = supportedCurrencies;
    return this;
  }

  public PaymentMethodWithOptions addSupportedCurrenciesItem(String supportedCurrenciesItem) {
    if (this.supportedCurrencies == null) {
      this.supportedCurrencies = new java.util.ArrayList<String>();
    }
    this.supportedCurrencies.add(supportedCurrenciesItem);
    return this;
  }

   /**
   * 
   * @return supportedCurrencies
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getSupportedCurrencies() {
    return supportedCurrencies;
  }

  public void setSupportedCurrencies(java.util.List<String> supportedCurrencies) {
    this.supportedCurrencies = supportedCurrencies;
  }

  public PaymentMethodWithOptions supportedOptions(java.util.List<String> supportedOptions) {
    this.supportedOptions = supportedOptions;
    return this;
  }

  public PaymentMethodWithOptions addSupportedOptionsItem(String supportedOptionsItem) {
    if (this.supportedOptions == null) {
      this.supportedOptions = new java.util.ArrayList<String>();
    }
    this.supportedOptions.add(supportedOptionsItem);
    return this;
  }

   /**
   * 
   * @return supportedOptions
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getSupportedOptions() {
    return supportedOptions;
  }

  public void setSupportedOptions(java.util.List<String> supportedOptions) {
    this.supportedOptions = supportedOptions;
  }

  public PaymentMethodWithOptions type(String type) {
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodWithOptions paymentMethodWithOptions = (PaymentMethodWithOptions) o;
    return Objects.equals(this.supportedCurrencies, paymentMethodWithOptions.supportedCurrencies) &&
        Objects.equals(this.supportedOptions, paymentMethodWithOptions.supportedOptions) &&
        Objects.equals(this.type, paymentMethodWithOptions.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedCurrencies, supportedOptions, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodWithOptions {\n");
    
    sb.append("    supportedCurrencies: ").append(toIndentedString(supportedCurrencies)).append("\n");
    sb.append("    supportedOptions: ").append(toIndentedString(supportedOptions)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

