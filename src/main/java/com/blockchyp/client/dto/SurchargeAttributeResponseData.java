/**
 * Copyright 2019-2026 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Models the surcharge attributes included in a surcharge review response.
 */
public class SurchargeAttributeResponseData {

     private String totalWithSurchargeAmount;

     private boolean success;

     private String type;

     private String surchargePercent;

     private String surchargeAmount;

     private boolean surchargeExempt;

     private String cardType;

     private String cardToken;

     private String brand;

     private String bin;

     private String commercialIndicator;

     private boolean isCommercial;

     private boolean isRegulated;

     private String exemptionReason;

     private String debitFeeAmount;

     private String disclosure;

     private String debitCategory;

     private String countryCode;

     private String state;

     private String uuid;

     private String expirationDate;

     private String disclosureAdditional;

     private String cardholderInfo;

    /**
     * Sets the total amount including surcharge.
     * @param value the total amount including surcharge.
     */
     public void setTotalWithSurchargeAmount(String value) {
          this.totalWithSurchargeAmount = value;
     }

    /**
     * Gets the total amount including surcharge.
     * @return the total amount including surcharge.
     */
     @JsonProperty("totalWithSurchargeAmount")
     public String getTotalWithSurchargeAmount() {
          return this.totalWithSurchargeAmount;
     }

    /**
     * Sets if the surcharge review was successful.
     * @param value if the surcharge review was successful.
     */
     public void setSuccess(boolean value) {
          this.success = value;
     }

    /**
     * Gets if the surcharge review was successful.
     * @return if the surcharge review was successful.
     */
     @JsonProperty("success")
     public boolean isSuccess() {
          return this.success;
     }

    /**
     * Sets the type of the response.
     * @param value the type of the response.
     */
     public void setType(String value) {
          this.type = value;
     }

    /**
     * Gets the type of the response.
     * @return the type of the response.
     */
     @JsonProperty("type")
     public String getType() {
          return this.type;
     }

    /**
     * Sets the surcharge percentage.
     * @param value the surcharge percentage.
     */
     public void setSurchargePercent(String value) {
          this.surchargePercent = value;
     }

    /**
     * Gets the surcharge percentage.
     * @return the surcharge percentage.
     */
     @JsonProperty("surchargePercent")
     public String getSurchargePercent() {
          return this.surchargePercent;
     }

    /**
     * Sets the surcharge amount.
     * @param value the surcharge amount.
     */
     public void setSurchargeAmount(String value) {
          this.surchargeAmount = value;
     }

    /**
     * Gets the surcharge amount.
     * @return the surcharge amount.
     */
     @JsonProperty("surchargeAmount")
     public String getSurchargeAmount() {
          return this.surchargeAmount;
     }

    /**
     * Sets if the transaction is exempt from surcharges.
     * @param value if the transaction is exempt from surcharges.
     */
     public void setSurchargeExempt(boolean value) {
          this.surchargeExempt = value;
     }

    /**
     * Gets if the transaction is exempt from surcharges.
     * @return if the transaction is exempt from surcharges.
     */
     @JsonProperty("surchargeExempt")
     public boolean isSurchargeExempt() {
          return this.surchargeExempt;
     }

    /**
     * Sets the type of card.
     * @param value the type of card.
     */
     public void setCardType(String value) {
          this.cardType = value;
     }

    /**
     * Gets the type of card.
     * @return the type of card.
     */
     @JsonProperty("cardType")
     public String getCardType() {
          return this.cardType;
     }

    /**
     * Sets the card token.
     * @param value the card token.
     */
     public void setCardToken(String value) {
          this.cardToken = value;
     }

    /**
     * Gets the card token.
     * @return the card token.
     */
     @JsonProperty("cardToken")
     public String getCardToken() {
          return this.cardToken;
     }

    /**
     * Sets the card brand.
     * @param value the card brand.
     */
     public void setBrand(String value) {
          this.brand = value;
     }

    /**
     * Gets the card brand.
     * @return the card brand.
     */
     @JsonProperty("brand")
     public String getBrand() {
          return this.brand;
     }

    /**
     * Sets the bank identification number.
     * @param value the bank identification number.
     */
     public void setBin(String value) {
          this.bin = value;
     }

    /**
     * Gets the bank identification number.
     * @return the bank identification number.
     */
     @JsonProperty("bin")
     public String getBin() {
          return this.bin;
     }

    /**
     * Sets the commercial card indicator.
     * @param value the commercial card indicator.
     */
     public void setCommercialIndicator(String value) {
          this.commercialIndicator = value;
     }

    /**
     * Gets the commercial card indicator.
     * @return the commercial card indicator.
     */
     @JsonProperty("commercialIndicator")
     public String getCommercialIndicator() {
          return this.commercialIndicator;
     }

