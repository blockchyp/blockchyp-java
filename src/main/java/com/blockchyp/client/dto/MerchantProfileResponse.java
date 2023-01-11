/**
 * Copyright 2019-2023 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Models a response for a single merchant profile.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class MerchantProfileResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private boolean test;

     private String merchantId;

     private String companyName;

     private String dbaName;

     private String invoiceName;

     private String contactName;

     private String contactNumber;

     private String locationName;

     private String storeNumber;

     private String partnerRef;

     private String timeZone;

     private String batchCloseTime;

     private String terminalUpdateTime;

     private boolean autoBatchClose;

     private boolean disableBatchEmails;

     private boolean pinEnabled;

     private boolean cashBackEnabled;

     private boolean storeAndForwardEnabled;

     private boolean partialAuthEnabled;

     private boolean splitBankAccountsEnabled;

     private String storeAndForwardFloorLimit;

     private String publicKey;

     private String status;

     private boolean cashDiscountEnabled;

     private int surveyTimeout;

     private int cooldownTimeout;

     private boolean tipEnabled;

     private boolean promptForTip;

     private Collection<String> tipDefaults;

     private Collection<String> cashbackPresets;

     private boolean ebtEnabled;

     private boolean freeRangeRefundsEnabled;

     private boolean pinBypassEnabled;

     private boolean giftCardsDisabled;

     private boolean tcDisabled;

     private boolean digitalSignaturesEnabled;

     private boolean digitalSignatureReversal;

     private Address billingAddress;

     private Address shippingAddress;

     private boolean visa;

     private boolean masterCard;

     private boolean amex;

     private boolean discover;

     private boolean jcb;

     private boolean unionPay;

     private boolean contactlessEmv;

     private boolean manualEntryEnabled;

     private boolean manualEntryPromptZip;

     private boolean manualEntryPromptStreetNumber;

     private boolean gatewayOnly;

     private Collection<BankAccount> bankAccounts;

    /**
     * Sets whether or not the request succeeded.
     * @param value whether or not the request succeeded.
     */
     public void setSuccess(boolean value) {
          this.success = value;
     }

    /**
     * Gets whether or not the request succeeded.
     * @return whether or not the request succeeded.
     */
     @JsonProperty("success")
     public boolean isSuccess() {
          return this.success;
     }

    /**
     * Sets the error, if an error occurred.
     * @param value the error, if an error occurred.
     */
     public void setError(String value) {
          this.error = value;
     }

    /**
     * Gets the error, if an error occurred.
     * @return the error, if an error occurred.
     */
     @JsonProperty("error")
     public String getError() {
          return this.error;
     }

    /**
     * Sets a narrative description of the transaction result.
     * @param value a narrative description of the transaction result.
     */
     public void setResponseDescription(String value) {
          this.responseDescription = value;
     }

    /**
     * Gets a narrative description of the transaction result.
     * @return a narrative description of the transaction result.
     */
     @JsonProperty("responseDescription")
     public String getResponseDescription() {
          return this.responseDescription;
     }

    /**
     * Sets that the response came from the test gateway.
     * @param value that the response came from the test gateway.
     */
     public void setTest(boolean value) {
          this.test = value;
     }

    /**
     * Gets that the response came from the test gateway.
     * @return that the response came from the test gateway.
     */
     @JsonProperty("test")
     public boolean isTest() {
          return this.test;
     }

    /**
     * Sets the merchant id.
     * @param value the merchant id.
     */
     public void setMerchantId(String value) {
          this.merchantId = value;
     }

    /**
     * Gets the merchant id.
     * @return the merchant id.
     */
     @JsonProperty("merchantId")
     public String getMerchantId() {
          return this.merchantId;
     }

    /**
     * Sets the merchant's company name.
     * @param value the merchant's company name.
     */
     public void setCompanyName(String value) {
          this.companyName = value;
     }

    /**
     * Gets the merchant's company name.
     * @return the merchant's company name.
     */
     @JsonProperty("companyName")
     public String getCompanyName() {
          return this.companyName;
     }

    /**
     * Sets the dba name of the merchant.
     * @param value the dba name of the merchant.
     */
     public void setDbaName(String value) {
          this.dbaName = value;
     }

    /**
     * Gets the dba name of the merchant.
     * @return the dba name of the merchant.
     */
     @JsonProperty("dbaName")
     public String getDbaName() {
          return this.dbaName;
     }

    /**
     * Sets the name the merchant prefers on payment link invoices.
     * @param value the name the merchant prefers on payment link invoices.
     */
     public void setInvoiceName(String value) {
          this.invoiceName = value;
     }

    /**
     * Gets the name the merchant prefers on payment link invoices.
     * @return the name the merchant prefers on payment link invoices.
     */
     @JsonProperty("invoiceName")
     public String getInvoiceName() {
          return this.invoiceName;
     }

    /**
     * Sets the contact name for the merchant.
     * @param value the contact name for the merchant.
     */
     public void setContactName(String value) {
          this.contactName = value;
     }

    /**
     * Gets the contact name for the merchant.
     * @return the contact name for the merchant.
     */
     @JsonProperty("contactName")
     public String getContactName() {
          return this.contactName;
     }

    /**
     * Sets the contact number for the merchant.
     * @param value the contact number for the merchant.
     */
     public void setContactNumber(String value) {
          this.contactNumber = value;
     }

    /**
     * Gets the contact number for the merchant.
     * @return the contact number for the merchant.
     */
     @JsonProperty("contactNumber")
     public String getContactNumber() {
          return this.contactNumber;
     }

    /**
     * Sets the location name.
     * @param value the location name.
     */
     public void setLocationName(String value) {
          this.locationName = value;
     }

    /**
     * Gets the location name.
     * @return the location name.
     */
     @JsonProperty("locationName")
     public String getLocationName() {
          return this.locationName;
     }

    /**
     * Sets the store number.
     * @param value the store number.
     */
     public void setStoreNumber(String value) {
          this.storeNumber = value;
     }

    /**
     * Gets the store number.
     * @return the store number.
     */
     @JsonProperty("storeNumber")
     public String getStoreNumber() {
          return this.storeNumber;
     }

    /**
     * Sets the partner assigne reference for this merchant.
     * @param value the partner assigne reference for this merchant.
     */
     public void setPartnerRef(String value) {
          this.partnerRef = value;
     }

    /**
     * Gets the partner assigne reference for this merchant.
     * @return the partner assigne reference for this merchant.
     */
     @JsonProperty("partnerRef")
     public String getPartnerRef() {
          return this.partnerRef;
     }

    /**
     * Sets the merchant's local time zone.
     * @param value the merchant's local time zone.
     */
     public void setTimeZone(String value) {
          this.timeZone = value;
     }

    /**
     * Gets the merchant's local time zone.
     * @return the merchant's local time zone.
     */
     @JsonProperty("timeZone")
     public String getTimeZone() {
          return this.timeZone;
     }

    /**
     * Sets the batch close time in the merchant's time zone.
     * @param value the batch close time in the merchant's time zone.
     */
     public void setBatchCloseTime(String value) {
          this.batchCloseTime = value;
     }

    /**
     * Gets the batch close time in the merchant's time zone.
     * @return the batch close time in the merchant's time zone.
     */
     @JsonProperty("batchCloseTime")
     public String getBatchCloseTime() {
          return this.batchCloseTime;
     }

    /**
     * Sets the terminal firmware update time.
     * @param value the terminal firmware update time.
     */
     public void setTerminalUpdateTime(String value) {
          this.terminalUpdateTime = value;
     }

    /**
     * Gets the terminal firmware update time.
     * @return the terminal firmware update time.
     */
     @JsonProperty("terminalUpdateTime")
     public String getTerminalUpdateTime() {
          return this.terminalUpdateTime;
     }

    /**
     * Sets flag indicating whether or not the batch automatically closes.
     * @param value flag indicating whether or not the batch automatically closes.
     */
     public void setAutoBatchClose(boolean value) {
          this.autoBatchClose = value;
     }

    /**
     * Gets flag indicating whether or not the batch automatically closes.
     * @return flag indicating whether or not the batch automatically closes.
     */
     @JsonProperty("autoBatchClose")
     public boolean isAutoBatchClose() {
          return this.autoBatchClose;
     }

    /**
     * Sets flag indicating whether or not batch closure emails should be automatically
     * sent.
     * @param value flag indicating whether or not batch closure emails should be
     * automatically sent.
     */
     public void setDisableBatchEmails(boolean value) {
          this.disableBatchEmails = value;
     }

    /**
     * Gets flag indicating whether or not batch closure emails should be automatically
     * sent.
     * @return flag indicating whether or not batch closure emails should be
     * automatically sent.
     */
     @JsonProperty("disableBatchEmails")
     public boolean isDisableBatchEmails() {
          return this.disableBatchEmails;
     }

    /**
     * Sets flag indicating whether or not pin entry is enabled.
     * @param value flag indicating whether or not pin entry is enabled.
     */
     public void setPinEnabled(boolean value) {
          this.pinEnabled = value;
     }

    /**
     * Gets flag indicating whether or not pin entry is enabled.
     * @return flag indicating whether or not pin entry is enabled.
     */
     @JsonProperty("pinEnabled")
     public boolean isPinEnabled() {
          return this.pinEnabled;
     }

    /**
     * Sets flag indicating whether or not cash back is enabled.
     * @param value flag indicating whether or not cash back is enabled.
     */
     public void setCashBackEnabled(boolean value) {
          this.cashBackEnabled = value;
     }

    /**
     * Gets flag indicating whether or not cash back is enabled.
     * @return flag indicating whether or not cash back is enabled.
     */
     @JsonProperty("cashBackEnabled")
     public boolean isCashBackEnabled() {
          return this.cashBackEnabled;
     }

    /**
     * Sets flag indicating whether or not store and forward is enabled.
     * @param value flag indicating whether or not store and forward is enabled.
     */
     public void setStoreAndForwardEnabled(boolean value) {
          this.storeAndForwardEnabled = value;
     }

    /**
     * Gets flag indicating whether or not store and forward is enabled.
     * @return flag indicating whether or not store and forward is enabled.
     */
     @JsonProperty("storeAndForwardEnabled")
     public boolean isStoreAndForwardEnabled() {
          return this.storeAndForwardEnabled;
     }

    /**
     * Sets flag indicating whether or not partial authorizations are supported for this
     * merchant.
     * @param value flag indicating whether or not partial authorizations are supported
     * for this merchant.
     */
     public void setPartialAuthEnabled(boolean value) {
          this.partialAuthEnabled = value;
     }

    /**
     * Gets flag indicating whether or not partial authorizations are supported for this
     * merchant.
     * @return flag indicating whether or not partial authorizations are supported for
     * this merchant.
     */
     @JsonProperty("partialAuthEnabled")
     public boolean isPartialAuthEnabled() {
          return this.partialAuthEnabled;
     }

    /**
     * Sets flag indicating whether or not this merchant support split settlement.
     * @param value flag indicating whether or not this merchant support split
     * settlement.
     */
     public void setSplitBankAccountsEnabled(boolean value) {
          this.splitBankAccountsEnabled = value;
     }

    /**
     * Gets flag indicating whether or not this merchant support split settlement.
     * @return flag indicating whether or not this merchant support split settlement.
     */
     @JsonProperty("splitBankAccountsEnabled")
     public boolean isSplitBankAccountsEnabled() {
          return this.splitBankAccountsEnabled;
     }

    /**
     * Sets floor limit for store and forward transactions.
     * @param value floor limit for store and forward transactions.
     */
     public void setStoreAndForwardFloorLimit(String value) {
          this.storeAndForwardFloorLimit = value;
     }

    /**
     * Gets floor limit for store and forward transactions.
     * @return floor limit for store and forward transactions.
     */
     @JsonProperty("storeAndForwardFloorLimit")
     public String getStoreAndForwardFloorLimit() {
          return this.storeAndForwardFloorLimit;
     }

    /**
     * Sets the blockchyp public key for this merchant.
     * @param value the blockchyp public key for this merchant.
     */
     public void setPublicKey(String value) {
          this.publicKey = value;
     }

    /**
     * Gets the blockchyp public key for this merchant.
     * @return the blockchyp public key for this merchant.
     */
     @JsonProperty("publicKey")
     public String getPublicKey() {
          return this.publicKey;
     }

    /**
     * Sets the underwriting/processing status for the the merchant.
     * @param value the underwriting/processing status for the the merchant.
     */
     public void setStatus(String value) {
          this.status = value;
     }

    /**
     * Gets the underwriting/processing status for the the merchant.
     * @return the underwriting/processing status for the the merchant.
     */
     @JsonProperty("status")
     public String getStatus() {
          return this.status;
     }

    /**
     * Sets enables cash discount or surcharging.
     * @param value enables cash discount or surcharging.
     */
     public void setCashDiscountEnabled(boolean value) {
          this.cashDiscountEnabled = value;
     }

    /**
     * Gets enables cash discount or surcharging.
     * @return enables cash discount or surcharging.
     */
     @JsonProperty("cashDiscountEnabled")
     public boolean isCashDiscountEnabled() {
          return this.cashDiscountEnabled;
     }

    /**
     * Sets the post transaction survey timeout in seconds.
     * @param value the post transaction survey timeout in seconds.
     */
     public void setSurveyTimeout(int value) {
          this.surveyTimeout = value;
     }

    /**
     * Gets the post transaction survey timeout in seconds.
     * @return the post transaction survey timeout in seconds.
     */
     @JsonProperty("surveyTimeout")
     public int getSurveyTimeout() {
          return this.surveyTimeout;
     }

    /**
     * Sets time a transaction result is displayed on a terminal before the terminal is
     * automatically cleared in seconds.
     * @param value time a transaction result is displayed on a terminal before the
     * terminal is automatically cleared in seconds.
     */
     public void setCooldownTimeout(int value) {
          this.cooldownTimeout = value;
     }

    /**
     * Gets time a transaction result is displayed on a terminal before the terminal is
     * automatically cleared in seconds.
     * @return time a transaction result is displayed on a terminal before the terminal is
     * automatically cleared in seconds.
     */
     @JsonProperty("cooldownTimeout")
     public int getCooldownTimeout() {
          return this.cooldownTimeout;
     }

    /**
     * Sets that tips are enabled for a merchant account.
     * @param value that tips are enabled for a merchant account.
     */
     public void setTipEnabled(boolean value) {
          this.tipEnabled = value;
     }

    /**
     * Gets that tips are enabled for a merchant account.
     * @return that tips are enabled for a merchant account.
     */
     @JsonProperty("tipEnabled")
     public boolean isTipEnabled() {
          return this.tipEnabled;
     }

    /**
     * Sets that tips should be automatically prompted for after charge and preauth
     * transactions.
     * @param value that tips should be automatically prompted for after charge and
     * preauth transactions.
     */
     public void setPromptForTip(boolean value) {
          this.promptForTip = value;
     }

    /**
     * Gets that tips should be automatically prompted for after charge and preauth
     * transactions.
     * @return that tips should be automatically prompted for after charge and preauth
     * transactions.
     */
     @JsonProperty("promptForTip")
     public boolean isPromptForTip() {
          return this.promptForTip;
     }

    /**
     * Sets three default values for tips.
     * @param value three default values for tips. Can be provided as a percentage if a
     * percent sign is provided. Otherwise the values are assumed to be basis points.
     */
     public void setTipDefaults(Collection<String> value) {
          this.tipDefaults = value;
     }

    /**
     * Gets three default values for tips.
     * @return three default values for tips. Can be provided as a percentage if a percent
     * sign is provided. Otherwise the values are assumed to be basis points.
     */
     @JsonProperty("tipDefaults")
     public Collection<String> getTipDefaults() {
          return this.tipDefaults;
     }

    /**
     * Sets four default values for cashback prompts.
     * @param value four default values for cashback prompts.
     */
     public void setCashbackPresets(Collection<String> value) {
          this.cashbackPresets = value;
     }

    /**
     * Gets four default values for cashback prompts.
     * @return four default values for cashback prompts.
     */
     @JsonProperty("cashbackPresets")
     public Collection<String> getCashbackPresets() {
          return this.cashbackPresets;
     }

    /**
     * Sets that EBT cards are enabled.
     * @param value that EBT cards are enabled.
     */
     public void setEbtEnabled(boolean value) {
          this.ebtEnabled = value;
     }

    /**
     * Gets that EBT cards are enabled.
     * @return that EBT cards are enabled.
     */
     @JsonProperty("ebtEnabled")
     public boolean isEbtEnabled() {
          return this.ebtEnabled;
     }

    /**
     * Sets that refunds without transaction references are permitted.
     * @param value that refunds without transaction references are permitted.
     */
     public void setFreeRangeRefundsEnabled(boolean value) {
          this.freeRangeRefundsEnabled = value;
     }

    /**
     * Gets that refunds without transaction references are permitted.
     * @return that refunds without transaction references are permitted.
     */
     @JsonProperty("freeRangeRefundsEnabled")
     public boolean isFreeRangeRefundsEnabled() {
          return this.freeRangeRefundsEnabled;
     }

    /**
     * Sets that pin bypass is enabled.
     * @param value that pin bypass is enabled.
     */
     public void setPinBypassEnabled(boolean value) {
          this.pinBypassEnabled = value;
     }

    /**
     * Gets that pin bypass is enabled.
     * @return that pin bypass is enabled.
     */
     @JsonProperty("pinBypassEnabled")
     public boolean isPinBypassEnabled() {
          return this.pinBypassEnabled;
     }

    /**
     * Sets that gift cards are disabled.
     * @param value that gift cards are disabled.
     */
     public void setGiftCardsDisabled(boolean value) {
          this.giftCardsDisabled = value;
     }

    /**
     * Gets that gift cards are disabled.
     * @return that gift cards are disabled.
     */
     @JsonProperty("giftCardsDisabled")
     public boolean isGiftCardsDisabled() {
          return this.giftCardsDisabled;
     }

    /**
     * Sets disables terms and conditions pages in the merchant UI.
     * @param value disables terms and conditions pages in the merchant UI.
     */
     public void setTcDisabled(boolean value) {
          this.tcDisabled = value;
     }

    /**
     * Gets disables terms and conditions pages in the merchant UI.
     * @return disables terms and conditions pages in the merchant UI.
     */
     @JsonProperty("tcDisabled")
     public boolean isTcDisabled() {
          return this.tcDisabled;
     }

    /**
     * Sets that digital signature capture is enabled.
     * @param value that digital signature capture is enabled.
     */
     public void setDigitalSignaturesEnabled(boolean value) {
          this.digitalSignaturesEnabled = value;
     }

    /**
     * Gets that digital signature capture is enabled.
     * @return that digital signature capture is enabled.
     */
     @JsonProperty("digitalSignaturesEnabled")
     public boolean isDigitalSignaturesEnabled() {
          return this.digitalSignaturesEnabled;
     }

    /**
     * Sets that transactions should auto-reverse when signatures are refused.
     * @param value that transactions should auto-reverse when signatures are refused.
     */
     public void setDigitalSignatureReversal(boolean value) {
          this.digitalSignatureReversal = value;
     }

    /**
     * Gets that transactions should auto-reverse when signatures are refused.
     * @return that transactions should auto-reverse when signatures are refused.
     */
     @JsonProperty("digitalSignatureReversal")
     public boolean isDigitalSignatureReversal() {
          return this.digitalSignatureReversal;
     }

    /**
     * Sets the address to be used for billing correspondence.
     * @param value the address to be used for billing correspondence.
     */
     public void setBillingAddress(Address value) {
          this.billingAddress = value;
     }

    /**
     * Gets the address to be used for billing correspondence.
     * @return the address to be used for billing correspondence.
     */
     @JsonProperty("billingAddress")
     public Address getBillingAddress() {
          return this.billingAddress;
     }

    /**
     * Sets the address to be used for shipping.
     * @param value the address to be used for shipping.
     */
     public void setShippingAddress(Address value) {
          this.shippingAddress = value;
     }

    /**
     * Gets the address to be used for shipping.
     * @return the address to be used for shipping.
     */
     @JsonProperty("shippingAddress")
     public Address getShippingAddress() {
          return this.shippingAddress;
     }

    /**
     * Sets that Visa cards are supported.
     * @param value that Visa cards are supported.
     */
     public void setVisa(boolean value) {
          this.visa = value;
     }

    /**
     * Gets that Visa cards are supported.
     * @return that Visa cards are supported.
     */
     @JsonProperty("visa")
     public boolean isVisa() {
          return this.visa;
     }

    /**
     * Sets that MasterCard is supported.
     * @param value that MasterCard is supported.
     */
     public void setMasterCard(boolean value) {
          this.masterCard = value;
     }

    /**
     * Gets that MasterCard is supported.
     * @return that MasterCard is supported.
     */
     @JsonProperty("masterCard")
     public boolean isMasterCard() {
          return this.masterCard;
     }

    /**
     * Sets that American Express is supported.
     * @param value that American Express is supported.
     */
     public void setAmex(boolean value) {
          this.amex = value;
     }

    /**
     * Gets that American Express is supported.
     * @return that American Express is supported.
     */
     @JsonProperty("amex")
     public boolean isAmex() {
          return this.amex;
     }

    /**
     * Sets that Discover cards are supported.
     * @param value that Discover cards are supported.
     */
     public void setDiscover(boolean value) {
          this.discover = value;
     }

    /**
     * Gets that Discover cards are supported.
     * @return that Discover cards are supported.
     */
     @JsonProperty("discover")
     public boolean isDiscover() {
          return this.discover;
     }

    /**
     * Sets that JCB (Japan Card Bureau) cards are supported.
     * @param value that JCB (Japan Card Bureau) cards are supported.
     */
     public void setJcb(boolean value) {
          this.jcb = value;
     }

    /**
     * Gets that JCB (Japan Card Bureau) cards are supported.
     * @return that JCB (Japan Card Bureau) cards are supported.
     */
     @JsonProperty("jcb")
     public boolean isJcb() {
          return this.jcb;
     }

    /**
     * Sets that China Union Pay cards are supported.
     * @param value that China Union Pay cards are supported.
     */
     public void setUnionPay(boolean value) {
          this.unionPay = value;
     }

    /**
     * Gets that China Union Pay cards are supported.
     * @return that China Union Pay cards are supported.
     */
     @JsonProperty("unionPay")
     public boolean isUnionPay() {
          return this.unionPay;
     }

    /**
     * Sets that contactless EMV cards are supported.
     * @param value that contactless EMV cards are supported.
     */
     public void setContactlessEmv(boolean value) {
          this.contactlessEmv = value;
     }

    /**
     * Gets that contactless EMV cards are supported.
     * @return that contactless EMV cards are supported.
     */
     @JsonProperty("contactlessEmv")
     public boolean isContactlessEmv() {
          return this.contactlessEmv;
     }

    /**
     * Sets that manual card entry is enabled.
     * @param value that manual card entry is enabled.
     */
     public void setManualEntryEnabled(boolean value) {
          this.manualEntryEnabled = value;
     }

    /**
     * Gets that manual card entry is enabled.
     * @return that manual card entry is enabled.
     */
     @JsonProperty("manualEntryEnabled")
     public boolean isManualEntryEnabled() {
          return this.manualEntryEnabled;
     }

    /**
     * Sets requires a zip code to be entered for manually entered transactions.
     * @param value requires a zip code to be entered for manually entered transactions.
     */
     public void setManualEntryPromptZip(boolean value) {
          this.manualEntryPromptZip = value;
     }

    /**
     * Gets requires a zip code to be entered for manually entered transactions.
     * @return requires a zip code to be entered for manually entered transactions.
     */
     @JsonProperty("manualEntryPromptZip")
     public boolean isManualEntryPromptZip() {
          return this.manualEntryPromptZip;
     }

    /**
     * Sets requires a street number to be entered for manually entered transactions.
     * @param value requires a street number to be entered for manually entered
     * transactions.
     */
     public void setManualEntryPromptStreetNumber(boolean value) {
          this.manualEntryPromptStreetNumber = value;
     }

    /**
     * Gets requires a street number to be entered for manually entered transactions.
     * @return requires a street number to be entered for manually entered transactions.
     */
     @JsonProperty("manualEntryPromptStreetNumber")
     public boolean isManualEntryPromptStreetNumber() {
          return this.manualEntryPromptStreetNumber;
     }

    /**
     * Sets that this merchant is boarded on BlockChyp in gateway only mode.
     * @param value that this merchant is boarded on BlockChyp in gateway only mode.
     */
     public void setGatewayOnly(boolean value) {
          this.gatewayOnly = value;
     }

    /**
     * Gets that this merchant is boarded on BlockChyp in gateway only mode.
     * @return that this merchant is boarded on BlockChyp in gateway only mode.
     */
     @JsonProperty("gatewayOnly")
     public boolean isGatewayOnly() {
          return this.gatewayOnly;
     }

    /**
     * Sets bank accounts for split bank account merchants.
     * @param value bank accounts for split bank account merchants.
     */
     public void setBankAccounts(Collection<BankAccount> value) {
          this.bankAccounts = value;
     }

    /**
     * Gets bank accounts for split bank account merchants.
     * @return bank accounts for split bank account merchants.
     */
     @JsonProperty("bankAccounts")
     public Collection<BankAccount> getBankAccounts() {
          return this.bankAccounts;
     }

    /**
     * Adds a three default values for tips.
     * @param value three default values for tips. Can be provided as a percentage if a
     * percent sign is provided. Otherwise the values are assumed to be basis points.
     */
     public void addTipDefault(String value) {
          if (this.tipDefaults == null) {
               this.tipDefaults = new ArrayList();
          }
          this.tipDefaults.add(value);
     }

    /**
     * Adds a four default values for cashback prompts.
     * @param value four default values for cashback prompts.
     */
     public void addCashbackPreset(String value) {
          if (this.cashbackPresets == null) {
               this.cashbackPresets = new ArrayList();
          }
          this.cashbackPresets.add(value);
     }

    /**
     * Adds a bank accounts for split bank account merchants.
     * @param value bank accounts for split bank account merchants.
     */
     public void addBankAccount(BankAccount value) {
          if (this.bankAccounts == null) {
               this.bankAccounts = new ArrayList();
          }
          this.bankAccounts.add(value);
     }

}
