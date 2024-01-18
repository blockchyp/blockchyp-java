/**
 * Copyright 2019-2024 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Models results to a partner statement list inquiry.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class PartnerStatementListResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private Collection<PartnerStatementSummary> statements;

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
     * Sets the list of statements summaries.
     * @param value the list of statements summaries.
     */
     public void setStatements(Collection<PartnerStatementSummary> value) {
          this.statements = value;
     }

    /**
     * Gets the list of statements summaries.
     * @return the list of statements summaries.
     */
     @JsonProperty("statements")
     public Collection<PartnerStatementSummary> getStatements() {
          return this.statements;
     }

    /**
     * Adds a the list of statements summaries.
     * @param value the list of statements summaries.
     */
     public void addStatement(PartnerStatementSummary value) {
          if (this.statements == null) {
               this.statements = new ArrayList();
          }
          this.statements.add(value);
     }

}
