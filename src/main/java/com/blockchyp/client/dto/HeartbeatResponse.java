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
 * The response to a basic API health check. If the security context permits it, the
 * response may also include the public key of the current merchant.
 */
public class HeartbeatResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private Date timestamp;

     private String clockchain;

     private String latestTick;

     private String merchantPublicKey;

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
     * Sets the timestamp of the heartbeat.
     * @param value the timestamp of the heartbeat.
     */
     public void setTimestamp(Date value) {
          this.timestamp = value;
     }

    /**
     * Gets the timestamp of the heartbeat.
     * @return the timestamp of the heartbeat.
     */
     @JsonProperty("timestamp")
     public Date getTimestamp() {
          return this.timestamp;
     }

    /**
     * Sets the public key of the clockchain.
     * @param value the public key of the clockchain. This is blockchain stuff that you
     * don't really need to worry about. It is a base 58 encoded and compressed eliptic
     * curve public key. For the production clockchain, this will always be:
     * '3cuhsckVUd9HzMjbdUSW17aY5kCcm1d6YAphJMUwmtXRj7WLyU'.
     */
     public void setClockchain(String value) {
          this.clockchain = value;
     }

    /**
     * Gets the public key of the clockchain.
     * @return the public key of the clockchain. This is blockchain stuff that you don't
     * really need to worry about. It is a base 58 encoded and compressed eliptic curve
     * public key. For the production clockchain, this will always be:
     * '3cuhsckVUd9HzMjbdUSW17aY5kCcm1d6YAphJMUwmtXRj7WLyU'.
     */
     @JsonProperty("clockchain")
     public String getClockchain() {
          return this.clockchain;
     }

    /**
     * Sets the hash of the last tick block.
     * @param value the hash of the last tick block.
     */
     public void setLatestTick(String value) {
          this.latestTick = value;
     }

    /**
     * Gets the hash of the last tick block.
     * @return the hash of the last tick block.
     */
     @JsonProperty("latestTick")
     public String getLatestTick() {
          return this.latestTick;
     }

    /**
     * Sets the public key for the merchant's blockchain.
     * @param value the public key for the merchant's blockchain.
     */
     public void setMerchantPublicKey(String value) {
          this.merchantPublicKey = value;
     }

    /**
     * Gets the public key for the merchant's blockchain.
     * @return the public key for the merchant's blockchain.
     */
     @JsonProperty("merchantPk")
     public String getMerchantPublicKey() {
          return this.merchantPublicKey;
     }

}
