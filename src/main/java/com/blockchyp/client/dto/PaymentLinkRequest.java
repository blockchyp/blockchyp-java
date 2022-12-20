/**
 * Copyright 2019-2022 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Creates a payment link.
 */
public class PaymentLinkRequest implements ITimeoutRequest, ICoreRequest, IRequestAmount, ITerminalReference {

     private int timeout;

     private boolean test;

     private String transactionRef;

     private boolean async;

     private boolean queue;

     private boolean waitForRemovedCard;

     private boolean force;

     private String orderRef;

     private String destinationAccount;

     private String currencyCode;

     private String amount;

     private boolean taxExempt;

     private boolean surcharge;

     private boolean cashDiscount;

     private String terminalName;

     private boolean resetConnection;

     private boolean autoSend;

     private boolean enroll;

     private boolean enrollOnly;

     private boolean qrcodeBinary;

     private int qrcodeSize;

     private int daysToExpiration;

     private boolean cashier;

     private String description;

     private String subject;

     private TransactionDisplayTransaction transaction;

     private Customer customer;

     private String callbackUrl;

     private String tcAlias;

     private String tcName;

     private String tcContent;

     private String cryptocurrency;

     private String cryptoNetwork;

     private String cryptoReceiveAddress;

     private String paymentRequestLabel;

     private String paymentRequestMessage;

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
     * Sets a flag to add a surcharge to the transaction to cover credit card fees, if
     * permitted.
     * @param value a flag to add a surcharge to the transaction to cover credit card fees,
     * if permitted.
     */
     public void setSurcharge(boolean value) {
          this.surcharge = value;
     }

    /**
     * Gets a flag to add a surcharge to the transaction to cover credit card fees, if
     * permitted.
     * @return a flag to add a surcharge to the transaction to cover credit card fees, if
     * permitted.
     */
     @JsonProperty("surcharge")
     public boolean isSurcharge() {
          return this.surcharge;
     }

    /**
     * Sets a flag that applies a discount to negate the surcharge for debit transactions
     * or other surcharge ineligible payment methods.
     * @param value a flag that applies a discount to negate the surcharge for debit
     * transactions or other surcharge ineligible payment methods.
     */
     public void setCashDiscount(boolean value) {
          this.cashDiscount = value;
     }

