/**
 * Copyright 2019-2026 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * The current status of a terminal.
 */
public class TerminalStatusResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private boolean idle;

     private boolean cardInSlot;

     private String status;

     private String transactionRef;

     private Date since;

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
     * Sets that the terminal is idle.
     * @param value that the terminal is idle.
     */
     public void setIdle(boolean value) {
          this.idle = value;
     }

    /**
     * Gets that the terminal is idle.
     * @return that the terminal is idle.
     */
     @JsonProperty("idle")
     public boolean isIdle() {
          return this.idle;
     }

    /**
     * Sets whether or not a card is currently in the card slot.
     * @param value whether or not a card is currently in the card slot.
     */
     public void setCardInSlot(boolean value) {
          this.cardInSlot = value;
     }

    /**
     * Gets whether or not a card is currently in the card slot.
     * @return whether or not a card is currently in the card slot.
     */
     @JsonProperty("cardInSlot")
     public boolean isCardInSlot() {
          return this.cardInSlot;
     }

    /**
     * Sets the operation that the terminal is performing.
     * @param value the operation that the terminal is performing.
     */
     public void setStatus(String value) {
          this.status = value;
     }

    /**
     * Gets the operation that the terminal is performing.
     * @return the operation that the terminal is performing.
     */
     @JsonProperty("status")
     public String getStatus() {
          return this.status;
     }

    /**
     * Sets the transaction reference for an ongoing transaction, if one was specified at
     * request time.
     * @param value the transaction reference for an ongoing transaction, if one was
     * specified at request time.
     */
     public void setTransactionRef(String value) {
          this.transactionRef = value;
     }

    /**
     * Gets the transaction reference for an ongoing transaction, if one was specified at
     * request time.
     * @return the transaction reference for an ongoing transaction, if one was
     * specified at request time.
     */
     @JsonProperty("transactionRef")
     public String getTransactionRef() {
          return this.transactionRef;
     }

    /**
     * Sets the timestamp of the last status change.
     * @param value the timestamp of the last status change.
     */
     public void setSince(Date value) {
          this.since = value;
     }

    /**
     * Gets the timestamp of the last status change.
     * @return the timestamp of the last status change.
     */
     @JsonProperty("since")
     public Date getSince() {
          return this.since;
     }

}
