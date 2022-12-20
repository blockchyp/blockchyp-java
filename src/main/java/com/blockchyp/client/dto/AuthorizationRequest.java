/**
 * Copyright 2019-2022 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * An authorization request for a charge, preauth, or reverse transaction.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class AuthorizationRequest implements ITimeoutRequest, ICoreRequest, IPaymentMethod, IPreviousTransaction, IRequestAmount, ISignatureRequest, ISubtotals, ITerminalReference {

     private int timeout;

     private boolean test;

     private String transactionRef;

     private boolean async;

     private boolean queue;

     private boolean waitForRemovedCard;

     private boolean force;

     private String orderRef;

     private String destinationAccount;

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

     private String transactionId;

     private String currencyCode;

     private String amount;

     private boolean taxExempt;

     private boolean surcharge;

     private boolean cashDiscount;

     private String sigFile;

     private SignatureFormat sigFormat;

     private int sigWidth;

     private boolean disableSignature;

     private String tipAmount;

     private String taxAmount;

     private String terminalName;

     private boolean resetConnection;

     private String onlineAuthCode;

     private boolean enroll;

     private String description;

     private boolean promptForTip;

     private boolean cashBackEnabled;

     private Map altPrices;

     private Customer customer;

     private Healthcare healthcare;

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
     * Sets the ID of the previous transaction being referenced.
     * @param value the ID of the previous transaction being referenced.
     */
     public void setTransactionId(String value) {
          this.transactionId = value;
     }

    /**
     * Gets the ID of the previous transaction being referenced.
     * @return the ID of the previous transaction being referenced.
     */
     @JsonProperty("transactionId")
     public String getTransactionId() {
          return this.transactionId;
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
     * Sets a location on the filesystem which a customer signature should be written to.
     * @param value a location on the filesystem which a customer signature should be
     * written to.
     */
     public void setSigFile(String value) {
          this.sigFile = value;
     }

    /**
     * Gets a location on the filesystem which a customer signature should be written to.
     * @return a location on the filesystem which a customer signature should be written
     * to.
     */
     @JsonProperty("sigFile")
     public String getSigFile() {
          return this.sigFile;
     }

    /**
     * Sets the image format to be used for returning signatures.
     * @param value the image format to be used for returning signatures.
     */
     public void setSigFormat(SignatureFormat value) {
          this.sigFormat = value;
     }

    /**
     * Gets the image format to be used for returning signatures.
     * @return the image format to be used for returning signatures.
     */
     @JsonProperty("sigFormat")
     public SignatureFormat getSigFormat() {
          return this.sigFormat;
     }

    /**
     * Sets the width that the signature image should be scaled to, preserving the aspect
     * ratio.
     * @param value the width that the signature image should be scaled to, preserving the
     * aspect ratio. If not provided, the signature is returned in the terminal's max
     * resolution.
     */
     public void setSigWidth(int value) {
          this.sigWidth = value;
     }

    /**
     * Gets the width that the signature image should be scaled to, preserving the aspect
     * ratio.
     * @return the width that the signature image should be scaled to, preserving the
     * aspect ratio. If not provided, the signature is returned in the terminal's max
     * resolution.
     */
     @JsonProperty("sigWidth")
     public int getSigWidth() {
          return this.sigWidth;
     }

    /**
     * Sets whether or not signature prompt should be skipped on the terminal.
     * @param value whether or not signature prompt should be skipped on the terminal. The
     * terminal will indicate whether or not a signature is required by the card in the
     * receipt suggestions response.
     */
     public void setDisableSignature(boolean value) {
          this.disableSignature = value;
     }

    /**
     * Gets whether or not signature prompt should be skipped on the terminal.
     * @return whether or not signature prompt should be skipped on the terminal. The
     * terminal will indicate whether or not a signature is required by the card in the
     * receipt suggestions response.
     */
     @JsonProperty("disableSignature")
     public boolean isDisableSignature() {
          return this.disableSignature;
     }

    /**
     * Sets the tip amount.
     * @param value the tip amount.
     */
     public void setTipAmount(String value) {
          this.tipAmount = value;
     }

    /**
     * Gets the tip amount.
     * @return the tip amount.
     */
     @JsonProperty("tipAmount")
     public String getTipAmount() {
          return this.tipAmount;
     }

    /**
     * Sets the tax amount.
     * @param value the tax amount.
     */
     public void setTaxAmount(String value) {
          this.taxAmount = value;
     }

    /**
     * Gets the tax amount.
     * @return the tax amount.
     */
     @JsonProperty("taxAmount")
     public String getTaxAmount() {
          return this.taxAmount;
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
     * Sets used to validate online gift card authorizations.
     * @param value used to validate online gift card authorizations.
     */
     public void setOnlineAuthCode(String value) {
          this.onlineAuthCode = value;
     }

    /**
     * Gets used to validate online gift card authorizations.
     * @return used to validate online gift card authorizations.
     */
     @JsonProperty("onlineAuthCode")
     public String getOnlineAuthCode() {
          return this.onlineAuthCode;
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
     * Sets a narrative description of the transaction.
     * @param value a narrative description of the transaction.
     */
     public void setDescription(String value) {
          this.description = value;
     }

    /**
     * Gets a narrative description of the transaction.
     * @return a narrative description of the transaction.
     */
     @JsonProperty("description")
     public String getDescription() {
          return this.description;
     }

    /**
     * Sets that the terminal should request a tip from the user before starting the
     * transaction.
     * @param value that the terminal should request a tip from the user before starting
     * the transaction.
     */
     public void setPromptForTip(boolean value) {
          this.promptForTip = value;
     }

    /**
     * Gets that the terminal should request a tip from the user before starting the
     * transaction.
     * @return that the terminal should request a tip from the user before starting the
     * transaction.
     */
     @JsonProperty("promptForTip")
     public boolean isPromptForTip() {
          return this.promptForTip;
     }

    /**
     * Sets that cash back should be enabled for supported cards.
     * @param value that cash back should be enabled for supported cards.
     */
     public void setCashBackEnabled(boolean value) {
          this.cashBackEnabled = value;
     }

    /**
     * Gets that cash back should be enabled for supported cards.
     * @return that cash back should be enabled for supported cards.
     */
     @JsonProperty("cashBackEnabled")
     public boolean isCashBackEnabled() {
          return this.cashBackEnabled;
     }

    /**
     * Sets a map of alternate currencies and the price in each currency.
     * @param value a map of alternate currencies and the price in each currency. Use only
     * if you want to set your own exchange rate for a crypto transaction.
     */
     public void setAltPrices(Map value) {
          this.altPrices = value;
     }

    /**
     * Gets a map of alternate currencies and the price in each currency.
     * @return a map of alternate currencies and the price in each currency. Use only if you
     * want to set your own exchange rate for a crypto transaction.
     */
     @JsonProperty("altPrices")
     public Map getAltPrices() {
          return this.altPrices;
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
     * Sets details for HSA/FSA transactions.
     * @param value details for HSA/FSA transactions.
     */
     public void setHealthcare(Healthcare value) {
          this.healthcare = value;
     }

    /**
     * Gets details for HSA/FSA transactions.
     * @return details for HSA/FSA transactions.
     */
     @JsonProperty("healthcare")
     public Healthcare getHealthcare() {
          return this.healthcare;
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