    /**
     * Gets a flag that applies a discount to negate the surcharge for debit transactions
     * or other surcharge ineligible payment methods.
     * @return a flag that applies a discount to negate the surcharge for debit
     * transactions or other surcharge ineligible payment methods.
     */
     @JsonProperty("cashDiscount")
     public boolean isCashDiscount() {
          return this.cashDiscount;
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
     * Sets forces the terminal cloud connection to be reset while a transactions is in
     * flight.
     * @param value forces the terminal cloud connection to be reset while a transactions
     * is in flight. This is a diagnostic settings that can be used only for test
     * transactions.
     */
     public void setResetConnection(boolean value) {
          this.resetConnection = value;
     }

    /**
     * Gets forces the terminal cloud connection to be reset while a transactions is in
     * flight.
     * @return forces the terminal cloud connection to be reset while a transactions is in
     * flight. This is a diagnostic settings that can be used only for test transactions.
     */
     @JsonProperty("resetConnection")
     public boolean isResetConnection() {
          return this.resetConnection;
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
     * Sets that the payment method should be added to the token vault alongside the
     * authorization.
     * @param value that the payment method should be added to the token vault alongside
     * the authorization.
     */
     public void setEnroll(boolean value) {
          this.enroll = value;
     }

    /**
     * Gets that the payment method should be added to the token vault alongside the
     * authorization.
     * @return that the payment method should be added to the token vault alongside the
     * authorization.
     */
     @JsonProperty("enroll")
     public boolean isEnroll() {
          return this.enroll;
     }

    /**
     * Sets that the link should be used to enroll a token only.
     * @param value that the link should be used to enroll a token only. Can only be used in
     * cashier mode.
     */
     public void setEnrollOnly(boolean value) {
          this.enrollOnly = value;
     }

    /**
     * Gets that the link should be used to enroll a token only.
     * @return that the link should be used to enroll a token only. Can only be used in
     * cashier mode.
     */
     @JsonProperty("enrollOnly")
     public boolean isEnrollOnly() {
          return this.enrollOnly;
     }

    /**
     * Sets that the QR Code binary should be returned.
     * @param value that the QR Code binary should be returned.
     */
     public void setQrcodeBinary(boolean value) {
          this.qrcodeBinary = value;
     }

    /**
     * Gets that the QR Code binary should be returned.
     * @return that the QR Code binary should be returned.
     */
     @JsonProperty("qrcodeBinary")
     public boolean isQrcodeBinary() {
          return this.qrcodeBinary;
     }

    /**
     * Sets determines the size of the qr code to be returned.
     * @param value determines the size of the qr code to be returned.
     */
     public void setQrcodeSize(int value) {
          this.qrcodeSize = value;
     }

    /**
     * Gets determines the size of the qr code to be returned.
     * @return determines the size of the qr code to be returned.
     */
     @JsonProperty("qrcodeSize")
     public int getQrcodeSize() {
          return this.qrcodeSize;
     }

    /**
     * Sets number of days until the payment link expires.
     * @param value number of days until the payment link expires.
     */
     public void setDaysToExpiration(int value) {
          this.daysToExpiration = value;
     }

    /**
     * Gets number of days until the payment link expires.
     * @return number of days until the payment link expires.
     */
     @JsonProperty("daysToExpiration")
     public int getDaysToExpiration() {
          return this.daysToExpiration;
     }

    /**
     * Sets flags the payment link as cashier facing.
     * @param value flags the payment link as cashier facing.
     */
     public void setCashier(boolean value) {
          this.cashier = value;
     }

    /**
     * Gets flags the payment link as cashier facing.
     * @return flags the payment link as cashier facing.
     */
     @JsonProperty("cashier")
     public boolean isCashier() {
          return this.cashier;
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

    /**
     * Sets optional callback url to which transaction responses for this link will be
     * posted.
     * @param value optional callback url to which transaction responses for this link
     * will be posted.
     */
     public void setCallbackUrl(String value) {
          this.callbackUrl = value;
     }

    /**
     * Gets optional callback url to which transaction responses for this link will be
     * posted.
     * @return optional callback url to which transaction responses for this link will be
     * posted.
     */
     @JsonProperty("callbackUrl")
     public String getCallbackUrl() {
          return this.callbackUrl;
     }

    /**
     * Sets an alias for a Terms and Conditions template configured in the BlockChyp
     * dashboard.
     * @param value an alias for a Terms and Conditions template configured in the
     * BlockChyp dashboard.
     */
     public void setTcAlias(String value) {
          this.tcAlias = value;
     }

    /**
     * Gets an alias for a Terms and Conditions template configured in the BlockChyp
     * dashboard.
     * @return an alias for a Terms and Conditions template configured in the BlockChyp
     * dashboard.
     */
     @JsonProperty("tcAlias")
     public String getTcAlias() {
          return this.tcAlias;
     }

    /**
     * Sets the name of the Terms and Conditions the user is accepting.
     * @param value the name of the Terms and Conditions the user is accepting.
     */
     public void setTcName(String value) {
          this.tcName = value;
     }

    /**
     * Gets the name of the Terms and Conditions the user is accepting.
     * @return the name of the Terms and Conditions the user is accepting.
     */
     @JsonProperty("tcName")
     public String getTcName() {
          return this.tcName;
     }

    /**
     * Sets the content of the terms and conditions that will be presented to the user.
     * @param value the content of the terms and conditions that will be presented to the
     * user.
     */
     public void setTcContent(String value) {
          this.tcContent = value;
     }

    /**
     * Gets the content of the terms and conditions that will be presented to the user.
     * @return the content of the terms and conditions that will be presented to the user.
     */
     @JsonProperty("tcContent")
     public String getTcContent() {
          return this.tcContent;
     }

    /**
     * Sets that the transaction should be a cryptocurrency transaction.
     * @param value that the transaction should be a cryptocurrency transaction. Value
     * should be a crypto currency code (ETH, BTC) or ANY to prompt the user to choose from
     * supported cryptocurrencies.
     */
     public void setCryptocurrency(String value) {
          this.cryptocurrency = value;
     }

    /**
     * Gets that the transaction should be a cryptocurrency transaction.
     * @return that the transaction should be a cryptocurrency transaction. Value
     * should be a crypto currency code (ETH, BTC) or ANY to prompt the user to choose from
     * supported cryptocurrencies.
     */
     @JsonProperty("cryptocurrency")
     public String getCryptocurrency() {
          return this.cryptocurrency;
     }

    /**
     * Sets an optional parameter that can be used to force a crypto transaction onto a
     * level one or level two network.
     * @param value an optional parameter that can be used to force a crypto transaction
     * onto a level one or level two network. Valid values are L1 and L2. Defaults to L1.
     */
     public void setCryptoNetwork(String value) {
          this.cryptoNetwork = value;
     }

    /**
     * Gets an optional parameter that can be used to force a crypto transaction onto a
     * level one or level two network.
     * @return an optional parameter that can be used to force a crypto transaction onto a
     * level one or level two network. Valid values are L1 and L2. Defaults to L1.
     */
     @JsonProperty("cryptoNetwork")
     public String getCryptoNetwork() {
          return this.cryptoNetwork;
     }

    /**
     * Sets can be used to specify a specific receive address for a crypto transaction.
     * @param value can be used to specify a specific receive address for a crypto
     * transaction. Disabled by default. This should only be used by sophisticated users
     * with access to properly configured hot wallets.
     */
     public void setCryptoReceiveAddress(String value) {
          this.cryptoReceiveAddress = value;
     }

    /**
     * Gets can be used to specify a specific receive address for a crypto transaction.
     * @return can be used to specify a specific receive address for a crypto transaction.
     * Disabled by default. This should only be used by sophisticated users with access to
     * properly configured hot wallets.
     */
     @JsonProperty("cryptoReceiveAddress")
     public String getCryptoReceiveAddress() {
          return this.cryptoReceiveAddress;
     }

    /**
     * Sets can optionally add a label to the payment request if the target cryptocurrency
     * supports labels.
     * @param value can optionally add a label to the payment request if the target
     * cryptocurrency supports labels. Defaults to the merchant's DBA Name.
     */
     public void setPaymentRequestLabel(String value) {
          this.paymentRequestLabel = value;
     }

    /**
     * Gets can optionally add a label to the payment request if the target cryptocurrency
     * supports labels.
     * @return can optionally add a label to the payment request if the target
     * cryptocurrency supports labels. Defaults to the merchant's DBA Name.
     */
     @JsonProperty("paymentRequestLabel")
     public String getPaymentRequestLabel() {
          return this.paymentRequestLabel;
     }

    /**
     * Sets can optionally add a message to the payment request if the target
     * cryptocurrency supports labels.
     * @param value can optionally add a message to the payment request if the target
     * cryptocurrency supports labels. Defaults to empty.
     */
     public void setPaymentRequestMessage(String value) {
          this.paymentRequestMessage = value;
     }

    /**
     * Gets can optionally add a message to the payment request if the target
     * cryptocurrency supports labels.
     * @return can optionally add a message to the payment request if the target
     * cryptocurrency supports labels. Defaults to empty.
     */
     @JsonProperty("paymentRequestMessage")
     public String getPaymentRequestMessage() {
          return this.paymentRequestMessage;
     }

}
