package com.docusign.esign.model;

import java.util.Objects;
import java.util.Arrays;
import com.docusign.esign.model.ErrorDetails;
import com.docusign.esign.model.MergeField;
import com.docusign.esign.model.PaymentDetails;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * FormulaTab
 */

public class FormulaTab {
  @JsonProperty("anchorCaseSensitive")
  private String anchorCaseSensitive = null;

  @JsonProperty("anchorHorizontalAlignment")
  private String anchorHorizontalAlignment = null;

  @JsonProperty("anchorIgnoreIfNotPresent")
  private String anchorIgnoreIfNotPresent = null;

  @JsonProperty("anchorMatchWholeWord")
  private String anchorMatchWholeWord = null;

  @JsonProperty("anchorString")
  private String anchorString = null;

  @JsonProperty("anchorUnits")
  private String anchorUnits = null;

  @JsonProperty("anchorXOffset")
  private String anchorXOffset = null;

  @JsonProperty("anchorYOffset")
  private String anchorYOffset = null;

  @JsonProperty("bold")
  private String bold = null;

  @JsonProperty("concealValueOnDocument")
  private String concealValueOnDocument = null;

  @JsonProperty("conditionalParentLabel")
  private String conditionalParentLabel = null;

  @JsonProperty("conditionalParentValue")
  private String conditionalParentValue = null;

  @JsonProperty("customTabId")
  private String customTabId = null;

  @JsonProperty("disableAutoSize")
  private String disableAutoSize = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("errorDetails")
  private ErrorDetails errorDetails = null;

  @JsonProperty("font")
  private String font = null;

  @JsonProperty("fontColor")
  private String fontColor = null;

  @JsonProperty("fontSize")
  private String fontSize = null;

  @JsonProperty("formula")
  private String formula = null;

  @JsonProperty("hidden")
  private String hidden = null;

  @JsonProperty("isPaymentAmount")
  private String isPaymentAmount = null;

  @JsonProperty("italic")
  private String italic = null;

  @JsonProperty("locked")
  private String locked = null;

  @JsonProperty("maxLength")
  private Integer maxLength = null;

  @JsonProperty("mergeField")
  private MergeField mergeField = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("originalValue")
  private String originalValue = null;

  @JsonProperty("pageNumber")
  private String pageNumber = null;

  @JsonProperty("paymentDetails")
  private PaymentDetails paymentDetails = null;

  @JsonProperty("recipientId")
  private String recipientId = null;

  @JsonProperty("requireAll")
  private String requireAll = null;

  @JsonProperty("required")
  private String required = null;

  @JsonProperty("requireInitialOnSharedChange")
  private String requireInitialOnSharedChange = null;

  @JsonProperty("roundDecimalPlaces")
  private String roundDecimalPlaces = null;

  @JsonProperty("senderRequired")
  private String senderRequired = null;

  @JsonProperty("shared")
  private String shared = null;

  @JsonProperty("status")
  private String status = null;

  @JsonProperty("tabGroupLabels")
  private java.util.List<String> tabGroupLabels = null;

  @JsonProperty("tabId")
  private String tabId = null;

  @JsonProperty("tabLabel")
  private String tabLabel = null;

  @JsonProperty("tabOrder")
  private String tabOrder = null;

  @JsonProperty("templateLocked")
  private String templateLocked = null;

  @JsonProperty("templateRequired")
  private String templateRequired = null;

  @JsonProperty("tooltip")
  private String tooltip = null;

  @JsonProperty("underline")
  private String underline = null;

  @JsonProperty("validationMessage")
  private String validationMessage = null;

  @JsonProperty("validationPattern")
  private String validationPattern = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("width")
  private Integer width = null;

  @JsonProperty("xPosition")
  private String xPosition = null;

  @JsonProperty("yPosition")
  private String yPosition = null;

