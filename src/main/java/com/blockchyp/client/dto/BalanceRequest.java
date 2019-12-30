/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */
package com.blockchyp.client.dto;


import com.blockchyp.client.CardType;


/**
 * Balance requests.
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

     private boolean manualEntry;

     private String ksn;

     private String pinBlock;

     private CardType cardType;

     private String paymentType;

     private String terminalName;

     /**
      * Sets the transaction reference string assigned to the transaction request.
      * @param value the transaction reference string assigned to the transaction
      * request. If no transaction ref was assiged on the request, then the gateway will
      * randomly generate one.
      */
     public void setTransactionRef(String value) {
          this.transactionRef = value;
     }

     /**
      * Gets the transaction reference string assigned to the transaction request.
      * @return the transaction reference string assigned to the transaction request.
      * If no transaction ref was assiged on the request, then the gateway will randomly
      * generate one.
      */
     public String getTransactionRef() {
          return this.transactionRef;
     }

     /**
      * Sets an identifier from an external point of sale system.
      * @param value an identifier from an external point of sale system.
      */
     public void setOrderRef(String value) {
          this.orderRef = value;
     }

     /**
      * Gets an identifier from an external point of sale system.
      * @return an identifier from an external point of sale system.
      */
     public String getOrderRef() {
          return this.orderRef;
     }

     /**
      * Sets the settlement account for merchants with split settlements.
      * @param value the settlement account for merchants with split settlements.
      */
     public void setDestinationAccount(String value) {
          this.destinationAccount = value;
     }

     /**
      * Gets the settlement account for merchants with split settlements.
      * @return the settlement account for merchants with split settlements.
      */
     public String getDestinationAccount() {
          return this.destinationAccount;
     }

     /**
      * Sets whether or not to route transaction to the test gateway.
      * @param value whether or not to route transaction to the test gateway.
      */
     public void setTest(boolean value) {
          this.test = value;
     }

     /**
      * Gets whether or not to route transaction to the test gateway.
      * @return whether or not to route transaction to the test gateway.
      */
     public boolean isTest() {
          return this.test;
     }

     /**
      * Sets the request timeout in milliseconds.
      * @param value the request timeout in milliseconds.
      */
     public void setTimeout(int value) {
          this.timeout = value;
     }

     /**
      * Gets the request timeout in milliseconds.
      * @return the request timeout in milliseconds.
      */
     public int getTimeout() {
          return this.timeout;
     }

     /**
      * Sets the payment token to be used for this transaction.
      * @param value the payment token to be used for this transaction. This should be used
      * for recurring transactions.
      */
     public void setToken(String value) {
          this.token = value;
     }

     /**
      * Gets the payment token to be used for this transaction.
      * @return the payment token to be used for this transaction. This should be used for
      * recurring transactions.
      */
     public String getToken() {
          return this.token;
     }

     /**
      * Sets track 1 magnetic stripe data.
      * @param value track 1 magnetic stripe data.
      */
     public void setTrack1(String value) {
          this.track1 = value;
     }

     /**
      * Gets track 1 magnetic stripe data.
      * @return track 1 magnetic stripe data.
      */
     public String getTrack1() {
          return this.track1;
     }

     /**
      * Sets track 2 magnetic stripe data.
      * @param value track 2 magnetic stripe data.
      */
     public void setTrack2(String value) {
          this.track2 = value;
     }

     /**
      * Gets track 2 magnetic stripe data.
      * @return track 2 magnetic stripe data.
      */
     public String getTrack2() {
          return this.track2;
     }

     /**
      * Sets the primary account number.
      * @param value the primary account number. We recommend using the terminal or
      * e-commerce tokenization libraries instead of passing account numbers in
      * directly, as this would put your application in PCI scope.
      */
     public void setPAN(String value) {
          this.pan = value;
     }

     /**
      * Gets the primary account number.
      * @return the primary account number. We recommend using the terminal or
      * e-commerce tokenization libraries instead of passing account numbers in
      * directly, as this would put your application in PCI scope.
      */
     public String getPAN() {
          return this.pan;
     }

     /**
      * Sets the ACH routing number for ACH transactions.
      * @param value the ACH routing number for ACH transactions.
      */
     public void setRoutingNumber(String value) {
          this.routingNumber = value;
     }

     /**
      * Gets the ACH routing number for ACH transactions.
      * @return the ACH routing number for ACH transactions.
      */
     public String getRoutingNumber() {
          return this.routingNumber;
     }

     /**
      * Sets the cardholder name.
      * @param value the cardholder name. Only required if the request includes a primary
      * account number or track data.
      */
     public void setCardholderName(String value) {
          this.cardholderName = value;
     }

     /**
      * Gets the cardholder name.
      * @return the cardholder name. Only required if the request includes a primary
      * account number or track data.
      */
     public String getCardholderName() {
          return this.cardholderName;
     }

     /**
      * Sets the card expiration month for use with PAN based transactions.
      * @param value the card expiration month for use with PAN based transactions.
      */
     public void setExpMonth(String value) {
          this.expMonth = value;
     }

     /**
      * Gets the card expiration month for use with PAN based transactions.
      * @return the card expiration month for use with PAN based transactions.
      */
     public String getExpMonth() {
          return this.expMonth;
     }

     /**
      * Sets the card expiration year for use with PAN based transactions.
      * @param value the card expiration year for use with PAN based transactions.
      */
     public void setExpYear(String value) {
          this.expYear = value;
     }

     /**
      * Gets the card expiration year for use with PAN based transactions.
      * @return the card expiration year for use with PAN based transactions.
      */
     public String getExpYear() {
          return this.expYear;
     }

     /**
      * Sets the card CVV for use with PAN based transactions.
      * @param value the card CVV for use with PAN based transactions.
      */
     public void setCVV(String value) {
          this.cvv = value;
     }

     /**
      * Gets the card CVV for use with PAN based transactions.
      * @return the card CVV for use with PAN based transactions.
      */
     public String getCVV() {
          return this.cvv;
     }

     /**
      * Sets the cardholder address for use with address verification.
      * @param value the cardholder address for use with address verification.
      */
     public void setAddress(String value) {
          this.address = value;
     }

     /**
      * Gets the cardholder address for use with address verification.
      * @return the cardholder address for use with address verification.
      */
     public String getAddress() {
          return this.address;
     }

     /**
      * Sets the cardholder postal code for use with address verification.
      * @param value the cardholder postal code for use with address verification.
      */
     public void setPostalCode(String value) {
          this.postalCode = value;
     }

     /**
      * Gets the cardholder postal code for use with address verification.
      * @return the cardholder postal code for use with address verification.
      */
     public String getPostalCode() {
          return this.postalCode;
     }

     /**
      * Sets that the payment entry method is a manual keyed transaction.
      * @param value that the payment entry method is a manual keyed transaction. If this
      * is true, no other payment method will be accepted.
      */
     public void setManualEntry(boolean value) {
          this.manualEntry = value;
     }

     /**
      * Gets that the payment entry method is a manual keyed transaction.
      * @return that the payment entry method is a manual keyed transaction. If this is
      * true, no other payment method will be accepted.
      */
     public boolean isManualEntry() {
          return this.manualEntry;
     }

     /**
      * Sets the key serial number used for DUKPT encryption.
      * @param value the key serial number used for DUKPT encryption.
      */
     public void setKSN(String value) {
          this.ksn = value;
     }

     /**
      * Gets the key serial number used for DUKPT encryption.
      * @return the key serial number used for DUKPT encryption.
      */
     public String getKSN() {
          return this.ksn;
     }

     /**
      * Sets the encrypted pin block.
      * @param value the encrypted pin block.
      */
     public void setPINBlock(String value) {
          this.pinBlock = value;
     }

     /**
      * Gets the encrypted pin block.
      * @return the encrypted pin block.
      */
     public String getPINBlock() {
          return this.pinBlock;
     }

     /**
      * Sets designates categories of cards: credit, debit, EBT.
      * @param value designates categories of cards: credit, debit, EBT.
      */
     public void setCardType(CardType value) {
          this.cardType = value;
     }

     /**
      * Gets designates categories of cards: credit, debit, EBT.
      * @return designates categories of cards: credit, debit, EBT.
      */
     public CardType getCardType() {
          return this.cardType;
     }

     /**
      * Sets designates brands of payment methods: Visa, Discover, etc.
      * @param value designates brands of payment methods: Visa, Discover, etc.
      */
     public void setPaymentType(String value) {
          this.paymentType = value;
     }

     /**
      * Gets designates brands of payment methods: Visa, Discover, etc.
      * @return designates brands of payment methods: Visa, Discover, etc.
      */
     public String getPaymentType() {
          return this.paymentType;
     }

     /**
      * Sets the name of the target payment terminal.
      * @param value the name of the target payment terminal.
      */
     public void setTerminalName(String value) {
          this.terminalName = value;
     }

     /**
      * Gets the name of the target payment terminal.
      * @return the name of the target payment terminal.
      */
     public String getTerminalName() {
          return this.terminalName;
     }

}
