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
 * Models a Terms and Conditions history request.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class TermsAndConditionsLogResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private String transactionId;

     private int maxResults;

     private int startIndex;

     private int resultCount;

     private Collection<TermsAndConditionsLogEntry> results;

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
     * Sets optional transaction id if only log entries related to a transaction should be
     * returned.
     * @param value optional transaction id if only log entries related to a transaction
     * should be returned.
     */
     public void setTransactionId(String value) {
          this.transactionId = value;
     }

    /**
     * Gets optional transaction id if only log entries related to a transaction should be
     * returned.
     * @return optional transaction id if only log entries related to a transaction
     * should be returned.
     */
     @JsonProperty("transactionId")
     public String getTransactionId() {
          return this.transactionId;
     }

    /**
     * Sets max to be returned in a single page.
     * @param value max to be returned in a single page. Defaults to the system max of 250.
     */
     public void setMaxResults(int value) {
          this.maxResults = value;
     }

    /**
     * Gets max to be returned in a single page.
     * @return max to be returned in a single page. Defaults to the system max of 250.
     */
     @JsonProperty("maxResults")
     public int getMaxResults() {
          return this.maxResults;
     }

    /**
     * Sets starting index for paged results.
     * @param value starting index for paged results. Defaults to zero.
     */
     public void setStartIndex(int value) {
          this.startIndex = value;
     }

    /**
     * Gets starting index for paged results.
     * @return starting index for paged results. Defaults to zero.
     */
     @JsonProperty("startIndex")
     public int getStartIndex() {
          return this.startIndex;
     }

    /**
     * Sets total number of results accessible through paging.
     * @param value total number of results accessible through paging.
     */
     public void setResultCount(int value) {
          this.resultCount = value;
     }

    /**
     * Gets total number of results accessible through paging.
     * @return total number of results accessible through paging.
     */
     @JsonProperty("resultCount")
     public int getResultCount() {
          return this.resultCount;
     }

    /**
     * Sets the full result set responsive to the original request, subject to pagination
     * limits.
     * @param value the full result set responsive to the original request, subject to
     * pagination limits.
     */
     public void setResults(Collection<TermsAndConditionsLogEntry> value) {
          this.results = value;
     }

    /**
     * Gets the full result set responsive to the original request, subject to pagination
     * limits.
     * @return the full result set responsive to the original request, subject to
     * pagination limits.
     */
     @JsonProperty("results")
     public Collection<TermsAndConditionsLogEntry> getResults() {
          return this.results;
     }

    /**
     * Adds a the full result set responsive to the original request, subject to
     * pagination limits.
     * @param value the full result set responsive to the original request, subject to
     * pagination limits.
     */
     public void addResult(TermsAndConditionsLogEntry value) {
          if (this.results == null) {
               this.results = new ArrayList();
          }
          this.results.add(value);
     }

}
