/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */
package com.blockchyp.client.dto;

import com.blockchyp.client.CardType;
import com.blockchyp.client.SignatureFormat;
import java.util.Map;

/**
 * Auth requests for charge, preauth, and reverse transaction types.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class AuthorizationRequest implements ICoreRequest, ITerminalReference, IPaymentMethod, IRequestAmount, ISubtotals, ISignatureRequest, IPreviousTransaction {

     private String transactionRef;

     private String orderRef;

     private String destinationAccount;

     private boolean test;

     private int timeout;

     private String terminalName;

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

     private String currencyCode;

     private String amount;

     private boolean taxExempt;

     private String tipAmount;

     private String taxAmount;

     private String cashBackAmount;

     private String fsaEligibleAmount;

     private String hsaEligibleAmount;

     private String ebtEligibleAmount;

     private String sigFile;

     private SignatureFormat sigFormat;

     private int sigWidth;

     private String transactionId;

     private String onlineAuthCode;

     private boolean enroll;

     private String description;

     private boolean promptForTip;

     private boolean cashBackEnabled;

     private Map altPrices;

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
     public String getTaxAmount() {
          return this.taxAmount;
     }

     /**
      * Sets the amount of cash back requested.
      * @param value the amount of cash back requested.
      */
     public void setCashBackAmount(String value) {
          this.cashBackAmount = value;
     }

     /**
      * Gets the amount of cash back requested.
      * @return the amount of cash back requested.
      */
     public String getCashBackAmount() {
          return this.cashBackAmount;
     }

     /**
      * Sets the amount of the transaction that should be charged to an FSA card.
      * @param value the amount of the transaction that should be charged to an FSA card.
      * This amount may be less than the transaction total, in which case only this amount
      * will be charged if an FSA card is presented. If the FSA amount is paid on an FSA card,
      * then the FSA amount authorized will be indicated on the response.
      */
     public void setFSAEligibleAmount(String value) {
          this.fsaEligibleAmount = value;
     }

     /**
      * Gets the amount of the transaction that should be charged to an FSA card.
      * @return the amount of the transaction that should be charged to an FSA card. This
      * amount may be less than the transaction total, in which case only this amount will
      * be charged if an FSA card is presented. If the FSA amount is paid on an FSA card, then
      * the FSA amount authorized will be indicated on the response.
      */
     public String getFSAEligibleAmount() {
          return this.fsaEligibleAmount;
     }

     /**
      * Sets the amount of the transaction that should be charged to an HSA card.
      * @param value the amount of the transaction that should be charged to an HSA card.
      */
     public void setHSAEligibleAmount(String value) {
          this.hsaEligibleAmount = value;
     }

     /**
      * Gets the amount of the transaction that should be charged to an HSA card.
      * @return the amount of the transaction that should be charged to an HSA card.
      */
     public String getHSAEligibleAmount() {
          return this.hsaEligibleAmount;
     }

     /**
      * Sets the amount of the transaction that should be charged to an EBT card.
      * @param value the amount of the transaction that should be charged to an EBT card.
      */
     public void setEBTEligibleAmount(String value) {
          this.ebtEligibleAmount = value;
     }

     /**
      * Gets the amount of the transaction that should be charged to an EBT card.
      * @return the amount of the transaction that should be charged to an EBT card.
      */
     public String getEBTEligibleAmount() {
          return this.ebtEligibleAmount;
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
     public SignatureFormat getSigFormat() {
          return this.sigFormat;
     }

     /**
      * Sets the width that the signature image should be scaled to, preserving the aspect
      * ratio.
      * @param value the width that the signature image should be scaled to, preserving
      * the aspect ratio. If not provided, the signature is returned in the terminal's max
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
     public int getSigWidth() {
          return this.sigWidth;
     }

     /**
      * Sets the ID of the previous transaction being referenced.
      * @param value the ID of the previous transaction being referenced.
      */
     public void setTransactionID(String value) {
          this.transactionId = value;
     }

     /**
      * Gets the ID of the previous transaction being referenced.
      * @return the ID of the previous transaction being referenced.
      */
     public String getTransactionID() {
          return this.transactionId;
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
     public boolean isCashBackEnabled() {
          return this.cashBackEnabled;
     }

     /**
      * Sets a map of alternate currencies and the price in each currency.
      * @param value a map of alternate currencies and the price in each currency.
      */
     public void setAltPrices(Map value) {
          this.altPrices = value;
     }

     /**
      * Gets a map of alternate currencies and the price in each currency.
      * @return a map of alternate currencies and the price in each currency.
      */
     public Map getAltPrices() {
          return this.altPrices;
     }

}
