package com.blockchyp.client.dto;








/**
 * models a void request.
 */

public class VoidRequest implements ICoreRequest, IPreviousTransaction {
  
     
     private String transactionRef;
  
     
     private String orderRef;
  
     
     private String destinationAccount;
  
     
     private boolean test;
  
     
     private int timeout;
  
     
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
  
     
     public void setTransactionID(String value) {
          this.transactionId = value;
     }
     
     public String getTransactionID() {
          return this.transactionId;
     }
  

  
}