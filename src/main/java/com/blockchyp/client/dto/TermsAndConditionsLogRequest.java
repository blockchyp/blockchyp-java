/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Models a Terms and Conditions history request.
 */
public class TermsAndConditionsLogRequest {

     private String logEntryId;

     private String transactionId;

     private int maxResults;

     private int startIndex;

     private int timeout;

    /**
     * Sets the identifier of the log entry to be returned for single result requests.
     * @param value the identifier of the log entry to be returned for single result
     * requests.
     */
     public void setLogEntryId(String value) {
          this.logEntryId = value;
     }

    /**
     * Gets the identifier of the log entry to be returned for single result requests.
     * @return the identifier of the log entry to be returned for single result requests.
     */
     @JsonProperty("logEntryId")
     public String getLogEntryId() {
          return this.logEntryId;
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
     * Sets an optional timeout override.
     * @param value an optional timeout override.
     */
     public void setTimeout(int value) {
          this.timeout = value;
     }

    /**
     * Gets an optional timeout override.
     * @return an optional timeout override.
     */
     @JsonProperty("timeout")
     public int getTimeout() {
          return this.timeout;
     }

}
