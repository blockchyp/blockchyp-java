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
 * Models pricing response data for new handler for pricing api responses.
 */
public class PricingResponseAttributes {

     private float surchargePercent;

     private float surchargeAmount;

     private boolean surchargeExempt;

     private String cardType;

     private String cardToken;

     private String brand;

     private String bin;

     private String commercialIndicator;

     private String disclosure;

     private String debitCategory;

     private String countryIssued;

     private String uuid;

    /**
     * Sets the surcharge percentage.
     * @param value the surcharge percentage.
     */
     public void setSurchargePercent(float value) {
          this.surchargePercent = value;
     }

    /**
     * Gets the surcharge percentage.
     * @return the surcharge percentage.
     */
     @JsonProperty("surchargePercent")
     public float getSurchargePercent() {
          return this.surchargePercent;
     }

    /**
     * Sets the surcharge amount.
     * @param value the surcharge amount.
     */
     public void setSurchargeAmount(float value) {
          this.surchargeAmount = value;
     }

    /**
     * Gets the surcharge amount.
     * @return the surcharge amount.
     */
     @JsonProperty("surchargeAmount")
     public float getSurchargeAmount() {
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
     public void setCountryIssued(String value) {
          this.countryIssued = value;
     }

    /**
     * Gets the country where the card was issued.
     * @return the country where the card was issued.
     */
     @JsonProperty("countryIssued")
     public String getCountryIssued() {
          return this.countryIssued;
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

}
