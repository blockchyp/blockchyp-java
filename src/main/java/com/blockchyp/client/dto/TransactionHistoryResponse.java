/**
 * Copyright 2019-2025 BlockChyp, Inc. All rights reserved. Use of this code is governed
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
public class TransactionHistoryResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private boolean test;

     private String batchId;

     private String terminalName;

     private Date startDate;

     private Date endDate;

     private int maxResults;

     private int startIndex;

     private int totalResultCount;

     private Collection<AuthorizationResponse> transactions;

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
     * Sets batch identifier if filtered by batch.
     * @param value batch identifier if filtered by batch.
     */
     public void setBatchId(String value) {
          this.batchId = value;
     }

    /**
     * Gets batch identifier if filtered by batch.
     * @return batch identifier if filtered by batch.
     */
     @JsonProperty("batchId")
     public String getBatchId() {
          return this.batchId;
     }

    /**
     * Sets terminal name if filtered by terminal.
     * @param value terminal name if filtered by terminal.
     */
     public void setTerminalName(String value) {
          this.terminalName = value;
     }

    /**
     * Gets terminal name if filtered by terminal.
     * @return terminal name if filtered by terminal.
     */
     @JsonProperty("terminalName")
     public String getTerminalName() {
          return this.terminalName;
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
     * Sets max results from the original request echoed back.
     * @param value max results from the original request echoed back. Defaults to the
     * system max of 250.
     */
     public void setMaxResults(int value) {
          this.maxResults = value;
     }

    /**
     * Gets max results from the original request echoed back.
     * @return max results from the original request echoed back. Defaults to the system
     * max of 250.
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
     * Sets matching transaction history.
     * @param value matching transaction history.
     */
     public void setTransactions(Collection<AuthorizationResponse> value) {
          this.transactions = value;
     }

    /**
     * Gets matching transaction history.
     * @return matching transaction history.
     */
     @JsonProperty("transactions")
     public Collection<AuthorizationResponse> getTransactions() {
          return this.transactions;
     }

    /**
     * Adds a matching transaction history.
     * @param value matching transaction history.
     */
     public void addTransaction(AuthorizationResponse value) {
          if (this.transactions == null) {
               this.transactions = new ArrayList();
          }
          this.transactions.add(value);
     }

}
