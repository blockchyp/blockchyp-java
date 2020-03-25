/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Creates a payment link.
 */
public class PaymentLinkRequest implements ICoreRequest, IRequestAmount, ITerminalReference {

     private String transactionRef;

     private String orderRef;

     private String destinationAccount;

     private boolean test;

     private int timeout;

     private String currencyCode;

     private String amount;

     private boolean taxExempt;

     private String terminalName;

     private boolean autoSend;

     private String description;

     private String subject;

     private TransactionDisplayTransaction transaction;

     private Customer customer;

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
     @JsonProperty("transactionRef")
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
      * Sets the transaction currency code.
      * @param value the transaction currency code.
      */
     public void setCurrencyCode(String value) {
          this.currencyCode = value;
     }

     /**
      * Gets the transaction currency code.
      * @return the transaction currency code.
      */
     @JsonProperty("currencyCode")
     public String getCurrencyCode() {
          return this.currencyCode;
     }

     /**
      * Sets the requested amount.
      * @param value the requested amount.
      */
     public void setAmount(String value) {
          this.amount = value;
     }

     /**
      * Gets the requested amount.
      * @return the requested amount.
      */
     @JsonProperty("amount")
     public String getAmount() {
          return this.amount;
     }

     /**
      * Sets that the request is tax exempt.
      * @param value that the request is tax exempt. Only required for tax exempt level 2
      * processing.
      */
     public void setTaxExempt(boolean value) {
          this.taxExempt = value;
     }

     /**
      * Gets that the request is tax exempt.
      * @return that the request is tax exempt. Only required for tax exempt level 2
      * processing.
      */
     @JsonProperty("taxExempt")
     public boolean isTaxExempt() {
          return this.taxExempt;
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
      * Sets automatically send the link via an email.
      * @param value automatically send the link via an email.
      */
     public void setAutoSend(boolean value) {
          this.autoSend = value;
     }

     /**
      * Gets automatically send the link via an email.
      * @return automatically send the link via an email.
      */
     @JsonProperty("autoSend")
     public boolean isAutoSend() {
          return this.autoSend;
     }

     /**
      * Sets description explaining the transaction for display to the user.
      * @param value description explaining the transaction for display to the user.
      */
     public void setDescription(String value) {
          this.description = value;
     }

     /**
      * Gets description explaining the transaction for display to the user.
      * @return description explaining the transaction for display to the user.
      */
     @JsonProperty("description")
     public String getDescription() {
          return this.description;
     }

     /**
      * Sets subject of the payment email.
      * @param value subject of the payment email.
      */
     public void setSubject(String value) {
          this.subject = value;
     }

     /**
      * Gets subject of the payment email.
      * @return subject of the payment email.
      */
     @JsonProperty("subject")
     public String getSubject() {
          return this.subject;
     }

     /**
      * Sets transaction details for display on the payment email.
      * @param value transaction details for display on the payment email.
      */
     public void setTransaction(TransactionDisplayTransaction value) {
          this.transaction = value;
     }

     /**
      * Gets transaction details for display on the payment email.
      * @return transaction details for display on the payment email.
      */
     @JsonProperty("transaction")
     public TransactionDisplayTransaction getTransaction() {
          return this.transaction;
     }

     /**
      * Sets customer information.
      * @param value customer information.
      */
     public void setCustomer(Customer value) {
          this.customer = value;
     }

     /**
      * Gets customer information.
      * @return customer information.
      */
     @JsonProperty("customer")
     public Customer getCustomer() {
          return this.customer;
     }

}
