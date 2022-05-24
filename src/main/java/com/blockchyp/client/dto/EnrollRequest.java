/**
 * Copyright 2019-2022 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.blockchyp.client.dto.CardType;

/**
 * The information needed to enroll a new payment method in the token vault.
 */
public class EnrollRequest implements ICoreRequest, IPaymentMethod, ITerminalReference {

     private String transactionRef;

     private boolean async;

     private boolean queue;

     private boolean waitForRemovedCard;

     private boolean force;

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

     private String entryMethod;

     private Customer customer;

    /**
     * Sets a user-assigned reference that can be used to recall or reverse transactions.
     * @param value a user-assigned reference that can be used to recall or reverse
     * transactions.
     */
     public void setTransactionRef(String value) {
          this.transactionRef = value;
     }

    /**
     * Gets a user-assigned reference that can be used to recall or reverse transactions.
     * @return a user-assigned reference that can be used to recall or reverse
     * transactions.
     */
     @JsonProperty("transactionRef")
     public String getTransactionRef() {
          return this.transactionRef;
     }

    /**
     * Sets defers the response to the transaction and returns immediately.
     * @param value defers the response to the transaction and returns immediately.
     * Callers should retrive the transaction result using the Transaction Status API.
     */
     public void setAsync(boolean value) {
          this.async = value;
     }

    /**
     * Gets defers the response to the transaction and returns immediately.
     * @return defers the response to the transaction and returns immediately. Callers
     * should retrive the transaction result using the Transaction Status API.
     */
     @JsonProperty("async")
     public boolean isAsync() {
          return this.async;
     }

    /**
     * Sets adds the transaction to the queue and returns immediately.
     * @param value adds the transaction to the queue and returns immediately. Callers
     * should retrive the transaction result using the Transaction Status API.
     */
     public void setQueue(boolean value) {
          this.queue = value;
     }

    /**
     * Gets adds the transaction to the queue and returns immediately.
     * @return adds the transaction to the queue and returns immediately. Callers should
     * retrive the transaction result using the Transaction Status API.
     */
     @JsonProperty("queue")
     public boolean isQueue() {
          return this.queue;
     }

    /**
     * Sets whether or not the request should block until all cards have been removed from
     * the card reader.
     * @param value whether or not the request should block until all cards have been
     * removed from the card reader.
     */
     public void setWaitForRemovedCard(boolean value) {
          this.waitForRemovedCard = value;
     }

    /**
     * Gets whether or not the request should block until all cards have been removed from
     * the card reader.
     * @return whether or not the request should block until all cards have been removed
     * from the card reader.
     */
     @JsonProperty("waitForRemovedCard")
     public boolean isWaitForRemovedCard() {
          return this.waitForRemovedCard;
     }

    /**
     * Sets override any in-progress transactions.
     * @param value override any in-progress transactions.
     */
     public void setForce(boolean value) {
          this.force = value;
     }

    /**
     * Gets override any in-progress transactions.
     * @return override any in-progress transactions.
     */
     @JsonProperty("force")
     public boolean isForce() {
          return this.force;
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
     @JsonProperty("orderRef")
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
     @JsonProperty("destinationAccount")
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
     @JsonProperty("test")
     public boolean isTest() {
          return this.test;
     }

    /**
     * Sets the request timeout in seconds.
     * @param value the request timeout in seconds.
     */
     public void setTimeout(int value) {
          this.timeout = value;
     }

    /**
     * Gets the request timeout in seconds.
     * @return the request timeout in seconds.
     */
     @JsonProperty("timeout")
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
     @JsonProperty("token")
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
     @JsonProperty("track1")
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
     @JsonProperty("track2")
     public String getTrack2() {
          return this.track2;
     }

    /**
     * Sets the primary account number.
     * @param value the primary account number. We recommend using the terminal or
     * e-commerce tokenization libraries instead of passing account numbers in
     * directly, as this would put your application in PCI scope.
     */
     public void setPan(String value) {
          this.pan = value;
     }

    /**
     * Gets the primary account number.
     * @return the primary account number. We recommend using the terminal or e-commerce
     * tokenization libraries instead of passing account numbers in directly, as this
     * would put your application in PCI scope.
     */
     @JsonProperty("pan")
     public String getPan() {
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
     @JsonProperty("routingNumber")
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
     @JsonProperty("cardholderName")
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
     @JsonProperty("expMonth")
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
     @JsonProperty("expYear")
     public String getExpYear() {
          return this.expYear;
     }

    /**
     * Sets the card CVV for use with PAN based transactions.
     * @param value the card CVV for use with PAN based transactions.
     */
     public void setCvv(String value) {
          this.cvv = value;
     }

    /**
     * Gets the card CVV for use with PAN based transactions.
     * @return the card CVV for use with PAN based transactions.
     */
     @JsonProperty("cvv")
     public String getCvv() {
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
     @JsonProperty("address")
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
     @JsonProperty("postalCode")
     public String getPostalCode() {
          return this.postalCode;
     }

    /**
     * Sets that the payment entry method is a manual keyed transaction.
     * @param value that the payment entry method is a manual keyed transaction. If this is
     * true, no other payment method will be accepted.
     */
     public void setManualEntry(boolean value) {
          this.manualEntry = value;
     }

    /**
     * Gets that the payment entry method is a manual keyed transaction.
     * @return that the payment entry method is a manual keyed transaction. If this is
     * true, no other payment method will be accepted.
     */
     @JsonProperty("manualEntry")
     public boolean isManualEntry() {
          return this.manualEntry;
     }

    /**
     * Sets the key serial number used for DUKPT encryption.
     * @param value the key serial number used for DUKPT encryption.
     */
     public void setKsn(String value) {
          this.ksn = value;
     }

    /**
     * Gets the key serial number used for DUKPT encryption.
     * @return the key serial number used for DUKPT encryption.
     */
     @JsonProperty("ksn")
     public String getKsn() {
          return this.ksn;
     }

    /**
     * Sets the encrypted pin block.
     * @param value the encrypted pin block.
     */
     public void setPinBlock(String value) {
          this.pinBlock = value;
     }

    /**
     * Gets the encrypted pin block.
     * @return the encrypted pin block.
     */
     @JsonProperty("pinBlock")
     public String getPinBlock() {
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
     @JsonProperty("cardType")
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
     @JsonProperty("paymentType")
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
     @JsonProperty("terminalName")
     public String getTerminalName() {
          return this.terminalName;
     }

    /**
     * Sets the method by which the payment card was entered (MSR, CHIP, KEYED, etc.
     * @param value the method by which the payment card was entered (MSR, CHIP, KEYED,
     * etc.).
     */
     public void setEntryMethod(String value) {
          this.entryMethod = value;
     }

    /**
     * Gets the method by which the payment card was entered (MSR, CHIP, KEYED, etc.
     * @return the method by which the payment card was entered (MSR, CHIP, KEYED, etc.).
     */
     @JsonProperty("entryMethod")
     public String getEntryMethod() {
          return this.entryMethod;
     }

    /**
     * Sets customer with which the new token should be associated.
     * @param value customer with which the new token should be associated.
     */
     public void setCustomer(Customer value) {
          this.customer = value;
     }

    /**
     * Gets customer with which the new token should be associated.
     * @return customer with which the new token should be associated.
     */
     @JsonProperty("customer")
     public Customer getCustomer() {
          return this.customer;
     }

}
