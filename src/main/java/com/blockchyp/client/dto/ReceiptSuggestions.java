package com.blockchyp.client.dto;








/**
 * models EMV fields we recommend developers put on their receipts.
 */

public class ReceiptSuggestions {
  
     // AID is the EMV Application Identifier. 
     private String aid;
  
     // ARQC is the EMV Application Request Cryptogram. 
     private String arqc;
  
     // IAD is EMV Issuer Application Data. 
     private String iad;
  
     // ARC is the EMV Authorization Response Code. 
     private String arc;
  
     // TC is the EMV Transaction Certificate. 
     private String tc;
  
     // TVR is the EMV Terminal Verification Response. 
     private String tvr;
  
     // TSI is the EMV Transaction Status Indicator. 
     private String tsi;
  
     
     private String terminalId;
  
     
     private String merchantName;
  
     
     private String merchantId;
  
     
     private String merchantKey;
  
     
     private String applicationLabel;
  
     
     private boolean requestSignature;
  
     
     private String maskedPan;
  
     
     private String authorizedAmount;
  
     
     private String transactionType;
  
     
     private String entryMethod;
  
     
     private boolean pinVerified;
  
     
     private String cashBackAmount;
  
  
     /**
      * is the EMV Application Identifier.
      */
     public void setAID(String value) {
          this.aid = value;
     }
     /**
      * is the EMV Application Identifier.
      */
     public String getAID() {
          return this.aid;
     }
  
     /**
      * is the EMV Application Request Cryptogram.
      */
     public void setARQC(String value) {
          this.arqc = value;
     }
     /**
      * is the EMV Application Request Cryptogram.
      */
     public String getARQC() {
          return this.arqc;
     }
  
     /**
      * is EMV Issuer Application Data.
      */
     public void setIAD(String value) {
          this.iad = value;
     }
     /**
      * is EMV Issuer Application Data.
      */
     public String getIAD() {
          return this.iad;
     }
  
     /**
      * is the EMV Authorization Response Code.
      */
     public void setARC(String value) {
          this.arc = value;
     }
     /**
      * is the EMV Authorization Response Code.
      */
     public String getARC() {
          return this.arc;
     }
  
     /**
      * is the EMV Transaction Certificate.
      */
     public void setTC(String value) {
          this.tc = value;
     }
     /**
      * is the EMV Transaction Certificate.
      */
     public String getTC() {
          return this.tc;
     }
  
     /**
      * is the EMV Terminal Verification Response.
      */
     public void setTVR(String value) {
          this.tvr = value;
     }
     /**
      * is the EMV Terminal Verification Response.
      */
     public String getTVR() {
          return this.tvr;
     }
  
     /**
      * is the EMV Transaction Status Indicator.
      */
     public void setTSI(String value) {
          this.tsi = value;
     }
     /**
      * is the EMV Transaction Status Indicator.
      */
     public String getTSI() {
          return this.tsi;
     }
  
     
     public void setTerminalID(String value) {
          this.terminalId = value;
     }
     
     public String getTerminalID() {
          return this.terminalId;
     }
  
     
     public void setMerchantName(String value) {
          this.merchantName = value;
     }
     
     public String getMerchantName() {
          return this.merchantName;
     }
  
     
     public void setMerchantID(String value) {
          this.merchantId = value;
     }
     
     public String getMerchantID() {
          return this.merchantId;
     }
  
     
     public void setMerchantKey(String value) {
          this.merchantKey = value;
     }
     
     public String getMerchantKey() {
          return this.merchantKey;
     }
  
     
     public void setApplicationLabel(String value) {
          this.applicationLabel = value;
     }
     
     public String getApplicationLabel() {
          return this.applicationLabel;
     }
  
     
     public void setRequestSignature(boolean value) {
          this.requestSignature = value;
     }
     
     public boolean isRequestSignature() {
          return this.requestSignature;
     }
  
     
     public void setMaskedPAN(String value) {
          this.maskedPan = value;
     }
     
     public String getMaskedPAN() {
          return this.maskedPan;
     }
  
     
     public void setAuthorizedAmount(String value) {
          this.authorizedAmount = value;
     }
     
     public String getAuthorizedAmount() {
          return this.authorizedAmount;
     }
  
     
     public void setTransactionType(String value) {
          this.transactionType = value;
     }
     
     public String getTransactionType() {
          return this.transactionType;
     }
  
     
     public void setEntryMethod(String value) {
          this.entryMethod = value;
     }
     
     public String getEntryMethod() {
          return this.entryMethod;
     }
  
     
     public void setPINVerified(boolean value) {
          this.pinVerified = value;
     }
     
     public boolean isPINVerified() {
          return this.pinVerified;
     }
  
     
     public void setCashBackAmount(String value) {
          this.cashBackAmount = value;
     }
     
     public String getCashBackAmount() {
          return this.cashBackAmount;
     }
  

  
}