    /**
     * Sets if the card is commercial.
     * @param value if the card is commercial.
     */
     public void setIsCommercial(boolean value) {
          this.isCommercial = value;
     }

    /**
     * Gets if the card is commercial.
     * @return if the card is commercial.
     */
     @JsonProperty("isCommercial")
     public boolean isIsCommercial() {
          return this.isCommercial;
     }

    /**
     * Sets if the card is Durbin-regulated (US debit).
     * @param value if the card is Durbin-regulated (US debit).
     */
     public void setIsRegulated(boolean value) {
          this.isRegulated = value;
     }

    /**
     * Gets if the card is Durbin-regulated (US debit).
     * @return if the card is Durbin-regulated (US debit).
     */
     @JsonProperty("isRegulated")
     public boolean isIsRegulated() {
          return this.isRegulated;
     }

    /**
     * Sets the reason for the exemption.
     * @param value the reason for the exemption.
     */
     public void setExemptionReason(String value) {
          this.exemptionReason = value;
     }

    /**
     * Gets the reason for the exemption.
     * @return the reason for the exemption.
     */
     @JsonProperty("exemptionReason")
     public String getExemptionReason() {
          return this.exemptionReason;
     }

    /**
     * Sets the debit fee amount.
     * @param value the debit fee amount.
     */
     public void setDebitFeeAmount(String value) {
          this.debitFeeAmount = value;
     }

    /**
     * Gets the debit fee amount.
     * @return the debit fee amount.
     */
     @JsonProperty("debitFeeAmount")
     public String getDebitFeeAmount() {
          return this.debitFeeAmount;
     }

    /**
     * Sets the disclosure statement.
     * @param value the disclosure statement.
     */
     public void setDisclosure(String value) {
          this.disclosure = value;
     }

    /**
     * Gets the disclosure statement.
     * @return the disclosure statement.
     */
     @JsonProperty("disclosure")
     public String getDisclosure() {
          return this.disclosure;
     }

    /**
     * Sets the debit card category.
     * @param value the debit card category.
     */
     public void setDebitCategory(String value) {
          this.debitCategory = value;
     }

    /**
     * Gets the debit card category.
     * @return the debit card category.
     */
     @JsonProperty("debitCategory")
     public String getDebitCategory() {
          return this.debitCategory;
     }

    /**
     * Sets the country where the card was issued.
     * @param value the country where the card was issued.
     */
     public void setCountryCode(String value) {
          this.countryCode = value;
     }

    /**
     * Gets the country where the card was issued.
     * @return the country where the card was issued.
     */
     @JsonProperty("countryCode")
     public String getCountryCode() {
          return this.countryCode;
     }

    /**
     * Sets only included if state was sent in request OR derived from ZIP code.
     * @param value only included if state was sent in request OR derived from ZIP code.
     */
     public void setState(String value) {
          this.state = value;
     }

    /**
     * Gets only included if state was sent in request OR derived from ZIP code.
     * @return only included if state was sent in request OR derived from ZIP code.
     */
     @JsonProperty("state")
     public String getState() {
          return this.state;
     }

    /**
     * Sets the unique identifier for the pricing response.
     * @param value the unique identifier for the pricing response.
     */
     public void setUuid(String value) {
          this.uuid = value;
     }

    /**
     * Gets the unique identifier for the pricing response.
     * @return the unique identifier for the pricing response.
     */
     @JsonProperty("uuid")
     public String getUuid() {
          return this.uuid;
     }

    /**
     * Sets the expiration date of the card.
     * @param value the expiration date of the card.
     */
     public void setExpirationDate(String value) {
          this.expirationDate = value;
     }

    /**
     * Gets the expiration date of the card.
     * @return the expiration date of the card.
     */
     @JsonProperty("expirationDate")
     public String getExpirationDate() {
          return this.expirationDate;
     }

    /**
     * Sets when surcharging is enabled AND state is 'CO' (Colorado-specific statutory
     * language).
     * @param value when surcharging is enabled AND state is 'CO' (Colorado-specific
     * statutory language).
     */
     public void setDisclosureAdditional(String value) {
          this.disclosureAdditional = value;
     }

    /**
     * Gets when surcharging is enabled AND state is 'CO' (Colorado-specific statutory
     * language).
     * @return when surcharging is enabled AND state is 'CO' (Colorado-specific
     * statutory language).
     */
     @JsonProperty("disclosureAdditional")
     public String getDisclosureAdditional() {
          return this.disclosureAdditional;
     }

    /**
     * Sets the cardholder information.
     * @param value the cardholder information.
     */
     public void setCardholderInfo(String value) {
          this.cardholderInfo = value;
     }

    /**
     * Gets the cardholder information.
     * @return the cardholder information.
     */
     @JsonProperty("cardholderInfo")
     public String getCardholderInfo() {
          return this.cardholderInfo;
     }

}
