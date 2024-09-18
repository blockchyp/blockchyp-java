/**
 * Copyright 2019-2024 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Essential information about a payment card derived from its BIN/IIN.
 */
public class CardMetadata {

     private String cardBrand;

     private String issuerName;

     private boolean l3;

     private boolean l2;

     private String productType;

     private String productName;

     private boolean ebt;

     private boolean debit;

     private boolean healthcare;

     private boolean prepaid;

     private String region;

     private String country;

    /**
     * Sets the brand or network of the card (e.
     * @param value the brand or network of the card (e.g., Visa, Mastercard, Amex).
     */
     public void setCardBrand(String value) {
          this.cardBrand = value;
     }

    /**
     * Gets the brand or network of the card (e.
     * @return the brand or network of the card (e.g., Visa, Mastercard, Amex).
     */
     @JsonProperty("cardBrand")
     public String getCardBrand() {
          return this.cardBrand;
     }

    /**
     * Sets the name of the financial institution that issued the card.
     * @param value the name of the financial institution that issued the card.
     */
     public void setIssuerName(String value) {
          this.issuerName = value;
     }

    /**
     * Gets the name of the financial institution that issued the card.
     * @return the name of the financial institution that issued the card.
     */
     @JsonProperty("issuerName")
     public String getIssuerName() {
          return this.issuerName;
     }

    /**
     * Sets whether the card supports Level 3 processing for detailed transaction data.
     * @param value whether the card supports Level 3 processing for detailed
     * transaction data.
     */
     public void setL3(boolean value) {
          this.l3 = value;
     }

    /**
     * Gets whether the card supports Level 3 processing for detailed transaction data.
     * @return whether the card supports Level 3 processing for detailed transaction
     * data.
     */
     @JsonProperty("l3")
     public boolean isL3() {
          return this.l3;
     }

    /**
     * Sets whether the card supports Level 2 processing for additional transaction
     * data.
     * @param value whether the card supports Level 2 processing for additional
     * transaction data.
     */
     public void setL2(boolean value) {
          this.l2 = value;
     }

    /**
     * Gets whether the card supports Level 2 processing for additional transaction
     * data.
     * @return whether the card supports Level 2 processing for additional transaction
     * data.
     */
     @JsonProperty("l2")
     public boolean isL2() {
          return this.l2;
     }

    /**
     * Sets the general category or type of the card product.
     * @param value the general category or type of the card product.
     */
     public void setProductType(String value) {
          this.productType = value;
     }

    /**
     * Gets the general category or type of the card product.
     * @return the general category or type of the card product.
     */
     @JsonProperty("productType")
     public String getProductType() {
          return this.productType;
     }

    /**
     * Sets the specific name or designation of the card product.
     * @param value the specific name or designation of the card product.
     */
     public void setProductName(String value) {
          this.productName = value;
     }

    /**
     * Gets the specific name or designation of the card product.
     * @return the specific name or designation of the card product.
     */
     @JsonProperty("productName")
     public String getProductName() {
          return this.productName;
     }

    /**
     * Sets whether the card is an Electronic Benefit Transfer (EBT) card.
     * @param value whether the card is an Electronic Benefit Transfer (EBT) card.
     */
     public void setEbt(boolean value) {
          this.ebt = value;
     }

    /**
     * Gets whether the card is an Electronic Benefit Transfer (EBT) card.
     * @return whether the card is an Electronic Benefit Transfer (EBT) card.
     */
     @JsonProperty("ebt")
     public boolean isEbt() {
          return this.ebt;
     }

    /**
     * Sets whether the card is a debit card.
     * @param value whether the card is a debit card.
     */
     public void setDebit(boolean value) {
          this.debit = value;
     }

    /**
     * Gets whether the card is a debit card.
     * @return whether the card is a debit card.
     */
     @JsonProperty("debit")
     public boolean isDebit() {
          return this.debit;
     }

    /**
     * Sets whether the card is a healthcare-specific payment card.
     * @param value whether the card is a healthcare-specific payment card.
     */
     public void setHealthcare(boolean value) {
          this.healthcare = value;
     }

    /**
     * Gets whether the card is a healthcare-specific payment card.
     * @return whether the card is a healthcare-specific payment card.
     */
     @JsonProperty("healthcare")
     public boolean isHealthcare() {
          return this.healthcare;
     }

    /**
     * Sets whether the card is a prepaid card.
     * @param value whether the card is a prepaid card.
     */
     public void setPrepaid(boolean value) {
          this.prepaid = value;
     }

    /**
     * Gets whether the card is a prepaid card.
     * @return whether the card is a prepaid card.
     */
     @JsonProperty("prepaid")
     public boolean isPrepaid() {
          return this.prepaid;
     }

    /**
     * Sets the geographical region associated with the card's issuer.
     * @param value the geographical region associated with the card's issuer.
     */
     public void setRegion(String value) {
          this.region = value;
     }

    /**
     * Gets the geographical region associated with the card's issuer.
     * @return the geographical region associated with the card's issuer.
     */
     @JsonProperty("region")
     public String getRegion() {
          return this.region;
     }

    /**
     * Sets the country associated with the card's issuer.
     * @param value the country associated with the card's issuer.
     */
     public void setCountry(String value) {
          this.country = value;
     }

    /**
     * Gets the country associated with the card's issuer.
     * @return the country associated with the card's issuer.
     */
     @JsonProperty("country")
     public String getCountry() {
          return this.country;
     }

}
