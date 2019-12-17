package com.blockchyp.client.dto;








/**
 * models a simple yes no prompt request.
 */

public class BooleanPromptRequest implements ICoreRequest, ITerminalReference {
  
     
     private String transactionRef;
  
     
     private String orderRef;
  
     
     private String destinationAccount;
  
     
     private boolean test;
  
     
     private int timeout;
  
     
     private String terminalName;
  
     
     private String yesCaption;
  
     
     private String noCaption;
  
     
     private String prompt;
  
  
     
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
  
     
     public void setYesCaption(String value) {
          this.yesCaption = value;
     }
     
     public String getYesCaption() {
          return this.yesCaption;
     }
  
     
     public void setNoCaption(String value) {
          this.noCaption = value;
     }
     
     public String getNoCaption() {
          return this.noCaption;
     }
  
     
     public void setPrompt(String value) {
          this.prompt = value;
     }
     
     public String getPrompt() {
          return this.prompt;
     }
  

  
}