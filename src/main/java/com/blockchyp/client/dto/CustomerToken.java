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
 * Models a customer token.
 */
public class CustomerToken {

     private String token;

     private String maskedPan;

     private String expiryMonth;

     private String expiryYear;

     private String paymentType;

     /**
      * Sets BlockChyp assigned customer id.
      * @param value BlockChyp assigned customer id.
      */
     public void setToken(String value) {
          this.token = value;
     }

     /**
      * Gets BlockChyp assigned customer id.
      * @return BlockChyp assigned customer id.
      */
     @JsonProperty("token")
     public String getToken() {
          return this.token;
     }

     /**
      * Sets masked primary account number.
      * @param value masked primary account number.
      */
     public void setMaskedPan(String value) {
          this.maskedPan = value;
     }

     /**
      * Gets masked primary account number.
      * @return masked primary account number.
      */
     @JsonProperty("maskedPan")
     public String getMaskedPan() {
          return this.maskedPan;
     }

     /**
      * Sets expiration month.
      * @param value expiration month.
      */
     public void setExpiryMonth(String value) {
          this.expiryMonth = value;
     }

     /**
      * Gets expiration month.
      * @return expiration month.
      */
     @JsonProperty("expiryMonth")
     public String getExpiryMonth() {
          return this.expiryMonth;
     }

     /**
      * Sets expiration month.
      * @param value expiration month.
      */
     public void setExpiryYear(String value) {
          this.expiryYear = value;
     }

     /**
      * Gets expiration month.
      * @return expiration month.
      */
     @JsonProperty("expiryYear")
     public String getExpiryYear() {
          return this.expiryYear;
     }

     /**
      * Sets payment type.
      * @param value payment type.
      */
     public void setPaymentType(String value) {
          this.paymentType = value;
     }

     /**
      * Gets payment type.
      * @return payment type.
      */
     @JsonProperty("paymentType")
     public String getPaymentType() {
          return this.paymentType;
     }

}
