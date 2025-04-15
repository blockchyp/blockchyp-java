/**
 * Copyright 2019-2025 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Models partner statement adjustments.
 */
public class PartnerStatementAdjustment {

     private String id;

     private Date timestamp;

     private String description;

     private float amount;

     private String amountFormatted;

    /**
     * Sets the adjustment id.
     * @param value the adjustment id.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets the adjustment id.
     * @return the adjustment id.
     */
     @JsonProperty("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets the date and time the disbursement was posted to the account.
     * @param value the date and time the disbursement was posted to the account.
     */
     public void setTimestamp(Date value) {
          this.timestamp = value;
     }

    /**
     * Gets the date and time the disbursement was posted to the account.
     * @return the date and time the disbursement was posted to the account.
     */
     @JsonProperty("timestamp")
     public Date getTimestamp() {
          return this.timestamp;
     }

    /**
     * Sets a description of the adjustment.
     * @param value a description of the adjustment.
     */
     public void setDescription(String value) {
          this.description = value;
     }

    /**
     * Gets a description of the adjustment.
     * @return a description of the adjustment.
     */
     @JsonProperty("description")
     public String getDescription() {
          return this.description;
     }

    /**
     * Sets the amount in floating point format.
     * @param value the amount in floating point format.
     */
     public void setAmount(float value) {
          this.amount = value;
     }

    /**
     * Gets the amount in floating point format.
     * @return the amount in floating point format.
     */
     @JsonProperty("amount")
     public float getAmount() {
          return this.amount;
     }

    /**
     * Sets the currency formatted form of amount.
     * @param value the currency formatted form of amount.
     */
     public void setAmountFormatted(String value) {
          this.amountFormatted = value;
     }

    /**
     * Gets the currency formatted form of amount.
     * @return the currency formatted form of amount.
     */
     @JsonProperty("amountFormatted")
     public String getAmountFormatted() {
          return this.amountFormatted;
     }

}
