/**
 * Copyright 2019-2026 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Models a request for terminal service fees.
 */
public class ServiceFeeRequest implements ITimeoutRequest, ITerminalReference {

     private int timeout;

     private boolean test;

     private String terminalName;

     private boolean resetConnection;

     private String pan;

     private String amount;

     private String terminalDukptKey;

     private String transactionEntropy;

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
     * Sets the name of the target payment terminal.
     * @param value the name of the target payment terminal.
     */
     public void setTerminalName(String value) {
          this.terminalName = value;
     }

    /**
     * Gets the name of the target payment terminal.
     * @return the name of the target payment terminal.
     */
     @JsonProperty("terminalName")
     public String getTerminalName() {
          return this.terminalName;
     }

    /**
     * Sets forces the terminal cloud connection to be reset while a transactions is in
     * flight.
     * @param value forces the terminal cloud connection to be reset while a transactions
     * is in flight. This is a diagnostic settings that can be used only for test
     * transactions.
     */
     public void setResetConnection(boolean value) {
          this.resetConnection = value;
     }

    /**
     * Gets forces the terminal cloud connection to be reset while a transactions is in
     * flight.
     * @return forces the terminal cloud connection to be reset while a transactions is in
     * flight. This is a diagnostic settings that can be used only for test transactions.
     */
     @JsonProperty("resetConnection")
     public boolean isResetConnection() {
          return this.resetConnection;
     }

    /**
     * Sets the primary account number (PAN) of the card.
     * @param value the primary account number (PAN) of the card.
     */
     public void setPan(String value) {
          this.pan = value;
     }

    /**
     * Gets the primary account number (PAN) of the card.
     * @return the primary account number (PAN) of the card.
     */
     @JsonProperty("pan")
     public String getPan() {
          return this.pan;
     }

    /**
     * Sets the transaction amount.
     * @param value the transaction amount.
     */
     public void setAmount(String value) {
          this.amount = value;
     }

    /**
     * Gets the transaction amount.
     * @return the transaction amount.
     */
     @JsonProperty("amount")
     public String getAmount() {
          return this.amount;
     }

    /**
     * Sets the terminal DUKPT key for the request.
     * @param value the terminal DUKPT key for the request.
     */
     public void setTerminalDukptKey(String value) {
          this.terminalDukptKey = value;
     }

    /**
     * Gets the terminal DUKPT key for the request.
     * @return the terminal DUKPT key for the request.
     */
     @JsonProperty("terminalDukptKey")
     public String getTerminalDukptKey() {
          return this.terminalDukptKey;
     }

    /**
     * Sets the hex encoded transaction entropy used to derive the DUKPT transaction key.
     * @param value the hex encoded transaction entropy used to derive the DUKPT
     * transaction key.
     */
     public void setTransactionEntropy(String value) {
          this.transactionEntropy = value;
     }

    /**
     * Gets the hex encoded transaction entropy used to derive the DUKPT transaction key.
     * @return the hex encoded transaction entropy used to derive the DUKPT transaction
     * key.
     */
     @JsonProperty("transactionEntropy")
     public String getTransactionEntropy() {
          return this.transactionEntropy;
     }

}
