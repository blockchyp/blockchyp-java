package com.blockchyp.client.dto;








/**
 * models the fields needed for custom T&C prompts.
 */

public class TermsAndConditionsRequest implements ICoreRequest, ITerminalReference, IPreviousTransaction, ISignatureRequest {
  
     
     private String transactionRef;
  
     
     private String orderRef;
  
     
     private String destinationAccount;
  
     
     private boolean test;
  
     
     private int timeout;
  
     
     private String terminalName;
  
     
     private String transactionId;
  
     
     private String sigFile;
  
     // SigFormat specifies the image format to be used for returning signatures. (PNG or JPEG). 
     private String sigFormat;
  
     // SigWidth scales the signature image to the given width, preserving the aspect ratio.  If not provided, the signature is returned in the terminal's max resolution. 
     private int sigWidth;
  
     
     private String tcAlias;
  
     
     private String tcName;
  
     
     private String tcContent;
  
     
     private boolean sigRequired;
  
  
     
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
  
     
     public void setTransactionID(String value) {
          this.transactionId = value;
     }
     
     public String getTransactionID() {
          return this.transactionId;
     }
  
     
     public void setSigFile(String value) {
          this.sigFile = value;
     }
     
     public String getSigFile() {
          return this.sigFile;
     }
  
     /**
      * specifies the image format to be used for returning signatures. (PNG or JPEG).
      */
     public void setSigFormat(String value) {
          this.sigFormat = value;
     }
     /**
      * specifies the image format to be used for returning signatures. (PNG or JPEG).
      */
     public String getSigFormat() {
          return this.sigFormat;
     }
  
     /**
      * scales the signature image to the given width, preserving the aspect ratio.  If not provided, the signature is returned in the terminal's max resolution.
      */
     public void setSigWidth(int value) {
          this.sigWidth = value;
     }
     /**
      * scales the signature image to the given width, preserving the aspect ratio.  If not provided, the signature is returned in the terminal's max resolution.
      */
     public int getSigWidth() {
          return this.sigWidth;
     }
  
     
     public void setTCAlias(String value) {
          this.tcAlias = value;
     }
     
     public String getTCAlias() {
          return this.tcAlias;
     }
  
     
     public void setTCName(String value) {
          this.tcName = value;
     }
     
     public String getTCName() {
          return this.tcName;
     }
  
     
     public void setTCContent(String value) {
          this.tcContent = value;
     }
     
     public String getTCContent() {
          return this.tcContent;
     }
  
     
     public void setSigRequired(boolean value) {
          this.sigRequired = value;
     }
     
     public boolean isSigRequired() {
          return this.sigRequired;
     }
  

  
}