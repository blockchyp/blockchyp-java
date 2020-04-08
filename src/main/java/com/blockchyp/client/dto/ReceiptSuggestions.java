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
 * EMV fields we recommend developers put on their receipts.
 */
public class ReceiptSuggestions {

     private String aid;

     private String arqc;

     private String iad;

     private String arc;

     private String tc;

     private String tvr;

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

     private String surcharge;

     private String cashDiscount;

    /**
     * Sets the EMV Application Identifier.
     * @param value the EMV Application Identifier.
     */
     public void setAid(String value) {
          this.aid = value;
     }

    /**
     * Gets the EMV Application Identifier.
     * @return the EMV Application Identifier.
     */
     @JsonProperty("aid")
     public String getAid() {
          return this.aid;
     }

    /**
     * Sets the EMV Application Request Cryptogram.
     * @param value the EMV Application Request Cryptogram.
     */
     public void setArqc(String value) {
          this.arqc = value;
     }

    /**
     * Gets the EMV Application Request Cryptogram.
     * @return the EMV Application Request Cryptogram.
     */
     @JsonProperty("arqc")
     public String getArqc() {
          return this.arqc;
     }

    /**
     * Sets the EMV Issuer Application Data.
     * @param value the EMV Issuer Application Data.
     */
     public void setIad(String value) {
          this.iad = value;
     }

    /**
     * Gets the EMV Issuer Application Data.
     * @return the EMV Issuer Application Data.
     */
     @JsonProperty("iad")
     public String getIad() {
          return this.iad;
     }

    /**
     * Sets the EMV Authorization Response Code.
     * @param value the EMV Authorization Response Code.
     */
     public void setArc(String value) {
          this.arc = value;
     }

    /**
     * Gets the EMV Authorization Response Code.
     * @return the EMV Authorization Response Code.
     */
     @JsonProperty("arc")
     public String getArc() {
          return this.arc;
     }

    /**
     * Sets the EMV Transaction Certificate.
     * @param value the EMV Transaction Certificate.
     */
     public void setTc(String value) {
          this.tc = value;
     }

    /**
     * Gets the EMV Transaction Certificate.
     * @return the EMV Transaction Certificate.
     */
     @JsonProperty("tc")
     public String getTc() {
          return this.tc;
     }

    /**
     * Sets the EMV Terminal Verification Response.
     * @param value the EMV Terminal Verification Response.
     */
     public void setTvr(String value) {
          this.tvr = value;
     }

    /**
     * Gets the EMV Terminal Verification Response.
     * @return the EMV Terminal Verification Response.
     */
     @JsonProperty("tvr")
     public String getTvr() {
          return this.tvr;
     }

    /**
     * Sets the EMV Transaction Status Indicator.
     * @param value the EMV Transaction Status Indicator.
     */
     public void setTsi(String value) {
          this.tsi = value;
     }

    /**
     * Gets the EMV Transaction Status Indicator.
     * @return the EMV Transaction Status Indicator.
     */
     @JsonProperty("tsi")
     public String getTsi() {
          return this.tsi;
     }

    /**
     * Sets the ID of the payment terminal.
     * @param value the ID of the payment terminal.
     */
     public void setTerminalId(String value) {
          this.terminalId = value;
     }

    /**
     * Gets the ID of the payment terminal.
     * @return the ID of the payment terminal.
     */
     @JsonProperty("terminalId")
     public String getTerminalId() {
          return this.terminalId;
     }

    /**
     * Sets the name of the merchant's business.
     * @param value the name of the merchant's business.
     */
     public void setMerchantName(String value) {
          this.merchantName = value;
     }

    /**
     * Gets the name of the merchant's business.
     * @return the name of the merchant's business.
     */
     @JsonProperty("merchantName")
     public String getMerchantName() {
          return this.merchantName;
     }

    /**
     * Sets the ID of the merchant.
     * @param value the ID of the merchant.
     */
     public void setMerchantId(String value) {
          this.merchantId = value;
     }

    /**
     * Gets the ID of the merchant.
     * @return the ID of the merchant.
     */
     @JsonProperty("merchantId")
     public String getMerchantId() {
          return this.merchantId;
     }

    /**
     * Sets the partially masked merchant key required on EMV receipts.
     * @param value the partially masked merchant key required on EMV receipts.
     */
     public void setMerchantKey(String value) {
          this.merchantKey = value;
     }

