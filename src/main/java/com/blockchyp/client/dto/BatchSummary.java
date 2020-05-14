/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Models high level information about a single batch.
 */
public class BatchSummary {

     private String batchId;

     private String capturedAmount;

     private boolean open;

     private Date openDate;

     private Date closeDate;

    /**
     * Sets batch identifier.
     * @param value batch identifier.
     */
     public void setBatchId(String value) {
          this.batchId = value;
     }

    /**
     * Gets batch identifier.
     * @return batch identifier.
     */
     @JsonProperty("batchId")
     public String getBatchId() {
          return this.batchId;
     }

    /**
     * Sets the new captured amount.
     * @param value the new captured amount.
     */
     public void setCapturedAmount(String value) {
          this.capturedAmount = value;
     }

    /**
     * Gets the new captured amount.
     * @return the new captured amount.
     */
     @JsonProperty("capturedAmount")
     public String getCapturedAmount() {
          return this.capturedAmount;
     }

    /**
     * Sets flag indicating whether or not the batch is open.
     * @param value flag indicating whether or not the batch is open.
     */
     public void setOpen(boolean value) {
          this.open = value;
     }

    /**
     * Gets flag indicating whether or not the batch is open.
     * @return flag indicating whether or not the batch is open.
     */
     @JsonProperty("open")
     public boolean isOpen() {
          return this.open;
     }

    /**
     * Sets date and time of the first transaction for this batch.
     * @param value date and time of the first transaction for this batch.
     */
     public void setOpenDate(Date value) {
          this.openDate = value;
     }

    /**
     * Gets date and time of the first transaction for this batch.
     * @return date and time of the first transaction for this batch.
     */
     @JsonProperty("openDate")
     public Date getOpenDate() {
          return this.openDate;
     }

    /**
     * Sets date and time the batch was closed.
     * @param value date and time the batch was closed.
     */
     public void setCloseDate(Date value) {
          this.closeDate = value;
     }

    /**
     * Gets date and time the batch was closed.
     * @return date and time the batch was closed.
     */
     @JsonProperty("closeDate")
     public Date getCloseDate() {
          return this.closeDate;
     }

}