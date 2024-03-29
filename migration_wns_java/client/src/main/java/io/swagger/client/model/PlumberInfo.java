/*
 * eGov Water and Sewerage(W&S)  System.
 * APIs for W&S module. This provide APIs for create new property, update existing property, search existing property. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: contact@egovernments.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.io.IOException;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * PlumberInfo
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-26T12:10:41.195Z[GMT]")
public class PlumberInfo {
  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("licenseNo")
  private String licenseNo = null;

  @JsonProperty("mobileNumber")
  private String mobileNumber = null;

  @JsonProperty("gender")
  private String gender = null;

  @JsonProperty("fatherOrHusbandName")
  private String fatherOrHusbandName = null;

  @JsonProperty("correspondenceAddress")
  private String correspondenceAddress = null;

  /**
   * The relationship of gaurdian.
   */
  @JsonAdapter(RelationshipEnum.Adapter.class)
  public enum RelationshipEnum {
    FATHER("FATHER"),
    HUSBAND("HUSBAND");

    private String value;

    RelationshipEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static RelationshipEnum fromValue(String text) {
      for (RelationshipEnum b : RelationshipEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<RelationshipEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final RelationshipEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public RelationshipEnum read(final JsonReader jsonReader) throws IOException {
    	  String value = jsonReader.nextString();
        return RelationshipEnum.fromValue(String.valueOf(value));
      }
    }
  }  @JsonProperty("relationship")
  private RelationshipEnum relationship = null;

  @JsonProperty("additionalDetails")
  private Object additionalDetails = null;

  @JsonProperty("auditDetails")
  private AuditDetails auditDetails = null;

  public PlumberInfo tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * Unique ULB identifier.
   * @return tenantId
  **/
  @Schema(description = "Unique ULB identifier.")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public PlumberInfo name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the user.
   * @return name
  **/
  @Schema(description = "The name of the user.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PlumberInfo licenseNo(String licenseNo) {
    this.licenseNo = licenseNo;
    return this;
  }

   /**
   * Plumber unique license number.
   * @return licenseNo
  **/
  @Schema(description = "Plumber unique license number.")
  public String getLicenseNo() {
    return licenseNo;
  }

  public void setLicenseNo(String licenseNo) {
    this.licenseNo = licenseNo;
  }

  public PlumberInfo mobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
    return this;
  }

   /**
   * MobileNumber of the user.
   * @return mobileNumber
  **/
  @Schema(description = "MobileNumber of the user.")
  public String getMobileNumber() {
    return mobileNumber;
  }

  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }

  public PlumberInfo gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Gender of the user.
   * @return gender
  **/
  @Schema(description = "Gender of the user.")
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public PlumberInfo fatherOrHusbandName(String fatherOrHusbandName) {
    this.fatherOrHusbandName = fatherOrHusbandName;
    return this;
  }

   /**
   * Father or Husband name of the user.
   * @return fatherOrHusbandName
  **/
  @Schema(description = "Father or Husband name of the user.")
  public String getFatherOrHusbandName() {
    return fatherOrHusbandName;
  }

  public void setFatherOrHusbandName(String fatherOrHusbandName) {
    this.fatherOrHusbandName = fatherOrHusbandName;
  }

  public PlumberInfo correspondenceAddress(String correspondenceAddress) {
    this.correspondenceAddress = correspondenceAddress;
    return this;
  }

   /**
   * The current address of the owner for correspondence.
   * @return correspondenceAddress
  **/
  @Schema(description = "The current address of the owner for correspondence.")
  public String getCorrespondenceAddress() {
    return correspondenceAddress;
  }

  public void setCorrespondenceAddress(String correspondenceAddress) {
    this.correspondenceAddress = correspondenceAddress;
  }

  public PlumberInfo relationship(RelationshipEnum relationship) {
    this.relationship = relationship;
    return this;
  }

   /**
   * The relationship of gaurdian.
   * @return relationship
  **/
  @Schema(description = "The relationship of gaurdian.")
  public RelationshipEnum getRelationship() {
    return relationship;
  }

  public void setRelationship(RelationshipEnum relationship) {
    this.relationship = relationship;
  }

  public PlumberInfo additionalDetails(Object additionalDetails) {
    this.additionalDetails = additionalDetails;
    return this;
  }

   /**
   * Json object to capture any extra information which is not accommodated of model
   * @return additionalDetails
  **/
  @Schema(description = "Json object to capture any extra information which is not accommodated of model")
  public Object getAdditionalDetails() {
    return additionalDetails;
  }

  public void setAdditionalDetails(Object additionalDetails) {
    this.additionalDetails = additionalDetails;
  }

  public PlumberInfo auditDetails(AuditDetails auditDetails) {
    this.auditDetails = auditDetails;
    return this;
  }

   /**
   * Get auditDetails
   * @return auditDetails
  **/
  @Schema(description = "")
  public AuditDetails getAuditDetails() {
    return auditDetails;
  }

  public void setAuditDetails(AuditDetails auditDetails) {
    this.auditDetails = auditDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlumberInfo plumberInfo = (PlumberInfo) o;
    return Objects.equals(this.tenantId, plumberInfo.tenantId) &&
        Objects.equals(this.name, plumberInfo.name) &&
        Objects.equals(this.licenseNo, plumberInfo.licenseNo) &&
        Objects.equals(this.mobileNumber, plumberInfo.mobileNumber) &&
        Objects.equals(this.gender, plumberInfo.gender) &&
        Objects.equals(this.fatherOrHusbandName, plumberInfo.fatherOrHusbandName) &&
        Objects.equals(this.correspondenceAddress, plumberInfo.correspondenceAddress) &&
        Objects.equals(this.relationship, plumberInfo.relationship) &&
        Objects.equals(this.additionalDetails, plumberInfo.additionalDetails) &&
        Objects.equals(this.auditDetails, plumberInfo.auditDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tenantId, name, licenseNo, mobileNumber, gender, fatherOrHusbandName, correspondenceAddress, relationship, additionalDetails, auditDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlumberInfo {\n");
    
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    licenseNo: ").append(toIndentedString(licenseNo)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    fatherOrHusbandName: ").append(toIndentedString(fatherOrHusbandName)).append("\n");
    sb.append("    correspondenceAddress: ").append(toIndentedString(correspondenceAddress)).append("\n");
    sb.append("    relationship: ").append(toIndentedString(relationship)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
    sb.append("    auditDetails: ").append(toIndentedString(auditDetails)).append("\n");
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
