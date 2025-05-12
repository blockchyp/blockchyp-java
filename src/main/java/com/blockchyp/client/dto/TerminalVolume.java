/**
 * Copyright 2019-2025 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.google.gson.annotations.SerializedName;


/**
 * Models transaction volume for a single terminal.
 */
public class TerminalVolume {

     private String terminalName;

     private String serialNumber;

     private String terminalType;

     private String capturedAmount;

     private int transactionCount;

    /**
     * Sets the terminal name assigned during activation.
     * @param value the terminal name assigned during activation.
     */
     public void setTerminalName(String value) {
          this.terminalName = value;
     }

    /**
     * Gets the terminal name assigned during activation.
     * @return the terminal name assigned during activation.
     */
     @SerializedName("terminalName")
     public String getTerminalName() {
          return this.terminalName;
     }

    /**
     * Sets the manufacturer's serial number.
     * @param value the manufacturer's serial number.
     */
     public void setSerialNumber(String value) {
          this.serialNumber = value;
     }

    /**
     * Gets the manufacturer's serial number.
     * @return the manufacturer's serial number.
     */
     @SerializedName("serialNumber")
     public String getSerialNumber() {
          return this.serialNumber;
     }

    /**
     * Sets the terminal type.
     * @param value the terminal type.
     */
     public void setTerminalType(String value) {
          this.terminalType = value;
     }

    /**
     * Gets the terminal type.
     * @return the terminal type.
     */
     @SerializedName("terminalType")
     public String getTerminalType() {
          return this.terminalType;
     }

    /**
     * Sets the captured amount.
     * @param value the captured amount.
     */
     public void setCapturedAmount(String value) {
          this.capturedAmount = value;
     }

    /**
     * Gets the captured amount.
     * @return the captured amount.
     */
     @SerializedName("capturedAmount")
     public String getCapturedAmount() {
          return this.capturedAmount;
     }

    /**
     * Sets the number of transactions run on this terminal.
     * @param value the number of transactions run on this terminal.
     */
     public void setTransactionCount(int value) {
          this.transactionCount = value;
     }

    /**
     * Gets the number of transactions run on this terminal.
     * @return the number of transactions run on this terminal.
     */
     @SerializedName("transactionCount")
     public int getTransactionCount() {
          return this.transactionCount;
     }

}
