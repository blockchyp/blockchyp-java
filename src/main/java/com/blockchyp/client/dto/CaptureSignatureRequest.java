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
 * A request for customer signature data.
 */
public class CaptureSignatureRequest implements ITimeoutRequest, ICoreRequest, ISignatureRequest, ITerminalReference {

     private int timeout;

     private boolean test;

     private String transactionRef;

     private boolean async;

     private boolean queue;

     private boolean waitForRemovedCard;

     private boolean force;

     private String orderRef;

     private String destinationAccount;

     private String sigFile;

     private SignatureFormat sigFormat;

     private int sigWidth;

     private boolean disableSignature;

     private String terminalName;

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
     * Sets a user-assigned reference that can be used to recall or reverse transactions.
     * @param value a user-assigned reference that can be used to recall or reverse
     * transactions.
     */
     public void setTransactionRef(String value) {
          this.transactionRef = value;
     }

    /**
     * Gets a user-assigned reference that can be used to recall or reverse transactions.
     * @return a user-assigned reference that can be used to recall or reverse
     * transactions.
     */
     @JsonProperty("transactionRef")
     public String getTransactionRef() {
          return this.transactionRef;
     }

    /**
     * Sets defers the response to the transaction and returns immediately.
     * @param value defers the response to the transaction and returns immediately.
     * Callers should retrive the transaction result using the Transaction Status API.
     */
     public void setAsync(boolean value) {
          this.async = value;
     }

    /**
     * Gets defers the response to the transaction and returns immediately.
     * @return defers the response to the transaction and returns immediately. Callers
     * should retrive the transaction result using the Transaction Status API.
     */
     @JsonProperty("async")
     public boolean isAsync() {
          return this.async;
     }

    /**
     * Sets adds the transaction to the queue and returns immediately.
     * @param value adds the transaction to the queue and returns immediately. Callers
     * should retrive the transaction result using the Transaction Status API.
     */
     public void setQueue(boolean value) {
          this.queue = value;
     }

    /**
     * Gets adds the transaction to the queue and returns immediately.
     * @return adds the transaction to the queue and returns immediately. Callers should
     * retrive the transaction result using the Transaction Status API.
     */
     @JsonProperty("queue")
     public boolean isQueue() {
          return this.queue;
     }

    /**
     * Sets whether or not the request should block until all cards have been removed from
     * the card reader.
     * @param value whether or not the request should block until all cards have been
     * removed from the card reader.
     */
     public void setWaitForRemovedCard(boolean value) {
          this.waitForRemovedCard = value;
     }

    /**
     * Gets whether or not the request should block until all cards have been removed from
     * the card reader.
     * @return whether or not the request should block until all cards have been removed
     * from the card reader.
     */
     @JsonProperty("waitForRemovedCard")
     public boolean isWaitForRemovedCard() {
          return this.waitForRemovedCard;
     }

    /**
     * Sets override any in-progress transactions.
     * @param value override any in-progress transactions.
     */
     public void setForce(boolean value) {
          this.force = value;
     }

    /**
     * Gets override any in-progress transactions.
     * @return override any in-progress transactions.
     */
     @JsonProperty("force")
     public boolean isForce() {
          return this.force;
     }

    /**
     * Sets an identifier from an external point of sale system.
     * @param value an identifier from an external point of sale system.
     */
     public void setOrderRef(String value) {
          this.orderRef = value;
     }

    /**
     * Gets an identifier from an external point of sale system.
     * @return an identifier from an external point of sale system.
     */
     @JsonProperty("orderRef")
     public String getOrderRef() {
          return this.orderRef;
     }

    /**
     * Sets the settlement account for merchants with split settlements.
     * @param value the settlement account for merchants with split settlements.
     */
     public void setDestinationAccount(String value) {
          this.destinationAccount = value;
     }

    /**
     * Gets the settlement account for merchants with split settlements.
     * @return the settlement account for merchants with split settlements.
     */
     @JsonProperty("destinationAccount")
     public String getDestinationAccount() {
          return this.destinationAccount;
     }

    /**
     * Sets a location on the filesystem which a customer signature should be written to.
     * @param value a location on the filesystem which a customer signature should be
     * written to.
     */
     public void setSigFile(String value) {
          this.sigFile = value;
     }

    /**
     * Gets a location on the filesystem which a customer signature should be written to.
     * @return a location on the filesystem which a customer signature should be written
     * to.
     */
     @JsonProperty("sigFile")
     public String getSigFile() {
          return this.sigFile;
     }

    /**
     * Sets the image format to be used for returning signatures.
     * @param value the image format to be used for returning signatures.
     */
     public void setSigFormat(SignatureFormat value) {
          this.sigFormat = value;
     }

    /**
     * Gets the image format to be used for returning signatures.
     * @return the image format to be used for returning signatures.
     */
     @JsonProperty("sigFormat")
     public SignatureFormat getSigFormat() {
          return this.sigFormat;
     }

    /**
     * Sets the width that the signature image should be scaled to, preserving the aspect
     * ratio.
     * @param value the width that the signature image should be scaled to, preserving the
     * aspect ratio. If not provided, the signature is returned in the terminal's max
     * resolution.
     */
     public void setSigWidth(int value) {
          this.sigWidth = value;
     }

    /**
     * Gets the width that the signature image should be scaled to, preserving the aspect
     * ratio.
     * @return the width that the signature image should be scaled to, preserving the
     * aspect ratio. If not provided, the signature is returned in the terminal's max
     * resolution.
     */
     @JsonProperty("sigWidth")
     public int getSigWidth() {
          return this.sigWidth;
     }

    /**
     * Sets whether or not signature prompt should be skipped on the terminal.
     * @param value whether or not signature prompt should be skipped on the terminal. The
     * terminal will indicate whether or not a signature is required by the card in the
     * receipt suggestions response.
     */
     public void setDisableSignature(boolean value) {
          this.disableSignature = value;
     }

    /**
     * Gets whether or not signature prompt should be skipped on the terminal.
     * @return whether or not signature prompt should be skipped on the terminal. The
     * terminal will indicate whether or not a signature is required by the card in the
     * receipt suggestions response.
     */
     @JsonProperty("disableSignature")
     public boolean isDisableSignature() {
          return this.disableSignature;
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

}
