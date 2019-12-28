package com.blockchyp.client.dto;








/**
 * models the information needed to activate or recharge a gift card.
 */

public class GiftActivateRequest implements ICoreRequest, IRequestAmount, ITerminalReference {
  
     
     private String transactionRef;
  
     
     private String orderRef;
  
     
     private String destinationAccount;
  
     
     private boolean test;
  
     
     private int timeout;
  
     
     private String currencyCode;
  
     
     private String amount;
  
     
     private boolean taxExempt;
  
     
     private String terminalName;
  
  
     
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
  
     
     public void setTerminalName(String value) {
          this.terminalName = value;
     }
     
     public String getTerminalName() {
          return this.terminalName;
     }
  

  
}