    /**
     * Gets the partially masked merchant key required on EMV receipts.
     * @return the partially masked merchant key required on EMV receipts.
     */
     @JsonProperty("merchantKey")
     public String getMerchantKey() {
          return this.merchantKey;
     }

    /**
     * Sets a description of the selected AID.
     * @param value a description of the selected AID.
     */
     public void setApplicationLabel(String value) {
          this.applicationLabel = value;
     }

    /**
     * Gets a description of the selected AID.
     * @return a description of the selected AID.
     */
     @JsonProperty("applicationLabel")
     public String getApplicationLabel() {
          return this.applicationLabel;
     }

    /**
     * Sets that the receipt should contain a signature line.
     * @param value that the receipt should contain a signature line.
     */
     public void setRequestSignature(boolean value) {
          this.requestSignature = value;
     }

    /**
     * Gets that the receipt should contain a signature line.
     * @return that the receipt should contain a signature line.
     */
     @JsonProperty("requestSignature")
     public boolean isRequestSignature() {
          return this.requestSignature;
     }

    /**
     * Sets the masked primary account number of the payment card, as required.
     * @param value the masked primary account number of the payment card, as required.
     */
     public void setMaskedPan(String value) {
          this.maskedPan = value;
     }

    /**
     * Gets the masked primary account number of the payment card, as required.
     * @return the masked primary account number of the payment card, as required.
     */
     @JsonProperty("maskedPan")
     public String getMaskedPan() {
          return this.maskedPan;
     }

    /**
     * Sets the amount authorized by the payment network.
     * @param value the amount authorized by the payment network. Could be less than the
     * requested amount for partial auth.
     */
     public void setAuthorizedAmount(String value) {
          this.authorizedAmount = value;
     }

    /**
     * Gets the amount authorized by the payment network.
     * @return the amount authorized by the payment network. Could be less than the
     * requested amount for partial auth.
     */
     @JsonProperty("authorizedAmount")
     public String getAuthorizedAmount() {
          return this.authorizedAmount;
     }

    /**
     * Sets the type of transaction performed (CHARGE, PREAUTH, REFUND, etc).
     * @param value the type of transaction performed (CHARGE, PREAUTH, REFUND, etc).
     */
     public void setTransactionType(String value) {
          this.transactionType = value;
     }

    /**
     * Gets the type of transaction performed (CHARGE, PREAUTH, REFUND, etc).
     * @return the type of transaction performed (CHARGE, PREAUTH, REFUND, etc).
     */
     @JsonProperty("transactionType")
     public String getTransactionType() {
          return this.transactionType;
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
     * Sets that PIN verification was performed.
     * @param value that PIN verification was performed.
     */
     public void setPinVerified(boolean value) {
          this.pinVerified = value;
     }

    /**
     * Gets that PIN verification was performed.
     * @return that PIN verification was performed.
     */
     @JsonProperty("pinVerified")
     public boolean isPinVerified() {
          return this.pinVerified;
     }

    /**
     * Sets the amount of cash back that was approved.
     * @param value the amount of cash back that was approved.
     */
     public void setCashBackAmount(String value) {
          this.cashBackAmount = value;
     }

    /**
     * Gets the amount of cash back that was approved.
     * @return the amount of cash back that was approved.
     */
     @JsonProperty("cashBackAmount")
     public String getCashBackAmount() {
          return this.cashBackAmount;
     }

    /**
     * Sets the amount added to the transaction to cover eligible credit card fees.
     * @param value the amount added to the transaction to cover eligible credit card
     * fees.
     */
     public void setSurcharge(String value) {
          this.surcharge = value;
     }

    /**
     * Gets the amount added to the transaction to cover eligible credit card fees.
     * @return the amount added to the transaction to cover eligible credit card fees.
     */
     @JsonProperty("surcharge")
     public String getSurcharge() {
          return this.surcharge;
     }

    /**
     * Sets the discount applied to the transaction for payment methods ineligible for
     * surcharges.
     * @param value the discount applied to the transaction for payment methods
     * ineligible for surcharges.
     */
     public void setCashDiscount(String value) {
          this.cashDiscount = value;
     }

    /**
     * Gets the discount applied to the transaction for payment methods ineligible for
     * surcharges.
     * @return the discount applied to the transaction for payment methods ineligible
     * for surcharges.
     */
     @JsonProperty("cashDiscount")
     public String getCashDiscount() {
          return this.cashDiscount;
     }

}
