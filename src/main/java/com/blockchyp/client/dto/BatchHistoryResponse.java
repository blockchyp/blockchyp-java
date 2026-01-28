/**
 * Copyright 2019-2026 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Models response to a batch history request.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class BatchHistoryResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private boolean test;

     private Date startDate;

     private Date endDate;

     private Collection<BatchSummary> batches;

     private int maxResults;

     private int startIndex;

     private int totalResultCount;

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
     * Sets that the response came from the test gateway.
     * @param value that the response came from the test gateway.
     */
     public void setTest(boolean value) {
          this.test = value;
     }

    /**
     * Gets that the response came from the test gateway.
     * @return that the response came from the test gateway.
     */
     @JsonProperty("test")
     public boolean isTest() {
          return this.test;
     }

    /**
     * Sets start date if filtered by start date.
     * @param value start date if filtered by start date.
     */
     public void setStartDate(Date value) {
          this.startDate = value;
     }

    /**
     * Gets start date if filtered by start date.
     * @return start date if filtered by start date.
     */
     @JsonProperty("startDate")
     public Date getStartDate() {
          return this.startDate;
     }

    /**
     * Sets end date if filtered by end date.
     * @param value end date if filtered by end date.
     */
     public void setEndDate(Date value) {
          this.endDate = value;
     }

    /**
     * Gets end date if filtered by end date.
     * @return end date if filtered by end date.
     */
     @JsonProperty("endDate")
     public Date getEndDate() {
          return this.endDate;
     }

    /**
     * Sets merchant's batch history in descending order.
     * @param value merchant's batch history in descending order.
     */
     public void setBatches(Collection<BatchSummary> value) {
          this.batches = value;
     }

    /**
     * Gets merchant's batch history in descending order.
     * @return merchant's batch history in descending order.
     */
     @JsonProperty("batches")
     public Collection<BatchSummary> getBatches() {
          return this.batches;
     }

    /**
     * Sets max results from the original request echoed back.
     * @param value max results from the original request echoed back.
     */
     public void setMaxResults(int value) {
          this.maxResults = value;
     }

    /**
     * Gets max results from the original request echoed back.
     * @return max results from the original request echoed back.
     */
     @JsonProperty("maxResults")
     public int getMaxResults() {
          return this.maxResults;
     }

    /**
     * Sets starting index from the original request echoed back.
     * @param value starting index from the original request echoed back.
     */
     public void setStartIndex(int value) {
          this.startIndex = value;
     }

    /**
     * Gets starting index from the original request echoed back.
     * @return starting index from the original request echoed back.
     */
     @JsonProperty("startIndex")
     public int getStartIndex() {
          return this.startIndex;
     }

    /**
     * Sets total number of results accessible through paging.
     * @param value total number of results accessible through paging.
     */
     public void setTotalResultCount(int value) {
          this.totalResultCount = value;
     }

    /**
     * Gets total number of results accessible through paging.
     * @return total number of results accessible through paging.
     */
     @JsonProperty("totalResultCount")
     public int getTotalResultCount() {
          return this.totalResultCount;
     }

    /**
     * Adds a merchant's batch history in descending order.
     * @param value merchant's batch history in descending order.
     */
     public void addBatche(BatchSummary value) {
          if (this.batches == null) {
               this.batches = new ArrayList();
          }
          this.batches.add(value);
     }

}
