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
 * Models a request for details about a single batch.
 */
public class BatchDetailsRequest implements ICoreRequest {

     private String transactionRef;

     private String orderRef;

     private String destinationAccount;

     private boolean test;

     private int timeout;

     private String batchId;

    /**
     * Sets the transaction reference string assigned to the transaction request.
     * @param value the transaction reference string assigned to the transaction
     * request. If no transaction ref was assiged on the request, then the gateway will
     * randomly generate one.
     */
     public void setTransactionRef(String value) {
          this.transactionRef = value;
     }

    /**
     * Gets the transaction reference string assigned to the transaction request.
     * @return the transaction reference string assigned to the transaction request. If
     * no transaction ref was assiged on the request, then the gateway will randomly
     * generate one.
     */
     @JsonProperty("transactionRef")
     public String getTransactionRef() {
          return this.transactionRef;
     }

    /**
     * Sets an identifier from an external point of sale system.
     * @param value an identifier from an external point of sale system.
     */
     public void setOrderRef(String value) {
          this.orderRef = value;
     }

    /**
     * Gets an identifier from an external point of sale system.
     * @return an identifier from an external point of sale system.
     */
     @JsonProperty("orderRef")
     public String getOrderRef() {
          return this.orderRef;
     }

    /**
     * Sets the settlement account for merchants with split settlements.
     * @param value the settlement account for merchants with split settlements.
     */
     public void setDestinationAccount(String value) {
          this.destinationAccount = value;
     }

    /**
     * Gets the settlement account for merchants with split settlements.
     * @return the settlement account for merchants with split settlements.
     */
     @JsonProperty("destinationAccount")
     public String getDestinationAccount() {
          return this.destinationAccount;
     }

    /**
     * Sets whether or not to route transaction to the test gateway.
     * @param value whether or not to route transaction to the test gateway.
     */
     public void setTest(boolean value) {
          this.test = value;
     }

    /**
     * Gets whether or not to route transaction to the test gateway.
     * @return whether or not to route transaction to the test gateway.
     */
     @JsonProperty("test")
     public boolean isTest() {
          return this.test;
     }

    /**
     * Sets the request timeout in seconds.
     * @param value the request timeout in seconds.
     */
     public void setTimeout(int value) {
          this.timeout = value;
     }

    /**
     * Gets the request timeout in seconds.
     * @return the request timeout in seconds.
     */
     @JsonProperty("timeout")
     public int getTimeout() {
          return this.timeout;
     }

    /**
     * Sets id for the batch to be retrieved.
     * @param value id for the batch to be retrieved.
     */
     public void setBatchId(String value) {
          this.batchId = value;
     }

    /**
     * Gets id for the batch to be retrieved.
     * @return id for the batch to be retrieved.
     */
     @JsonProperty("batchId")
     public String getBatchId() {
          return this.batchId;
     }

}