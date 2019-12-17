package com.blockchyp.client.dto;








/**
 * models the information needed to capture a preauth.
 */

public class CaptureRequest implements ICoreRequest, IRequestAmount, ISubtotals, IPreviousTransaction {
  
     
     private String transactionRef;
  
     
     private String orderRef;
  
     
     private String destinationAccount;
  
     
     private boolean test;
  
     
     private int timeout;
  
     
     private String currencyCode;
  
     
     private String amount;
  
     
     private boolean taxExempt;
  
     
     private String tipAmount;
  
     
     private String taxAmount;
  
     
     private String cashBackAmount;
  
     
     private String fsaEligibleAmount;
  
     
     private String hsaEligibleAmount;
  
     
     private String ebtEligibleAmount;
  
     
     private String transactionId;
  
  
     
     public void setTransactionRef(String value) {
          this.transactionRef = value;
     }
     
     public String getTransactionRef() {
          return this.transactionRef;
     }
  
     
     public void setOrderRef(String value) {
          this.orderRef = value;
     }
     
     public String getOrderRef() {
          return this.orderRef;
     }
  
     
     public void setDestinationAccount(String value) {
          this.destinationAccount = value;
     }
     
     public String getDestinationAccount() {
          return this.destinationAccount;
     }
  
     
     public void setTest(boolean value) {
          this.test = value;
     }
     
     public boolean isTest() {
          return this.test;
     }
  
     
     public void setTimeout(int value) {
          this.timeout = value;
     }
     
     public int getTimeout() {
          return this.timeout;
     }
  
     
     public void setCurrencyCode(String value) {
          this.currencyCode = value;
     }
     
     public String getCurrencyCode() {
          return this.currencyCode;
     }
  
     
     public void setAmount(String value) {
          this.amount = value;
     }
     
     public String getAmount() {
          return this.amount;
     }
  
     
     public void setTaxExempt(boolean value) {
          this.taxExempt = value;
     }
     
     public boolean isTaxExempt() {
          return this.taxExempt;
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
  
     
     public void setCashBackAmount(String value) {
          this.cashBackAmount = value;
     }
     
     public String getCashBackAmount() {
          return this.cashBackAmount;
     }
  
     
     public void setFSAEligibleAmount(String value) {
          this.fsaEligibleAmount = value;
     }
     
     public String getFSAEligibleAmount() {
          return this.fsaEligibleAmount;
     }
  
     
     public void setHSAEligibleAmount(String value) {
          this.hsaEligibleAmount = value;
     }
     
     public String getHSAEligibleAmount() {
          return this.hsaEligibleAmount;
     }
  
     
     public void setEBTEligibleAmount(String value) {
          this.ebtEligibleAmount = value;
     }
     
     public String getEBTEligibleAmount() {
          return this.ebtEligibleAmount;
     }
  
     
     public void setTransactionID(String value) {
          this.transactionId = value;
     }
     
     public String getTransactionID() {
          return this.transactionId;
     }
  

  
}