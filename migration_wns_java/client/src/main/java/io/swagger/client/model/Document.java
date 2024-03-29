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

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.v3.oas.annotations.media.Schema;
/**
 * This object holds list of documents attached during the transaciton for a property
 */
@Schema(description = "This object holds list of documents attached during the transaciton for a property")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-01-26T12:10:41.195Z[GMT]")
public class Document {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("documentType")
  private String documentType = null;

  @JsonProperty("fileStore")
  private String fileStore = null;

  @JsonProperty("documentUid")
  private String documentUid = null;

  @JsonProperty("additionalDetails")
  private Object additionalDetails = null;

  public Document id(String id) {
    this.id = id;
    return this;
  }

   /**
   * system id of the Document.
   * @return id
  **/
  @Schema(description = "system id of the Document.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Document documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

   /**
   * unique document type code, should be validated with document type master
   * @return documentType
  **/
  @Schema(description = "unique document type code, should be validated with document type master")
  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public Document fileStore(String fileStore) {
    this.fileStore = fileStore;
    return this;
  }

   /**
   * File store reference key.
   * @return fileStore
  **/
  @Schema(description = "File store reference key.")
  public String getFileStore() {
    return fileStore;
  }

  public void setFileStore(String fileStore) {
    this.fileStore = fileStore;
  }

  public Document documentUid(String documentUid) {
    this.documentUid = documentUid;
    return this;
  }

   /**
   * The unique id(Pancard Number,Adhar etc.) of the given Document.
   * @return documentUid
  **/
  @Schema(description = "The unique id(Pancard Number,Adhar etc.) of the given Document.")
  public String getDocumentUid() {
    return documentUid;
  }

  public void setDocumentUid(String documentUid) {
    this.documentUid = documentUid;
  }

  public Document additionalDetails(Object additionalDetails) {
    this.additionalDetails = additionalDetails;
    return this;
  }

   /**
   * Json object to capture any extra information which is not accommodated by model
   * @return additionalDetails
  **/
  @Schema(description = "Json object to capture any extra information which is not accommodated by model")
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
    Document document = (Document) o;
    return Objects.equals(this.id, document.id) &&
        Objects.equals(this.documentType, document.documentType) &&
        Objects.equals(this.fileStore, document.fileStore) &&
        Objects.equals(this.documentUid, document.documentUid) &&
        Objects.equals(this.additionalDetails, document.additionalDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, documentType, fileStore, documentUid, additionalDetails);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    fileStore: ").append(toIndentedString(fileStore)).append("\n");
    sb.append("    documentUid: ").append(toIndentedString(documentUid)).append("\n");
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
