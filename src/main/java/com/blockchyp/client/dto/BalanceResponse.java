package com.blockchyp.client.dto;








/**
 * models the response to a balance request.
 */

public class BalanceResponse implements ICoreResponse, IPaymentMethodResponse {
  
     
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
  
     // RemainingBalance remaining balance on the payment method. 
     private String remainingBalance;
  
  
     
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
  
     
     public void setToken(String value) {
          this.token = value;
     }
     
     public String getToken() {
          return this.token;
     }
  
     
     public void setEntryMethod(String value) {
          this.entryMethod = value;
     }
     
     public String getEntryMethod() {
          return this.entryMethod;
     }
  
     
     public void setPaymentType(String value) {
          this.paymentType = value;
     }
     
     public String getPaymentType() {
          return this.paymentType;
     }
  
     
     public void setMaskedPAN(String value) {
          this.maskedPan = value;
     }
     
     public String getMaskedPAN() {
          return this.maskedPan;
     }
  
     
     public void setPublicKey(String value) {
          this.publicKey = value;
     }
     
     public String getPublicKey() {
          return this.publicKey;
     }
  
     
     public void setScopeAlert(boolean value) {
          this.ScopeAlert = value;
     }
     
     public boolean isScopeAlert() {
          return this.ScopeAlert;
     }
  
     
     public void setCardHolder(String value) {
          this.cardHolder = value;
     }
     
     public String getCardHolder() {
          return this.cardHolder;
     }
  
     
     public void setReceiptSuggestions(ReceiptSuggestions value) {
          this.receiptSuggestions = value;
     }
     
     public ReceiptSuggestions getReceiptSuggestions() {
          return this.receiptSuggestions;
     }
  
     /**
      * remaining balance on the payment method.
      */
     public void setRemainingBalance(String value) {
          this.remainingBalance = value;
     }
     /**
      * remaining balance on the payment method.
      */
     public String getRemainingBalance() {
          return this.remainingBalance;
     }
  

  
}