package com.blockchyp.client.dto;








/**
 * is used to start or update a transaction line item display on a terminal.
 */

public class TransactionDisplayRequest implements ICoreRequest, ITerminalReference {
  
     
     private String transactionRef;
  
     
     private String orderRef;
  
     
     private String destinationAccount;
  
     
     private boolean test;
  
     
     private int timeout;
  
     
     private String terminalName;
  
     // Transaction is the transaction to display on the terminal. 
     private TransactionDisplayTransaction transaction;
  
  
     
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
  
     
     public void setTerminalName(String value) {
          this.terminalName = value;
     }
     
     public String getTerminalName() {
          return this.terminalName;
     }
  
     /**
      * is the transaction to display on the terminal.
      */
     public void setTransaction(TransactionDisplayTransaction value) {
          this.transaction = value;
     }
     /**
      * is the transaction to display on the terminal.
      */
     public TransactionDisplayTransaction getTransaction() {
          return this.transaction;
     }
  

  
}