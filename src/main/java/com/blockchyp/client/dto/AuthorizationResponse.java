package com.blockchyp.client.dto;








/**
 * models the response to authorization requests
 */

public class AuthorizationResponse implements ICoreResponse, IApprovalResponse, IPaymentMethodResponse, IPaymentAmounts {
  
     
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
  
     
     private String authCode;
  
     
     private String sigFile;
  
     
     private String token;
  
     
     private String entryMethod;
  
     
     private String paymentType;
  
     
     private String maskedPan;
  
     
     private String publicKey;
  
     
     private boolean ScopeAlert;
  
     
     private String cardHolder;
  
     
     private ReceiptSuggestions receiptSuggestions;
  
     
     private boolean partialAuth;
  
     
     private boolean altCurrency;
  
     
     private boolean fasAuth;
  
     
     private String currencyCode;
  
     
     private String requestedAmount;
  
     
     private String authorizedAmount;
  
     
     private String remainingBalance;
  
     
     private String tipAmount;
  
     
     private String taxAmount;
  
     
     private String requestedCashBackAmount;
  
     
     private String authorizedCashBackAmount;
  
     
     private WhiteListedCard whiteListedCard;
  
     
     private boolean storeAndForward;
  
  
     
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
  
     
     public void setAuthCode(String value) {
          this.authCode = value;
     }
     
     public String getAuthCode() {
          return this.authCode;
     }
  
     
     public void setSigFile(String value) {
          this.sigFile = value;
     }
     
     public String getSigFile() {
          return this.sigFile;
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
  
     
     public void setPartialAuth(boolean value) {
          this.partialAuth = value;
     }
     
     public boolean isPartialAuth() {
          return this.partialAuth;
     }
  
     
     public void setAltCurrency(boolean value) {
          this.altCurrency = value;
     }
     
     public boolean isAltCurrency() {
          return this.altCurrency;
     }
  
     
     public void setFSAAuth(boolean value) {
          this.fasAuth = value;
     }
     
     public boolean isFSAAuth() {
          return this.fasAuth;
     }
  
     
     public void setCurrencyCode(String value) {
          this.currencyCode = value;
     }
     
     public String getCurrencyCode() {
          return this.currencyCode;
     }
  
     
     public void setRequestedAmount(String value) {
          this.requestedAmount = value;
     }
     
     public String getRequestedAmount() {
          return this.requestedAmount;
     }
  
     
     public void setAuthorizedAmount(String value) {
          this.authorizedAmount = value;
     }
     
     public String getAuthorizedAmount() {
          return this.authorizedAmount;
     }
  
     
     public void setRemainingBalance(String value) {
          this.remainingBalance = value;
     }
     
     public String getRemainingBalance() {
          return this.remainingBalance;
     }
  
     
     public void setTipAmount(String value) {
          this.tipAmount = value;
     }
     
     public String getTipAmount() {
          return this.tipAmount;
     }
  
     
     public void setTaxAmount(String value) {
          this.taxAmount = value;
     }
     
     public String getTaxAmount() {
          return this.taxAmount;
     }
  
     
     public void setRequestedCashBackAmount(String value) {
          this.requestedCashBackAmount = value;
     }
     
     public String getRequestedCashBackAmount() {
          return this.requestedCashBackAmount;
     }
  
     
     public void setAuthorizedCashBackAmount(String value) {
          this.authorizedCashBackAmount = value;
     }
     
     public String getAuthorizedCashBackAmount() {
          return this.authorizedCashBackAmount;
     }
  
     
     public void setWhiteListedCard(WhiteListedCard value) {
          this.whiteListedCard = value;
     }
     
     public WhiteListedCard getWhiteListedCard() {
          return this.whiteListedCard;
     }
  
     
     public void setStoreAndForward(boolean value) {
          this.storeAndForward = value;
     }
     
     public boolean isStoreAndForward() {
          return this.storeAndForward;
     }
  

  
}