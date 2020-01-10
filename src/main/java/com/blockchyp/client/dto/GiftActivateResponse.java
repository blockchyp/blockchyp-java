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
 * The response to a gift activate request.
 */
public class GiftActivateResponse implements IAbstractAcknowledgement, ICoreResponse {

     private boolean success;

     private String error;

     private String responseDescription;

     private String transactionId;

     private String batchId;

     private String transactionRef;

     private String transactionType;

     private String timestamp;

     private String tickBlock;

     private boolean test;

     private String sig;

     private boolean approved;

     private String amount;

     private String currentBalance;

     private String currencyCode;

     private String publicKey;

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
      * Sets the ID assigned to the transaction.
      * @param value the ID assigned to the transaction.
      */
     public void setTransactionId(String value) {
          this.transactionId = value;
     }

     /**
      * Gets the ID assigned to the transaction.
      * @return the ID assigned to the transaction.
      */
     @JsonProperty("transactionId")
     public String getTransactionId() {
          return this.transactionId;
     }

     /**
      * Sets the ID assigned to the batch.
      * @param value the ID assigned to the batch.
      */
     public void setBatchId(String value) {
          this.batchId = value;
     }

     /**
      * Gets the ID assigned to the batch.
      * @return the ID assigned to the batch.
      */
     @JsonProperty("batchId")
     public String getBatchId() {
          return this.batchId;
     }

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
      * @return the transaction reference string assigned to the transaction request.
      * If no transaction ref was assiged on the request, then the gateway will randomly
      * generate one.
      */
     @JsonProperty("transactionRef")
     public String getTransactionRef() {
          return this.transactionRef;
     }

     /**
      * Sets the type of transaction.
      * @param value the type of transaction.
      */
     public void setTransactionType(String value) {
          this.transactionType = value;
     }

     /**
      * Gets the type of transaction.
      * @return the type of transaction.
      */
     @JsonProperty("transactionType")
     public String getTransactionType() {
          return this.transactionType;
     }

     /**
      * Sets the timestamp of the transaction.
      * @param value the timestamp of the transaction.
      */
     public void setTimestamp(String value) {
          this.timestamp = value;
     }

     /**
      * Gets the timestamp of the transaction.
      * @return the timestamp of the transaction.
      */
     @JsonProperty("timestamp")
     public String getTimestamp() {
          return this.timestamp;
     }

     /**
      * Sets the hash of the last tick block.
      * @param value the hash of the last tick block.
      */
     public void setTickBlock(String value) {
          this.tickBlock = value;
     }

     /**
      * Gets the hash of the last tick block.
      * @return the hash of the last tick block.
      */
     @JsonProperty("tickBlock")
     public String getTickBlock() {
          return this.tickBlock;
     }

     /**
      * Sets that the transaction was processed on the test gateway.
      * @param value that the transaction was processed on the test gateway.
      */
     public void setTest(boolean value) {
          this.test = value;
     }

     /**
      * Gets that the transaction was processed on the test gateway.
      * @return that the transaction was processed on the test gateway.
      */
     @JsonProperty("test")
     public boolean isTest() {
          return this.test;
     }

     /**
      * Sets the ECC signature of the response.
      * @param value the ECC signature of the response. Can be used to ensure that it was
      * signed by the terminal and detect man-in-the middle attacks.
      */
     public void setSig(String value) {
          this.sig = value;
     }

     /**
      * Gets the ECC signature of the response.
      * @return the ECC signature of the response. Can be used to ensure that it was signed
      * by the terminal and detect man-in-the middle attacks.
      */
     @JsonProperty("sig")
     public String getSig() {
          return this.sig;
     }

     /**
      * Sets that the card was activated.
      * @param value that the card was activated.
      */
     public void setApproved(boolean value) {
          this.approved = value;
     }

     /**
      * Gets that the card was activated.
      * @return that the card was activated.
      */
     @JsonProperty("approved")
     public boolean isApproved() {
          return this.approved;
     }

     /**
      * Sets the amount of the transaction.
      * @param value the amount of the transaction.
      */
     public void setAmount(String value) {
          this.amount = value;
     }

     /**
      * Gets the amount of the transaction.
      * @return the amount of the transaction.
      */
     @JsonProperty("amount")
     public String getAmount() {
          return this.amount;
     }

     /**
      * Sets the current balance of the gift card.
      * @param value the current balance of the gift card.
      */
     public void setCurrentBalance(String value) {
          this.currentBalance = value;
     }

     /**
      * Gets the current balance of the gift card.
      * @return the current balance of the gift card.
      */
     @JsonProperty("currentBalance")
     public String getCurrentBalance() {
          return this.currentBalance;
     }

     /**
      * Sets the currency code used for the transaction.
      * @param value the currency code used for the transaction.
      */
     public void setCurrencyCode(String value) {
          this.currencyCode = value;
     }

     /**
      * Gets the currency code used for the transaction.
      * @return the currency code used for the transaction.
      */
     @JsonProperty("currencyCode")
     public String getCurrencyCode() {
          return this.currencyCode;
     }

     /**
      * Sets the public key of the activated card.
      * @param value the public key of the activated card.
      */
     public void setPublicKey(String value) {
          this.publicKey = value;
     }

     /**
      * Gets the public key of the activated card.
      * @return the public key of the activated card.
      */
     @JsonProperty("publicKey")
     public String getPublicKey() {
          return this.publicKey;
     }

}
