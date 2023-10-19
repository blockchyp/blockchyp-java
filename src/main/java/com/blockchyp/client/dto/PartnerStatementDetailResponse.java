/**
 * Copyright 2019-2023 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Models a response to retrieve detailed partner statement information.
 */
public class PartnerStatementDetailResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private String id;

     private String partnerId;

     private String partnerName;

     private Date statementDate;

    /**
     * Sets whether or not the request succeeded.
     * @param value whether or not the request succeeded.
     */
     public void setSuccess(boolean value) {
          this.success = value;
     }

    /**
     * Gets whether or not the request succeeded.
     * @return whether or not the request succeeded.
     */
     @JsonProperty("success")
     public boolean isSuccess() {
          return this.success;
     }

    /**
     * Sets the error, if an error occurred.
     * @param value the error, if an error occurred.
     */
     public void setError(String value) {
          this.error = value;
     }

    /**
     * Gets the error, if an error occurred.
     * @return the error, if an error occurred.
     */
     @JsonProperty("error")
     public String getError() {
          return this.error;
     }

    /**
     * Sets a narrative description of the transaction result.
     * @param value a narrative description of the transaction result.
     */
     public void setResponseDescription(String value) {
          this.responseDescription = value;
     }

    /**
     * Gets a narrative description of the transaction result.
     * @return a narrative description of the transaction result.
     */
     @JsonProperty("responseDescription")
     public String getResponseDescription() {
          return this.responseDescription;
     }

    /**
     * Sets optional start date filter for batch history.
     * @param value optional start date filter for batch history.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets optional start date filter for batch history.
     * @return optional start date filter for batch history.
     */
     @JsonProperty("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets the id of the partner associated with the statement.
     * @param value the id of the partner associated with the statement.
     */
     public void setPartnerId(String value) {
          this.partnerId = value;
     }

    /**
     * Gets the id of the partner associated with the statement.
     * @return the id of the partner associated with the statement.
     */
     @JsonProperty("partnerId")
     public String getPartnerId() {
          return this.partnerId;
     }

    /**
     * Sets the name of the partner associated with the statement.
     * @param value the name of the partner associated with the statement.
     */
     public void setPartnerName(String value) {
          this.partnerName = value;
     }

    /**
     * Gets the name of the partner associated with the statement.
     * @return the name of the partner associated with the statement.
     */
     @JsonProperty("partnerName")
     public String getPartnerName() {
          return this.partnerName;
     }

    /**
     * Sets the date the statement was generated.
     * @param value the date the statement was generated.
     */
     public void setStatementDate(Date value) {
          this.statementDate = value;
     }

    /**
     * Gets the date the statement was generated.
     * @return the date the statement was generated.
     */
     @JsonProperty("statementDate")
     public Date getStatementDate() {
          return this.statementDate;
     }

}
