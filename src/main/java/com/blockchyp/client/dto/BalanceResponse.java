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
 * The response to a balance request.
 */
public class BalanceResponse implements IAbstractAcknowledgement, ICoreResponse, IPaymentMethodResponse {

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

     private String token;

     private String entryMethod;

     private String paymentType;

     private String maskedPan;

     private String publicKey;

     private boolean ScopeAlert;

     private String cardHolder;

     private ReceiptSuggestions receiptSuggestions;

     private String remainingBalance;

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
      * Sets the payment token, if the payment was enrolled in the vault.
      * @param value the payment token, if the payment was enrolled in the vault.
      */
     public void setToken(String value) {
          this.token = value;
     }

     /**
      * Gets the payment token, if the payment was enrolled in the vault.
      * @return the payment token, if the payment was enrolled in the vault.
      */
     @JsonProperty("token")
     public String getToken() {
          return this.token;
     }

     /**
      * Sets the entry method for the transaction (CHIP, MSR, KEYED, etc).
      * @param value the entry method for the transaction (CHIP, MSR, KEYED, etc).
      */
     public void setEntryMethod(String value) {
          this.entryMethod = value;
     }

     /**
      * Gets the entry method for the transaction (CHIP, MSR, KEYED, etc).
      * @return the entry method for the transaction (CHIP, MSR, KEYED, etc).
      */
     @JsonProperty("entryMethod")
     public String getEntryMethod() {
          return this.entryMethod;
     }

     /**
      * Sets the card brand (VISA, MC, AMEX, etc).
      * @param value the card brand (VISA, MC, AMEX, etc).
      */
     public void setPaymentType(String value) {
          this.paymentType = value;
     }

     /**
      * Gets the card brand (VISA, MC, AMEX, etc).
      * @return the card brand (VISA, MC, AMEX, etc).
      */
     @JsonProperty("paymentType")
     public String getPaymentType() {
          return this.paymentType;
     }

     /**
      * Sets the masked primary account number.
      * @param value the masked primary account number.
      */
     public void setMaskedPan(String value) {
          this.maskedPan = value;
     }

     /**
      * Gets the masked primary account number.
      * @return the masked primary account number.
      */
     @JsonProperty("maskedPan")
     public String getMaskedPan() {
          return this.maskedPan;
     }

     /**
      * Sets the BlockChyp public key if the user presented a BlockChyp payment card.
      * @param value the BlockChyp public key if the user presented a BlockChyp payment
      * card.
      */
     public void setPublicKey(String value) {
          this.publicKey = value;
     }

     /**
      * Gets the BlockChyp public key if the user presented a BlockChyp payment card.
      * @return the BlockChyp public key if the user presented a BlockChyp payment card.
      */
     @JsonProperty("publicKey")
     public String getPublicKey() {
          return this.publicKey;
     }

     /**
      * Sets that the transaction did something that would put the system in PCI scope.
      * @param value that the transaction did something that would put the system in PCI
      * scope.
      */
     public void setScopeAlert(boolean value) {
          this.ScopeAlert = value;
     }

     /**
      * Gets that the transaction did something that would put the system in PCI scope.
      * @return that the transaction did something that would put the system in PCI scope.
      */
     @JsonProperty("ScopeAlert")
     public boolean isScopeAlert() {
          return this.ScopeAlert;
     }

     /**
      * Sets the cardholder name.
      * @param value the cardholder name.
      */
     public void setCardHolder(String value) {
          this.cardHolder = value;
     }

     /**
      * Gets the cardholder name.
      * @return the cardholder name.
      */
     @JsonProperty("cardHolder")
     public String getCardHolder() {
          return this.cardHolder;
     }

     /**
      * Sets suggested receipt fields.
      * @param value suggested receipt fields.
      */
     public void setReceiptSuggestions(ReceiptSuggestions value) {
          this.receiptSuggestions = value;
     }

     /**
      * Gets suggested receipt fields.
      * @return suggested receipt fields.
      */
     @JsonProperty("receiptSuggestions")
     public ReceiptSuggestions getReceiptSuggestions() {
          return this.receiptSuggestions;
     }

     /**
      * Sets remaining balance on the payment method.
      * @param value remaining balance on the payment method.
      */
     public void setRemainingBalance(String value) {
          this.remainingBalance = value;
     }

     /**
      * Gets remaining balance on the payment method.
      * @return remaining balance on the payment method.
      */
     @JsonProperty("remainingBalance")
     public String getRemainingBalance() {
          return this.remainingBalance;
     }

}
