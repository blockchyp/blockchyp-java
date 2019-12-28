package com.blockchyp.client.dto;

import com.blockchyp.client.CardType;






/**
 * models balance requests.
 */

public class BalanceRequest implements ICoreRequest, IPaymentMethod, ITerminalReference {
  
     
     private String transactionRef;
  
     
     private String orderRef;
  
     
     private String destinationAccount;
  
     
     private boolean test;
  
     
     private int timeout;
  
     
     private String token;
  
     
     private String track1;
  
     
     private String track2;
  
     
     private String pan;
  
     
     private String routingNumber;
  
     
     private String cardholderName;
  
     
     private String expMonth;
  
     
     private String expYear;
  
     
     private String cvv;
  
     
     private String address;
  
     
     private String postalCode;
  
     // ManualEntry specifies that the payment entry method is a manual keyed transaction. If this is true, no other payment method will be accepted. 
     private boolean manualEntry;
  
     // KSN is the key serial number used for DUKPT encryption. 
     private String ksn;
  
     // PINBlock is the encrypted pin block. 
     private String pinBlock;
  
     // CardType designates categories of cards: credit, debit, EBT. 
     private CardType cardType;
  
     // PaymentType designates brands of payment methods: Visa, Discover, etc. 
     private String paymentType;
  
     
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
  
     
     public void setToken(String value) {
          this.token = value;
     }
     
     public String getToken() {
          return this.token;
     }
  
     
     public void setTrack1(String value) {
          this.track1 = value;
     }
     
     public String getTrack1() {
          return this.track1;
     }
  
     
     public void setTrack2(String value) {
          this.track2 = value;
     }
     
     public String getTrack2() {
          return this.track2;
     }
  
     
     public void setPAN(String value) {
          this.pan = value;
     }
     
     public String getPAN() {
          return this.pan;
     }
  
     
     public void setRoutingNumber(String value) {
          this.routingNumber = value;
     }
     
     public String getRoutingNumber() {
          return this.routingNumber;
     }
  
     
     public void setCardholderName(String value) {
          this.cardholderName = value;
     }
     
     public String getCardholderName() {
          return this.cardholderName;
     }
  
     
     public void setExpMonth(String value) {
          this.expMonth = value;
     }
     
     public String getExpMonth() {
          return this.expMonth;
     }
  
     
     public void setExpYear(String value) {
          this.expYear = value;
     }
     
     public String getExpYear() {
          return this.expYear;
     }
  
     
     public void setCVV(String value) {
          this.cvv = value;
     }
     
     public String getCVV() {
          return this.cvv;
     }
  
     
     public void setAddress(String value) {
          this.address = value;
     }
     
     public String getAddress() {
          return this.address;
     }
  
     
     public void setPostalCode(String value) {
          this.postalCode = value;
     }
     
     public String getPostalCode() {
          return this.postalCode;
     }
  
     /**
      * specifies that the payment entry method is a manual keyed transaction. If this is true, no other payment method will be accepted.
      */
     public void setManualEntry(boolean value) {
          this.manualEntry = value;
     }
     /**
      * specifies that the payment entry method is a manual keyed transaction. If this is true, no other payment method will be accepted.
      */
     public boolean isManualEntry() {
          return this.manualEntry;
     }
  
     /**
      * is the key serial number used for DUKPT encryption.
      */
     public void setKSN(String value) {
          this.ksn = value;
     }
     /**
      * is the key serial number used for DUKPT encryption.
      */
     public String getKSN() {
          return this.ksn;
     }
  
     /**
      * is the encrypted pin block.
      */
     public void setPINBlock(String value) {
          this.pinBlock = value;
     }
     /**
      * is the encrypted pin block.
      */
     public String getPINBlock() {
          return this.pinBlock;
     }
  
     /**
      * designates categories of cards: credit, debit, EBT.
      */
     public void setCardType(CardType value) {
          this.cardType = value;
     }
     /**
      * designates categories of cards: credit, debit, EBT.
      */
     public CardType getCardType() {
          return this.cardType;
     }
  
     /**
      * designates brands of payment methods: Visa, Discover, etc.
      */
     public void setPaymentType(String value) {
          this.paymentType = value;
     }
     /**
      * designates brands of payment methods: Visa, Discover, etc.
      */
     public String getPaymentType() {
          return this.paymentType;
     }
  
     
     public void setTerminalName(String value) {
          this.terminalName = value;
     }
     
     public String getTerminalName() {
          return this.terminalName;
     }
  

  
}