  public FormulaTab anchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
    return this;
  }

   /**
   * When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.
   * @return anchorCaseSensitive
  **/
  @ApiModelProperty(value = "When set to **true**, the anchor string does not consider case when matching strings in the document. The default value is **true**.")
  public String getAnchorCaseSensitive() {
    return anchorCaseSensitive;
  }

  public void setAnchorCaseSensitive(String anchorCaseSensitive) {
    this.anchorCaseSensitive = anchorCaseSensitive;
  }

  public FormulaTab anchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
    return this;
  }

   /**
   * Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.
   * @return anchorHorizontalAlignment
  **/
  @ApiModelProperty(value = "Specifies the alignment of anchor tabs with anchor strings. Possible values are **left** or **right**. The default value is **left**.")
  public String getAnchorHorizontalAlignment() {
    return anchorHorizontalAlignment;
  }

  public void setAnchorHorizontalAlignment(String anchorHorizontalAlignment) {
    this.anchorHorizontalAlignment = anchorHorizontalAlignment;
  }

  public FormulaTab anchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
    return this;
  }

   /**
   * When set to **true**, this tab is ignored if anchorString is not found in the document.
   * @return anchorIgnoreIfNotPresent
  **/
  @ApiModelProperty(value = "When set to **true**, this tab is ignored if anchorString is not found in the document.")
  public String getAnchorIgnoreIfNotPresent() {
    return anchorIgnoreIfNotPresent;
  }

  public void setAnchorIgnoreIfNotPresent(String anchorIgnoreIfNotPresent) {
    this.anchorIgnoreIfNotPresent = anchorIgnoreIfNotPresent;
  }

  public FormulaTab anchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
    return this;
  }

   /**
   * When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.
   * @return anchorMatchWholeWord
  **/
  @ApiModelProperty(value = "When set to **true**, the anchor string in this tab matches whole words only (strings embedded in other strings are ignored.) The default value is **true**.")
  public String getAnchorMatchWholeWord() {
    return anchorMatchWholeWord;
  }

  public void setAnchorMatchWholeWord(String anchorMatchWholeWord) {
    this.anchorMatchWholeWord = anchorMatchWholeWord;
  }

  public FormulaTab anchorString(String anchorString) {
    this.anchorString = anchorString;
    return this;
  }

   /**
   * Anchor text information for a radio button.
   * @return anchorString
  **/
  @ApiModelProperty(value = "Anchor text information for a radio button.")
  public String getAnchorString() {
    return anchorString;
  }

  public void setAnchorString(String anchorString) {
    this.anchorString = anchorString;
  }

  public FormulaTab anchorUnits(String anchorUnits) {
    this.anchorUnits = anchorUnits;
    return this;
  }

   /**
   * Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.
   * @return anchorUnits
  **/
  @ApiModelProperty(value = "Specifies units of the X and Y offset. Units could be pixels, millimeters, centimeters, or inches.")
  public String getAnchorUnits() {
    return anchorUnits;
  }

  public void setAnchorUnits(String anchorUnits) {
    this.anchorUnits = anchorUnits;
  }

  public FormulaTab anchorXOffset(String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
    return this;
  }

   /**
   * Specifies the X axis location of the tab, in anchorUnits, relative to the anchorString.
   * @return anchorXOffset
  **/
  @ApiModelProperty(value = "Specifies the X axis location of the tab, in anchorUnits, relative to the anchorString.")
  public String getAnchorXOffset() {
    return anchorXOffset;
  }

  public void setAnchorXOffset(String anchorXOffset) {
    this.anchorXOffset = anchorXOffset;
  }

  public FormulaTab anchorYOffset(String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
    return this;
  }

   /**
   * Specifies the Y axis location of the tab, in anchorUnits, relative to the anchorString.
   * @return anchorYOffset
  **/
  @ApiModelProperty(value = "Specifies the Y axis location of the tab, in anchorUnits, relative to the anchorString.")
  public String getAnchorYOffset() {
    return anchorYOffset;
  }

  public void setAnchorYOffset(String anchorYOffset) {
    this.anchorYOffset = anchorYOffset;
  }

  public FormulaTab bold(String bold) {
    this.bold = bold;
    return this;
  }

   /**
   * When set to **true**, the information in the tab is bold.
   * @return bold
  **/
  @ApiModelProperty(value = "When set to **true**, the information in the tab is bold.")
  public String getBold() {
    return bold;
  }

  public void setBold(String bold) {
    this.bold = bold;
  }

  public FormulaTab concealValueOnDocument(String concealValueOnDocument) {
    this.concealValueOnDocument = concealValueOnDocument;
    return this;
  }

   /**
   * When set to **true**, the field appears normally while the recipient is adding or modifying the information in the field, but the data is not visible (the characters are hidden by asterisks) to any other signer or the sender.  When an envelope is completed the information is available to the sender through the Form Data link in the DocuSign Console.  This setting applies only to text boxes and does not affect list boxes, radio buttons, or check boxes.
   * @return concealValueOnDocument
  **/
  @ApiModelProperty(value = "When set to **true**, the field appears normally while the recipient is adding or modifying the information in the field, but the data is not visible (the characters are hidden by asterisks) to any other signer or the sender.  When an envelope is completed the information is available to the sender through the Form Data link in the DocuSign Console.  This setting applies only to text boxes and does not affect list boxes, radio buttons, or check boxes.")
  public String getConcealValueOnDocument() {
    return concealValueOnDocument;
  }

  public void setConcealValueOnDocument(String concealValueOnDocument) {
    this.concealValueOnDocument = concealValueOnDocument;
  }

  public FormulaTab conditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
    return this;
  }

   /**
   * For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.
   * @return conditionalParentLabel
  **/
  @ApiModelProperty(value = "For conditional fields this is the TabLabel of the parent tab that controls this tab's visibility.")
  public String getConditionalParentLabel() {
    return conditionalParentLabel;
  }

  public void setConditionalParentLabel(String conditionalParentLabel) {
    this.conditionalParentLabel = conditionalParentLabel;
  }

  public FormulaTab conditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
    return this;
  }

   /**
   * For conditional fields, this is the value of the parent tab that controls the tab's visibility.  If the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active. 
   * @return conditionalParentValue
  **/
  @ApiModelProperty(value = "For conditional fields, this is the value of the parent tab that controls the tab's visibility.  If the parent tab is a Checkbox, Radio button, Optional Signature, or Optional Initial use \"on\" as the value to show that the parent tab is active. ")
  public String getConditionalParentValue() {
    return conditionalParentValue;
  }

  public void setConditionalParentValue(String conditionalParentValue) {
    this.conditionalParentValue = conditionalParentValue;
  }

  public FormulaTab customTabId(String customTabId) {
    this.customTabId = customTabId;
    return this;
  }

   /**
   * The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.
   * @return customTabId
  **/
  @ApiModelProperty(value = "The DocuSign generated custom tab ID for the custom tab to be applied. This can only be used when adding new tabs for a recipient. When used, the new tab inherits all the custom tab properties.")
  public String getCustomTabId() {
    return customTabId;
  }

  public void setCustomTabId(String customTabId) {
    this.customTabId = customTabId;
  }

  public FormulaTab disableAutoSize(String disableAutoSize) {
    this.disableAutoSize = disableAutoSize;
    return this;
  }

   /**
   * When set to **true**, disables the auto sizing of single line text boxes in the signing screen when the signer enters data. If disabled users will only be able enter as much data as the text box can hold. By default this is false. This property only affects single line text boxes.
   * @return disableAutoSize
  **/
  @ApiModelProperty(value = "When set to **true**, disables the auto sizing of single line text boxes in the signing screen when the signer enters data. If disabled users will only be able enter as much data as the text box can hold. By default this is false. This property only affects single line text boxes.")
  public String getDisableAutoSize() {
    return disableAutoSize;
  }

  public void setDisableAutoSize(String disableAutoSize) {
    this.disableAutoSize = disableAutoSize;
  }

  public FormulaTab documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.
   * @return documentId
  **/
  @ApiModelProperty(value = "Specifies the document ID number that the tab is placed on. This must refer to an existing Document's ID attribute.")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public FormulaTab errorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Get errorDetails
   * @return errorDetails
  **/
  @ApiModelProperty(value = "")
  public ErrorDetails getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(ErrorDetails errorDetails) {
    this.errorDetails = errorDetails;
  }

  public FormulaTab font(String font) {
    this.font = font;
    return this;
  }

   /**
   * The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default.
   * @return font
  **/
  @ApiModelProperty(value = "The font to be used for the tab value. Supported Fonts: Arial, Arial, ArialNarrow, Calibri, CourierNew, Garamond, Georgia, Helvetica,   LucidaConsole, Tahoma, TimesNewRoman, Trebuchet, Verdana, MSGothic, MSMincho, Default.")
  public String getFont() {
    return font;
  }

  public void setFont(String font) {
    this.font = font;
  }

  public FormulaTab fontColor(String fontColor) {
    this.fontColor = fontColor;
    return this;
  }

   /**
   * The font color used for the information in the tab.  Possible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White.
   * @return fontColor
  **/
  @ApiModelProperty(value = "The font color used for the information in the tab.  Possible values are: Black, BrightBlue, BrightRed, DarkGreen, DarkRed, Gold, Green, NavyBlue, Purple, or White.")
  public String getFontColor() {
    return fontColor;
  }

  public void setFontColor(String fontColor) {
    this.fontColor = fontColor;
  }

  public FormulaTab fontSize(String fontSize) {
    this.fontSize = fontSize;
    return this;
  }

   /**
   * The font size used for the information in the tab.  Possible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72.
   * @return fontSize
  **/
  @ApiModelProperty(value = "The font size used for the information in the tab.  Possible values are: Size7, Size8, Size9, Size10, Size11, Size12, Size14, Size16, Size18, Size20, Size22, Size24, Size26, Size28, Size36, Size48, or Size72.")
  public String getFontSize() {
    return fontSize;
  }

  public void setFontSize(String fontSize) {
    this.fontSize = fontSize;
  }

  public FormulaTab formula(String formula) {
    this.formula = formula;
    return this;
  }

   /**
   * The Formula string contains the TabLabel for the reference tabs used in the formula and calculation operators. Each TabLabel must be contained in brackets.  Maximum Length: 2000 characters.  *Example*: Three tabs (TabLabels: Line1, Line2, and Tax) need to be added together. The formula string would be:   [Line1]+[Line2]+[Tax]
   * @return formula
  **/
  @ApiModelProperty(value = "The Formula string contains the TabLabel for the reference tabs used in the formula and calculation operators. Each TabLabel must be contained in brackets.  Maximum Length: 2000 characters.  *Example*: Three tabs (TabLabels: Line1, Line2, and Tax) need to be added together. The formula string would be:   [Line1]+[Line2]+[Tax]")
  public String getFormula() {
    return formula;
  }

  public void setFormula(String formula) {
    this.formula = formula;
  }

  public FormulaTab hidden(String hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * 
   * @return hidden
  **/
  @ApiModelProperty(value = "")
  public String getHidden() {
    return hidden;
  }

  public void setHidden(String hidden) {
    this.hidden = hidden;
  }

  public FormulaTab isPaymentAmount(String isPaymentAmount) {
    this.isPaymentAmount = isPaymentAmount;
    return this;
  }

   /**
   * When set to **true**, sets this as a payment tab. Can only be used with Text, Number, Formula, or List tabs. The value of the tab must be a number. 
   * @return isPaymentAmount
  **/
  @ApiModelProperty(value = "When set to **true**, sets this as a payment tab. Can only be used with Text, Number, Formula, or List tabs. The value of the tab must be a number. ")
  public String getIsPaymentAmount() {
    return isPaymentAmount;
  }

  public void setIsPaymentAmount(String isPaymentAmount) {
    this.isPaymentAmount = isPaymentAmount;
  }

  public FormulaTab italic(String italic) {
    this.italic = italic;
    return this;
  }

   /**
   * When set to **true**, the information in the tab is italic.
   * @return italic
  **/
  @ApiModelProperty(value = "When set to **true**, the information in the tab is italic.")
  public String getItalic() {
    return italic;
  }

  public void setItalic(String italic) {
    this.italic = italic;
  }

  public FormulaTab locked(String locked) {
    this.locked = locked;
    return this;
  }

   /**
   * When set to **true**, the signer cannot change the data of the custom tab.
   * @return locked
  **/
  @ApiModelProperty(value = "When set to **true**, the signer cannot change the data of the custom tab.")
  public String getLocked() {
    return locked;
  }

  public void setLocked(String locked) {
    this.locked = locked;
  }

  public FormulaTab maxLength(Integer maxLength) {
    this.maxLength = maxLength;
    return this;
  }

   /**
   * An optional value that describes the maximum length of the property when the property is a string.
   * @return maxLength
  **/
  @ApiModelProperty(value = "An optional value that describes the maximum length of the property when the property is a string.")
  public Integer getMaxLength() {
    return maxLength;
  }

  public void setMaxLength(Integer maxLength) {
    this.maxLength = maxLength;
  }

  public FormulaTab mergeField(MergeField mergeField) {
    this.mergeField = mergeField;
    return this;
  }

   /**
   * Get mergeField
   * @return mergeField
  **/
  @ApiModelProperty(value = "")
  public MergeField getMergeField() {
    return mergeField;
  }

  public void setMergeField(MergeField mergeField) {
    this.mergeField = mergeField;
  }

  public FormulaTab name(String name) {
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FormulaTab originalValue(String originalValue) {
    this.originalValue = originalValue;
    return this;
  }

   /**
   * The initial value of the tab when it was sent to the recipient. 
   * @return originalValue
  **/
  @ApiModelProperty(value = "The initial value of the tab when it was sent to the recipient. ")
  public String getOriginalValue() {
    return originalValue;
  }

  public void setOriginalValue(String originalValue) {
    this.originalValue = originalValue;
  }

  public FormulaTab pageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }

   /**
   * Specifies the page number on which the tab is located.
   * @return pageNumber
  **/
  @ApiModelProperty(value = "Specifies the page number on which the tab is located.")
  public String getPageNumber() {
    return pageNumber;
  }

  public void setPageNumber(String pageNumber) {
    this.pageNumber = pageNumber;
  }

  public FormulaTab paymentDetails(PaymentDetails paymentDetails) {
    this.paymentDetails = paymentDetails;
    return this;
  }

   /**
   * Get paymentDetails
   * @return paymentDetails
  **/
  @ApiModelProperty(value = "")
  public PaymentDetails getPaymentDetails() {
    return paymentDetails;
  }

  public void setPaymentDetails(PaymentDetails paymentDetails) {
    this.paymentDetails = paymentDetails;
  }

  public FormulaTab recipientId(String recipientId) {
    this.recipientId = recipientId;
    return this;
  }

   /**
   * Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.
   * @return recipientId
  **/
  @ApiModelProperty(value = "Unique for the recipient. It is used by the tab element to indicate which recipient is to sign the Document.")
  public String getRecipientId() {
    return recipientId;
  }

  public void setRecipientId(String recipientId) {
    this.recipientId = recipientId;
  }

  public FormulaTab requireAll(String requireAll) {
    this.requireAll = requireAll;
    return this;
  }

   /**
   * When set to **true** and shared is true, information must be entered in this field to complete the envelope. 
   * @return requireAll
  **/
  @ApiModelProperty(value = "When set to **true** and shared is true, information must be entered in this field to complete the envelope. ")
  public String getRequireAll() {
    return requireAll;
  }

  public void setRequireAll(String requireAll) {
    this.requireAll = requireAll;
  }

  public FormulaTab required(String required) {
    this.required = required;
    return this;
  }

   /**
   * When set to **true**, the signer is required to fill out this tab
   * @return required
  **/
  @ApiModelProperty(value = "When set to **true**, the signer is required to fill out this tab")
  public String getRequired() {
    return required;
  }

  public void setRequired(String required) {
    this.required = required;
  }

  public FormulaTab requireInitialOnSharedChange(String requireInitialOnSharedChange) {
    this.requireInitialOnSharedChange = requireInitialOnSharedChange;
    return this;
  }

   /**
   * Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.
   * @return requireInitialOnSharedChange
  **/
  @ApiModelProperty(value = "Optional element for field markup. When set to **true**, the signer is required to initial when they modify a shared field.")
  public String getRequireInitialOnSharedChange() {
    return requireInitialOnSharedChange;
  }

  public void setRequireInitialOnSharedChange(String requireInitialOnSharedChange) {
    this.requireInitialOnSharedChange = requireInitialOnSharedChange;
  }

  public FormulaTab roundDecimalPlaces(String roundDecimalPlaces) {
    this.roundDecimalPlaces = roundDecimalPlaces;
    return this;
  }

   /**
   * 
   * @return roundDecimalPlaces
  **/
  @ApiModelProperty(value = "")
  public String getRoundDecimalPlaces() {
    return roundDecimalPlaces;
  }

  public void setRoundDecimalPlaces(String roundDecimalPlaces) {
    this.roundDecimalPlaces = roundDecimalPlaces;
  }

  public FormulaTab senderRequired(String senderRequired) {
    this.senderRequired = senderRequired;
    return this;
  }

   /**
   * When set to **true**, the sender must populate the tab before an envelope can be sent using the template.   This value tab can only be changed by modifying (PUT) the template.   Tabs with a `senderRequired` value of true cannot be deleted from an envelope.
   * @return senderRequired
  **/
  @ApiModelProperty(value = "When set to **true**, the sender must populate the tab before an envelope can be sent using the template.   This value tab can only be changed by modifying (PUT) the template.   Tabs with a `senderRequired` value of true cannot be deleted from an envelope.")
  public String getSenderRequired() {
    return senderRequired;
  }

  public void setSenderRequired(String senderRequired) {
    this.senderRequired = senderRequired;
  }

  public FormulaTab shared(String shared) {
    this.shared = shared;
    return this;
  }

   /**
   * When set to **true**, this custom tab is shared.
   * @return shared
  **/
  @ApiModelProperty(value = "When set to **true**, this custom tab is shared.")
  public String getShared() {
    return shared;
  }

  public void setShared(String shared) {
    this.shared = shared;
  }

  public FormulaTab status(String status) {
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

  public FormulaTab tabGroupLabels(java.util.List<String> tabGroupLabels) {
    this.tabGroupLabels = tabGroupLabels;
    return this;
  }

  public FormulaTab addTabGroupLabelsItem(String tabGroupLabelsItem) {
    if (this.tabGroupLabels == null) {
      this.tabGroupLabels = new java.util.ArrayList<String>();
    }
    this.tabGroupLabels.add(tabGroupLabelsItem);
    return this;
  }

   /**
   * 
   * @return tabGroupLabels
  **/
  @ApiModelProperty(value = "")
  public java.util.List<String> getTabGroupLabels() {
    return tabGroupLabels;
  }

  public void setTabGroupLabels(java.util.List<String> tabGroupLabels) {
    this.tabGroupLabels = tabGroupLabels;
  }

  public FormulaTab tabId(String tabId) {
    this.tabId = tabId;
    return this;
  }

   /**
   * The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     
   * @return tabId
  **/
  @ApiModelProperty(value = "The unique identifier for the tab. The tabid can be retrieved with the [ML:GET call].     ")
  public String getTabId() {
    return tabId;
  }

  public void setTabId(String tabId) {
    this.tabId = tabId;
  }

  public FormulaTab tabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
    return this;
  }

   /**
   * The label string associated with the tab.
   * @return tabLabel
  **/
  @ApiModelProperty(value = "The label string associated with the tab.")
  public String getTabLabel() {
    return tabLabel;
  }

  public void setTabLabel(String tabLabel) {
    this.tabLabel = tabLabel;
  }

  public FormulaTab tabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
    return this;
  }

   /**
   * 
   * @return tabOrder
  **/
  @ApiModelProperty(value = "")
  public String getTabOrder() {
    return tabOrder;
  }

  public void setTabOrder(String tabOrder) {
    this.tabOrder = tabOrder;
  }

  public FormulaTab templateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
    return this;
  }

   /**
   * When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. 
   * @return templateLocked
  **/
  @ApiModelProperty(value = "When set to **true**, the sender cannot change any attributes of the recipient. Used only when working with template recipients. ")
  public String getTemplateLocked() {
    return templateLocked;
  }

  public void setTemplateLocked(String templateLocked) {
    this.templateLocked = templateLocked;
  }

  public FormulaTab templateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
    return this;
  }

   /**
   * When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.
   * @return templateRequired
  **/
  @ApiModelProperty(value = "When set to **true**, the sender may not remove the recipient. Used only when working with template recipients.")
  public String getTemplateRequired() {
    return templateRequired;
  }

  public void setTemplateRequired(String templateRequired) {
    this.templateRequired = templateRequired;
  }

  public FormulaTab tooltip(String tooltip) {
    this.tooltip = tooltip;
    return this;
  }

   /**
   * 
   * @return tooltip
  **/
  @ApiModelProperty(value = "")
  public String getTooltip() {
    return tooltip;
  }

  public void setTooltip(String tooltip) {
    this.tooltip = tooltip;
  }

  public FormulaTab underline(String underline) {
    this.underline = underline;
    return this;
  }

   /**
   * When set to **true**, the information in the tab is underlined.
   * @return underline
  **/
  @ApiModelProperty(value = "When set to **true**, the information in the tab is underlined.")
  public String getUnderline() {
    return underline;
  }

  public void setUnderline(String underline) {
    this.underline = underline;
  }

  public FormulaTab validationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
    return this;
  }

   /**
   * The message displayed if the custom tab fails input validation (either custom of embedded).
   * @return validationMessage
  **/
  @ApiModelProperty(value = "The message displayed if the custom tab fails input validation (either custom of embedded).")
  public String getValidationMessage() {
    return validationMessage;
  }

  public void setValidationMessage(String validationMessage) {
    this.validationMessage = validationMessage;
  }

  public FormulaTab validationPattern(String validationPattern) {
    this.validationPattern = validationPattern;
    return this;
  }

   /**
   * A regular expression used to validate input for the tab.
   * @return validationPattern
  **/
  @ApiModelProperty(value = "A regular expression used to validate input for the tab.")
  public String getValidationPattern() {
    return validationPattern;
  }

  public void setValidationPattern(String validationPattern) {
    this.validationPattern = validationPattern;
  }

  public FormulaTab value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Specifies the value of the tab. 
   * @return value
  **/
  @ApiModelProperty(value = "Specifies the value of the tab. ")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public FormulaTab width(Integer width) {
    this.width = width;
    return this;
  }

   /**
   * Width of the tab in pixels.
   * @return width
  **/
  @ApiModelProperty(value = "Width of the tab in pixels.")
  public Integer getWidth() {
    return width;
  }

  public void setWidth(Integer width) {
    this.width = width;
  }

  public FormulaTab xPosition(String xPosition) {
    this.xPosition = xPosition;
    return this;
  }

   /**
   * This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.
   * @return xPosition
  **/
  @ApiModelProperty(value = "This indicates the horizontal offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  public String getXPosition() {
    return xPosition;
  }

  public void setXPosition(String xPosition) {
    this.xPosition = xPosition;
  }

  public FormulaTab yPosition(String yPosition) {
    this.yPosition = yPosition;
    return this;
  }

   /**
   * This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.
   * @return yPosition
  **/
  @ApiModelProperty(value = "This indicates the vertical offset of the object on the page. DocuSign uses 72 DPI when determining position.")
  public String getYPosition() {
    return yPosition;
  }

  public void setYPosition(String yPosition) {
    this.yPosition = yPosition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormulaTab formulaTab = (FormulaTab) o;
    return Objects.equals(this.anchorCaseSensitive, formulaTab.anchorCaseSensitive) &&
        Objects.equals(this.anchorHorizontalAlignment, formulaTab.anchorHorizontalAlignment) &&
        Objects.equals(this.anchorIgnoreIfNotPresent, formulaTab.anchorIgnoreIfNotPresent) &&
        Objects.equals(this.anchorMatchWholeWord, formulaTab.anchorMatchWholeWord) &&
        Objects.equals(this.anchorString, formulaTab.anchorString) &&
        Objects.equals(this.anchorUnits, formulaTab.anchorUnits) &&
        Objects.equals(this.anchorXOffset, formulaTab.anchorXOffset) &&
        Objects.equals(this.anchorYOffset, formulaTab.anchorYOffset) &&
        Objects.equals(this.bold, formulaTab.bold) &&
        Objects.equals(this.concealValueOnDocument, formulaTab.concealValueOnDocument) &&
        Objects.equals(this.conditionalParentLabel, formulaTab.conditionalParentLabel) &&
        Objects.equals(this.conditionalParentValue, formulaTab.conditionalParentValue) &&
        Objects.equals(this.customTabId, formulaTab.customTabId) &&
        Objects.equals(this.disableAutoSize, formulaTab.disableAutoSize) &&
        Objects.equals(this.documentId, formulaTab.documentId) &&
        Objects.equals(this.errorDetails, formulaTab.errorDetails) &&
        Objects.equals(this.font, formulaTab.font) &&
        Objects.equals(this.fontColor, formulaTab.fontColor) &&
        Objects.equals(this.fontSize, formulaTab.fontSize) &&
        Objects.equals(this.formula, formulaTab.formula) &&
        Objects.equals(this.hidden, formulaTab.hidden) &&
        Objects.equals(this.isPaymentAmount, formulaTab.isPaymentAmount) &&
        Objects.equals(this.italic, formulaTab.italic) &&
        Objects.equals(this.locked, formulaTab.locked) &&
        Objects.equals(this.maxLength, formulaTab.maxLength) &&
        Objects.equals(this.mergeField, formulaTab.mergeField) &&
        Objects.equals(this.name, formulaTab.name) &&
        Objects.equals(this.originalValue, formulaTab.originalValue) &&
        Objects.equals(this.pageNumber, formulaTab.pageNumber) &&
        Objects.equals(this.paymentDetails, formulaTab.paymentDetails) &&
        Objects.equals(this.recipientId, formulaTab.recipientId) &&
        Objects.equals(this.requireAll, formulaTab.requireAll) &&
        Objects.equals(this.required, formulaTab.required) &&
        Objects.equals(this.requireInitialOnSharedChange, formulaTab.requireInitialOnSharedChange) &&
        Objects.equals(this.roundDecimalPlaces, formulaTab.roundDecimalPlaces) &&
        Objects.equals(this.senderRequired, formulaTab.senderRequired) &&
        Objects.equals(this.shared, formulaTab.shared) &&
        Objects.equals(this.status, formulaTab.status) &&
        Objects.equals(this.tabGroupLabels, formulaTab.tabGroupLabels) &&
        Objects.equals(this.tabId, formulaTab.tabId) &&
        Objects.equals(this.tabLabel, formulaTab.tabLabel) &&
        Objects.equals(this.tabOrder, formulaTab.tabOrder) &&
        Objects.equals(this.templateLocked, formulaTab.templateLocked) &&
        Objects.equals(this.templateRequired, formulaTab.templateRequired) &&
        Objects.equals(this.tooltip, formulaTab.tooltip) &&
        Objects.equals(this.underline, formulaTab.underline) &&
        Objects.equals(this.validationMessage, formulaTab.validationMessage) &&
        Objects.equals(this.validationPattern, formulaTab.validationPattern) &&
        Objects.equals(this.value, formulaTab.value) &&
        Objects.equals(this.width, formulaTab.width) &&
        Objects.equals(this.xPosition, formulaTab.xPosition) &&
        Objects.equals(this.yPosition, formulaTab.yPosition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorCaseSensitive, anchorHorizontalAlignment, anchorIgnoreIfNotPresent, anchorMatchWholeWord, anchorString, anchorUnits, anchorXOffset, anchorYOffset, bold, concealValueOnDocument, conditionalParentLabel, conditionalParentValue, customTabId, disableAutoSize, documentId, errorDetails, font, fontColor, fontSize, formula, hidden, isPaymentAmount, italic, locked, maxLength, mergeField, name, originalValue, pageNumber, paymentDetails, recipientId, requireAll, required, requireInitialOnSharedChange, roundDecimalPlaces, senderRequired, shared, status, tabGroupLabels, tabId, tabLabel, tabOrder, templateLocked, templateRequired, tooltip, underline, validationMessage, validationPattern, value, width, xPosition, yPosition);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormulaTab {\n");
    
    sb.append("    anchorCaseSensitive: ").append(toIndentedString(anchorCaseSensitive)).append("\n");
    sb.append("    anchorHorizontalAlignment: ").append(toIndentedString(anchorHorizontalAlignment)).append("\n");
    sb.append("    anchorIgnoreIfNotPresent: ").append(toIndentedString(anchorIgnoreIfNotPresent)).append("\n");
    sb.append("    anchorMatchWholeWord: ").append(toIndentedString(anchorMatchWholeWord)).append("\n");
    sb.append("    anchorString: ").append(toIndentedString(anchorString)).append("\n");
    sb.append("    anchorUnits: ").append(toIndentedString(anchorUnits)).append("\n");
    sb.append("    anchorXOffset: ").append(toIndentedString(anchorXOffset)).append("\n");
    sb.append("    anchorYOffset: ").append(toIndentedString(anchorYOffset)).append("\n");
    sb.append("    bold: ").append(toIndentedString(bold)).append("\n");
    sb.append("    concealValueOnDocument: ").append(toIndentedString(concealValueOnDocument)).append("\n");
    sb.append("    conditionalParentLabel: ").append(toIndentedString(conditionalParentLabel)).append("\n");
    sb.append("    conditionalParentValue: ").append(toIndentedString(conditionalParentValue)).append("\n");
    sb.append("    customTabId: ").append(toIndentedString(customTabId)).append("\n");
    sb.append("    disableAutoSize: ").append(toIndentedString(disableAutoSize)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    font: ").append(toIndentedString(font)).append("\n");
    sb.append("    fontColor: ").append(toIndentedString(fontColor)).append("\n");
    sb.append("    fontSize: ").append(toIndentedString(fontSize)).append("\n");
    sb.append("    formula: ").append(toIndentedString(formula)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    isPaymentAmount: ").append(toIndentedString(isPaymentAmount)).append("\n");
    sb.append("    italic: ").append(toIndentedString(italic)).append("\n");
    sb.append("    locked: ").append(toIndentedString(locked)).append("\n");
    sb.append("    maxLength: ").append(toIndentedString(maxLength)).append("\n");
    sb.append("    mergeField: ").append(toIndentedString(mergeField)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originalValue: ").append(toIndentedString(originalValue)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    paymentDetails: ").append(toIndentedString(paymentDetails)).append("\n");
    sb.append("    recipientId: ").append(toIndentedString(recipientId)).append("\n");
    sb.append("    requireAll: ").append(toIndentedString(requireAll)).append("\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    requireInitialOnSharedChange: ").append(toIndentedString(requireInitialOnSharedChange)).append("\n");
    sb.append("    roundDecimalPlaces: ").append(toIndentedString(roundDecimalPlaces)).append("\n");
    sb.append("    senderRequired: ").append(toIndentedString(senderRequired)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    tabGroupLabels: ").append(toIndentedString(tabGroupLabels)).append("\n");
    sb.append("    tabId: ").append(toIndentedString(tabId)).append("\n");
    sb.append("    tabLabel: ").append(toIndentedString(tabLabel)).append("\n");
    sb.append("    tabOrder: ").append(toIndentedString(tabOrder)).append("\n");
    sb.append("    templateLocked: ").append(toIndentedString(templateLocked)).append("\n");
    sb.append("    templateRequired: ").append(toIndentedString(templateRequired)).append("\n");
    sb.append("    tooltip: ").append(toIndentedString(tooltip)).append("\n");
    sb.append("    underline: ").append(toIndentedString(underline)).append("\n");
    sb.append("    validationMessage: ").append(toIndentedString(validationMessage)).append("\n");
    sb.append("    validationPattern: ").append(toIndentedString(validationPattern)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    xPosition: ").append(toIndentedString(xPosition)).append("\n");
    sb.append("    yPosition: ").append(toIndentedString(yPosition)).append("\n");
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

