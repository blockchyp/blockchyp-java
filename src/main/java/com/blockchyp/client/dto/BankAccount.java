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
 * Models meta data about a merchant bank account.
 */
public class BankAccount {

     private String id;

     private String name;

     private String purpose;

     private String maskedAccountNumber;

    /**
     * Sets the account identifier to be used with authorization requests.
     * @param value the account identifier to be used with authorization requests.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets the account identifier to be used with authorization requests.
     * @return the account identifier to be used with authorization requests.
     */
     @JsonProperty("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets the name of the account.
     * @param value the name of the account.
     */
     public void setName(String value) {
          this.name = value;
     }

    /**
     * Gets the name of the account.
     * @return the name of the account.
     */
     @JsonProperty("name")
     public String getName() {
          return this.name;
     }

    /**
     * Sets the purpose of the account.
     * @param value the purpose of the account.
     */
     public void setPurpose(String value) {
          this.purpose = value;
     }

    /**
     * Gets the purpose of the account.
     * @return the purpose of the account.
     */
     @JsonProperty("purpose")
     public String getPurpose() {
          return this.purpose;
     }

    /**
     * Sets the masked account number.
     * @param value the masked account number.
     */
     public void setMaskedAccountNumber(String value) {
          this.maskedAccountNumber = value;
     }

    /**
     * Gets the masked account number.
     * @return the masked account number.
     */
     @JsonProperty("maskedAccountNumber")
     public String getMaskedAccountNumber() {
          return this.maskedAccountNumber;
     }

}
