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
 * Models a terminal deactivation request.
 */
public class TerminalDeactivationRequest implements ITimeoutRequest {

     private int timeout;

     private boolean test;

     private String terminalName;

     private String terminalId;

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
     * Sets the terminal name assigned to the terminal.
     * @param value the terminal name assigned to the terminal.
     */
     public void setTerminalName(String value) {
          this.terminalName = value;
     }

    /**
     * Gets the terminal name assigned to the terminal.
     * @return the terminal name assigned to the terminal.
     */
     @JsonProperty("terminalName")
     public String getTerminalName() {
          return this.terminalName;
     }

    /**
     * Sets the id assigned by BlockChyp to the terminal.
     * @param value the id assigned by BlockChyp to the terminal.
     */
     public void setTerminalId(String value) {
          this.terminalId = value;
     }

    /**
     * Gets the id assigned by BlockChyp to the terminal.
     * @return the id assigned by BlockChyp to the terminal.
     */
     @JsonProperty("terminalId")
     public String getTerminalId() {
          return this.terminalId;
     }

}
