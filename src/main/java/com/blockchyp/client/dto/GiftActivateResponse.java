package com.blockchyp.client.dto;








/**
 * models the response to a gift activate request.
 */

public class GiftActivateResponse implements ICoreResponse {
  
     
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
  
  
     
     public void setSuccess(boolean value) {
          this.success = value;
     }
     
     public boolean isSuccess() {
          return this.success;
     }
  
     
     public void setError(String value) {
          this.error = value;
     }
     
     public String getError() {
          return this.error;
     }
  
     
     public void setResponseDescription(String value) {
          this.responseDescription = value;
     }
     
     public String getResponseDescription() {
          return this.responseDescription;
     }
  
     
     public void setTransactionID(String value) {
          this.transactionId = value;
     }
     
     public String getTransactionID() {
          return this.transactionId;
     }
  
     
     public void setBatchID(String value) {
          this.batchId = value;
     }
     
     public String getBatchID() {
          return this.batchId;
     }
  
     
     public void setTransactionRef(String value) {
          this.transactionRef = value;
     }
     
     public String getTransactionRef() {
          return this.transactionRef;
     }
  
     
     public void setTransactionType(String value) {
          this.transactionType = value;
     }
     
     public String getTransactionType() {
          return this.transactionType;
     }
  
     
     public void setTimestamp(String value) {
          this.timestamp = value;
     }
     
     public String getTimestamp() {
          return this.timestamp;
     }
  
     
     public void setTickBlock(String value) {
          this.tickBlock = value;
     }
     
     public String getTickBlock() {
          return this.tickBlock;
     }
  
     
     public void setTest(boolean value) {
          this.test = value;
     }
     
     public boolean isTest() {
          return this.test;
     }
  
     
     public void setSig(String value) {
          this.sig = value;
     }
     
     public String getSig() {
          return this.sig;
     }
  
     
     public void setApproved(boolean value) {
          this.approved = value;
     }
     
     public boolean isApproved() {
          return this.approved;
     }
  
     
     public void setAmount(String value) {
          this.amount = value;
     }
     
     public String getAmount() {
          return this.amount;
     }
  
     
     public void setCurrentBalance(String value) {
          this.currentBalance = value;
     }
     
     public String getCurrentBalance() {
          return this.currentBalance;
     }
  
     
     public void setCurrencyCode(String value) {
          this.currencyCode = value;
     }
     
     public String getCurrencyCode() {
          return this.currencyCode;
     }
  
     
     public void setPublicKey(String value) {
          this.publicKey = value;
     }
     
     public String getPublicKey() {
          return this.publicKey;
     }
  

  
}