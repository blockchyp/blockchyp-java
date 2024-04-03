/**
 * Copyright 2019-2024 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * Models a response for details about a single batch.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class BatchDetailsResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private boolean test;

     private String batchId;

     private String entryMethod;

     private String destinationAccountId;

     private String capturedAmount;

     private String openPreauths;

     private String totalVolume;

     private int transactionCount;

     private String giftCardsSold;

     private String giftCardVolume;

     private String expectedDeposit;

     private boolean open;

     private Date openDate;

     private Date closeDate;

     private Collection<TerminalVolume> volumeByTerminal;

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
     * Sets entry method for the batch, if any.
     * @param value entry method for the batch, if any.
     */
     public void setEntryMethod(String value) {
          this.entryMethod = value;
     }

    /**
     * Gets entry method for the batch, if any.
     * @return entry method for the batch, if any.
     */
     @JsonProperty("entryMethod")
     public String getEntryMethod() {
          return this.entryMethod;
     }

    /**
     * Sets merchant deposit account into which proceeds should be deposited.
     * @param value merchant deposit account into which proceeds should be deposited.
     */
     public void setDestinationAccountId(String value) {
          this.destinationAccountId = value;
     }

    /**
     * Gets merchant deposit account into which proceeds should be deposited.
     * @return merchant deposit account into which proceeds should be deposited.
     */
     @JsonProperty("destinationAccountId")
     public String getDestinationAccountId() {
          return this.destinationAccountId;
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
     * Sets preauths from this batch still open.
     * @param value preauths from this batch still open.
     */
     public void setOpenPreauths(String value) {
          this.openPreauths = value;
     }

    /**
     * Gets preauths from this batch still open.
     * @return preauths from this batch still open.
     */
     @JsonProperty("openPreauths")
     public String getOpenPreauths() {
          return this.openPreauths;
     }

    /**
     * Sets the total volume from this batch.
     * @param value the total volume from this batch.
     */
     public void setTotalVolume(String value) {
          this.totalVolume = value;
     }

    /**
     * Gets the total volume from this batch.
     * @return the total volume from this batch.
     */
     @JsonProperty("totalVolume")
     public String getTotalVolume() {
          return this.totalVolume;
     }

    /**
     * Sets the total number of transactions in this batch.
     * @param value the total number of transactions in this batch.
     */
     public void setTransactionCount(int value) {
          this.transactionCount = value;
     }

    /**
     * Gets the total number of transactions in this batch.
     * @return the total number of transactions in this batch.
     */
     @JsonProperty("transactionCount")
     public int getTransactionCount() {
          return this.transactionCount;
     }

    /**
     * Sets the total volume of gift cards sold.
     * @param value the total volume of gift cards sold.
     */
     public void setGiftCardsSold(String value) {
          this.giftCardsSold = value;
     }

    /**
     * Gets the total volume of gift cards sold.
     * @return the total volume of gift cards sold.
     */
     @JsonProperty("giftCardsSold")
     public String getGiftCardsSold() {
          return this.giftCardsSold;
     }

    /**
     * Sets the total volume of gift cards transactions.
     * @param value the total volume of gift cards transactions.
     */
     public void setGiftCardVolume(String value) {
          this.giftCardVolume = value;
     }

    /**
     * Gets the total volume of gift cards transactions.
     * @return the total volume of gift cards transactions.
     */
     @JsonProperty("giftCardVolume")
     public String getGiftCardVolume() {
          return this.giftCardVolume;
     }

    /**
     * Sets the expected volume for this batch, usually captured volume less gift card
     * volume.
     * @param value the expected volume for this batch, usually captured volume less gift
     * card volume.
     */
     public void setExpectedDeposit(String value) {
          this.expectedDeposit = value;
     }

    /**
     * Gets the expected volume for this batch, usually captured volume less gift card
     * volume.
     * @return the expected volume for this batch, usually captured volume less gift card
     * volume.
     */
     @JsonProperty("expectedDeposit")
     public String getExpectedDeposit() {
          return this.expectedDeposit;
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

    /**
     * Sets merchant's batch history in descending order.
     * @param value merchant's batch history in descending order.
     */
     public void setVolumeByTerminal(Collection<TerminalVolume> value) {
          this.volumeByTerminal = value;
     }

    /**
     * Gets merchant's batch history in descending order.
     * @return merchant's batch history in descending order.
     */
     @JsonProperty("volumeByTerminal")
     public Collection<TerminalVolume> getVolumeByTerminal() {
          return this.volumeByTerminal;
     }

    /**
     * Adds a merchant's batch history in descending order.
     * @param value merchant's batch history in descending order.
     */
     public void addVolumeByTerminal(TerminalVolume value) {
          if (this.volumeByTerminal == null) {
               this.volumeByTerminal = new ArrayList();
          }
          this.volumeByTerminal.add(value);
     }

}
