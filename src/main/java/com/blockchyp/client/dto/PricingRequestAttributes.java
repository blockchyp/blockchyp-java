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
 * Models the attributes for a pricing request.
 */
public class PricingRequestAttributes {

     private String cardNumber;

     private String token;

     private String merchantIdentifier;

     private float amount;

     private String country;

     private String postalCode;

     private String state;

     private PricingMerchantSettings merchantSettings;

    /**
     * Sets the card number for the pricing request.
     * @param value the card number for the pricing request.
     */
     public void setCardNumber(String value) {
          this.cardNumber = value;
     }

    /**
     * Gets the card number for the pricing request.
     * @return the card number for the pricing request.
     */
     @JsonProperty("cardNumber")
     public String getCardNumber() {
          return this.cardNumber;
     }

    /**
     * Sets the payment token.
     * @param value the payment token.
     */
     public void setToken(String value) {
          this.token = value;
     }

    /**
     * Gets the payment token.
     * @return the payment token.
     */
     @JsonProperty("token")
     public String getToken() {
          return this.token;
     }

    /**
     * Sets the merchant identifier.
     * @param value the merchant identifier.
     */
     public void setMerchantIdentifier(String value) {
          this.merchantIdentifier = value;
     }

    /**
     * Gets the merchant identifier.
     * @return the merchant identifier.
     */
     @JsonProperty("merchantIdentifier")
     public String getMerchantIdentifier() {
          return this.merchantIdentifier;
     }

    /**
     * Sets the transaction amount.
     * @param value the transaction amount.
     */
     public void setAmount(float value) {
          this.amount = value;
     }

    /**
     * Gets the transaction amount.
     * @return the transaction amount.
     */
     @JsonProperty("amount")
     public float getAmount() {
          return this.amount;
     }

    /**
     * Sets the country code.
     * @param value the country code.
     */
     public void setCountry(String value) {
          this.country = value;
     }

    /**
     * Gets the country code.
     * @return the country code.
     */
     @JsonProperty("country")
     public String getCountry() {
          return this.country;
     }

    /**
     * Sets the postal code.
     * @param value the postal code.
     */
     public void setPostalCode(String value) {
          this.postalCode = value;
     }

    /**
     * Gets the postal code.
     * @return the postal code.
     */
     @JsonProperty("postalCode")
     public String getPostalCode() {
          return this.postalCode;
     }

    /**
     * Sets the state or province.
     * @param value the state or province.
     */
     public void setState(String value) {
          this.state = value;
     }

    /**
     * Gets the state or province.
     * @return the state or province.
     */
     @JsonProperty("state")
     public String getState() {
          return this.state;
     }

    /**
     * Sets merchant settings for the pricing request.
     * @param value merchant settings for the pricing request.
     */
     public void setMerchantSettings(PricingMerchantSettings value) {
          this.merchantSettings = value;
     }

    /**
     * Gets merchant settings for the pricing request.
     * @return merchant settings for the pricing request.
     */
     @JsonProperty("merchantSettings")
     public PricingMerchantSettings getMerchantSettings() {
          return this.merchantSettings;
     }

}
