/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */
package com.blockchyp.client.dto;


/**
 * The information needed to activate or recharge a gift card.
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
     public String getTerminalName() {
          return this.terminalName;
     }

}