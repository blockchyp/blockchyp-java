/**
 * Copyright 2019-2022 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * 
 */
public class TerminalDeactivationRequest {

     private String terminalName;

     private String terminalId;

     private int timeout;

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

    /**
     * Sets the optional timeout override for a terminal profile request.
     * @param value the optional timeout override for a terminal profile request.
     */
     public void setTimeout(int value) {
          this.timeout = value;
     }

    /**
     * Gets the optional timeout override for a terminal profile request.
     * @return the optional timeout override for a terminal profile request.
     */
     @JsonProperty("timeout")
     public int getTimeout() {
          return this.timeout;
     }

}
