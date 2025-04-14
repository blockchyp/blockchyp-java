/**
 * Copyright 2019-2025 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Models a terminal activation request.
 */
public class TerminalActivationRequest implements ITimeoutRequest {

     private int timeout;

     private boolean test;

     private String merchantId;

     private String activationCode;

     private String terminalName;

     private boolean cloudRelay;

    /**
     * Sets the request timeout in seconds.
     * @param value the request timeout in seconds.
     */
     public void setTimeout(int value) {
          this.timeout = value;
     }

    /**
     * Gets the request timeout in seconds.
     * @return the request timeout in seconds.
     */
     @JsonProperty("timeout")
     public int getTimeout() {
          return this.timeout;
     }

    /**
     * Sets whether or not to route transaction to the test gateway.
     * @param value whether or not to route transaction to the test gateway.
     */
     public void setTest(boolean value) {
          this.test = value;
     }

    /**
     * Gets whether or not to route transaction to the test gateway.
     * @return whether or not to route transaction to the test gateway.
     */
     @JsonProperty("test")
     public boolean isTest() {
          return this.test;
     }

    /**
     * Sets the optional merchant id.
     * @param value the optional merchant id.
     */
     public void setMerchantId(String value) {
          this.merchantId = value;
     }

    /**
     * Gets the optional merchant id.
     * @return the optional merchant id.
     */
     @JsonProperty("merchantId")
     public String getMerchantId() {
          return this.merchantId;
     }

    /**
     * Sets the terminal activation code displayed on the terminal.
     * @param value the terminal activation code displayed on the terminal.
     */
     public void setActivationCode(String value) {
          this.activationCode = value;
     }

    /**
     * Gets the terminal activation code displayed on the terminal.
     * @return the terminal activation code displayed on the terminal.
     */
     @JsonProperty("activationCode")
     public String getActivationCode() {
          return this.activationCode;
     }

    /**
     * Sets the name to be assigned to the terminal.
     * @param value the name to be assigned to the terminal. Must be unique for the merchant
     * account.
     */
     public void setTerminalName(String value) {
          this.terminalName = value;
     }

    /**
     * Gets the name to be assigned to the terminal.
     * @return the name to be assigned to the terminal. Must be unique for the merchant
     * account.
     */
     @JsonProperty("terminalName")
     public String getTerminalName() {
          return this.terminalName;
     }

    /**
     * Sets that the terminal should be activated in cloud relay mode.
     * @param value that the terminal should be activated in cloud relay mode.
     */
     public void setCloudRelay(boolean value) {
          this.cloudRelay = value;
     }

    /**
     * Gets that the terminal should be activated in cloud relay mode.
     * @return that the terminal should be activated in cloud relay mode.
     */
     @JsonProperty("cloudRelay")
     public boolean isCloudRelay() {
          return this.cloudRelay;
     }

}
