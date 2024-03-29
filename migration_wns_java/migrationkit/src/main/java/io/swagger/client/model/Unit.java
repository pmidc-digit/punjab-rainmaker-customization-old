/*
 * eGov Property Registry System.
 * APIs for Property Registry module. This provide APIs for create new property, update existing property, search existing property. 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: contact@egovernments.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
/**
 * Unit
 */

public class Unit {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("tenantId")
  private String tenantId = null;

  @JsonProperty("floorNo")
  private String floorNo = null;

  @JsonProperty("unitType")
  private String unitType = null;

  @JsonProperty("usageCategory")
  private String usageCategory = null;

  @JsonProperty("occupancyType")
  private OccupancyType2 occupancyType = null;

  @JsonProperty("occupancyDate")
  private Long occupancyDate = null;

  @JsonProperty("constructionDetail")
  private ConstructionDetail constructionDetail = null;

  @JsonProperty("additionalDetails")
  private Object additionalDetails = null;

  public Unit id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Unique Identifier of the Unit(UUID).
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Unit tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

   /**
   * tenant id of the Property
   * @return tenantId
  **/
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public Unit floorNo(String floorNo) {
    this.floorNo = floorNo;
    return this;
  }

   /**
   * floor number of the Unit
   * @return floorNo
  **/
  public String getFloorNo() {
    return floorNo;
  }

  public void setFloorNo(String floorNo) {
    this.floorNo = floorNo;
  }

  public Unit unitType(String unitType) {
    this.unitType = unitType;
    return this;
  }

   /**
   * Unit type is master data.
   * @return unitType
  **/
  public String getUnitType() {
    return unitType;
  }

  public void setUnitType(String unitType) {
    this.unitType = unitType;
  }

  public Unit usageCategory(String usageCategory) {
    this.usageCategory = usageCategory;
    return this;
  }

   /**
   * This is about the usage of the property like Residential, Non-residential, Mixed(Property witch is gettiong used for Residential, Non-residential purpose)
   * @return usageCategory
  **/
  public String getUsageCategory() {
    return usageCategory;
  }

  public void setUsageCategory(String usageCategory) {
    this.usageCategory = usageCategory;
  }

  public Unit occupancyType(OccupancyType2 occupancyType) {
    this.occupancyType = occupancyType;
    return this;
  }

   /**
   * Get occupancyType
   * @return occupancyType
  **/
  public OccupancyType2 getOccupancyType() {
    return occupancyType;
  }

  public void setOccupancyType(OccupancyType2 occupancyType) {
    this.occupancyType = occupancyType;
  }

  public Unit occupancyDate(Long occupancyDate) {
    this.occupancyDate = occupancyDate;
    return this;
  }

   /**
   * Date on which unit is occupied.
   * @return occupancyDate
  **/
  public Long getOccupancyDate() {
    return occupancyDate;
  }

  public void setOccupancyDate(Long occupancyDate) {
    this.occupancyDate = occupancyDate;
  }

  public Unit constructionDetail(ConstructionDetail constructionDetail) {
    this.constructionDetail = constructionDetail;
    return this;
  }

   /**
   * Get constructionDetail
   * @return constructionDetail
  **/
  public ConstructionDetail getConstructionDetail() {
    return constructionDetail;
  }

  public void setConstructionDetail(ConstructionDetail constructionDetail) {
    this.constructionDetail = constructionDetail;
  }

  public Unit additionalDetails(Object additionalDetails) {
    this.additionalDetails = additionalDetails;
    return this;
  }

   /**
   * Json object to capture any extra information which is not accommodated by model
   * @return additionalDetails
  **/
  public Object getAdditionalDetails() {
    return additionalDetails;
  }

  public void setAdditionalDetails(Object additionalDetails) {
    this.additionalDetails = additionalDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Unit unit = (Unit) o;
    return Objects.equals(this.id, unit.id) &&
        Objects.equals(this.tenantId, unit.tenantId) &&
        Objects.equals(this.floorNo, unit.floorNo) &&
        Objects.equals(this.unitType, unit.unitType) &&
        Objects.equals(this.usageCategory, unit.usageCategory) &&
        Objects.equals(this.occupancyType, unit.occupancyType) &&
        Objects.equals(this.occupancyDate, unit.occupancyDate) &&
        Objects.equals(this.constructionDetail, unit.constructionDetail) &&
        Objects.equals(this.additionalDetails, unit.additionalDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tenantId, floorNo, unitType, usageCategory, occupancyType, occupancyDate, constructionDetail, additionalDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Unit {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    floorNo: ").append(toIndentedString(floorNo)).append("\n");
    sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
    sb.append("    usageCategory: ").append(toIndentedString(usageCategory)).append("\n");
    sb.append("    occupancyType: ").append(toIndentedString(occupancyType)).append("\n");
    sb.append("    occupancyDate: ").append(toIndentedString(occupancyDate)).append("\n");
    sb.append("    constructionDetail: ").append(toIndentedString(constructionDetail)).append("\n");
    sb.append("    additionalDetails: ").append(toIndentedString(additionalDetails)).append("\n");
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
