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
 * Models a Terms and Conditions log entry.
 */
public class TermsAndConditionsLogEntry implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private String id;

     private String terminalId;

     private String terminalName;

     private boolean test;

     private String timestamp;

     private String transactionRef;

     private String transactionId;

     private String alias;

     private String name;

     private String content;

     private String contentLeader;

     private boolean hasSignature;

     private SignatureFormat sigFormat;

     private String signature;

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
     * Sets internal id for a Terms and Conditions entry.
     * @param value internal id for a Terms and Conditions entry.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets internal id for a Terms and Conditions entry.
     * @return internal id for a Terms and Conditions entry.
     */
     @JsonProperty("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets id of the terminal that captured this terms and conditions entry.
     * @param value id of the terminal that captured this terms and conditions entry.
     */
     public void setTerminalId(String value) {
          this.terminalId = value;
     }

    /**
     * Gets id of the terminal that captured this terms and conditions entry.
     * @return id of the terminal that captured this terms and conditions entry.
     */
     @JsonProperty("terminalId")
     public String getTerminalId() {
          return this.terminalId;
     }

    /**
     * Sets name of the terminal that captured this terms and conditions entry.
     * @param value name of the terminal that captured this terms and conditions entry.
     */
     public void setTerminalName(String value) {
          this.terminalName = value;
     }

    /**
     * Gets name of the terminal that captured this terms and conditions entry.
     * @return name of the terminal that captured this terms and conditions entry.
     */
     @JsonProperty("terminalName")
     public String getTerminalName() {
          return this.terminalName;
     }

    /**
     * Sets a flag indicating whether or not the terminal was a test terminal.
     * @param value a flag indicating whether or not the terminal was a test terminal.
     */
     public void setTest(boolean value) {
          this.test = value;
     }

    /**
     * Gets a flag indicating whether or not the terminal was a test terminal.
     * @return a flag indicating whether or not the terminal was a test terminal.
     */
     @JsonProperty("test")
     public boolean isTest() {
          return this.test;
     }

    /**
     * Sets date and time the terms and conditions acceptance occurred.
     * @param value date and time the terms and conditions acceptance occurred.
     */
     public void setTimestamp(String value) {
          this.timestamp = value;
     }

    /**
     * Gets date and time the terms and conditions acceptance occurred.
     * @return date and time the terms and conditions acceptance occurred.
     */
     @JsonProperty("timestamp")
     public String getTimestamp() {
          return this.timestamp;
     }

    /**
     * Sets optional transaction ref if the terms and conditions was associated with a
     * transaction.
     * @param value optional transaction ref if the terms and conditions was associated
     * with a transaction.
     */
     public void setTransactionRef(String value) {
          this.transactionRef = value;
     }

    /**
     * Gets optional transaction ref if the terms and conditions was associated with a
     * transaction.
     * @return optional transaction ref if the terms and conditions was associated with a
     * transaction.
     */
     @JsonProperty("transactionRef")
     public String getTransactionRef() {
          return this.transactionRef;
     }

    /**
     * Sets optional transaction id if only log entries related to a transaction should be
     * returned.
     * @param value optional transaction id if only log entries related to a transaction
     * should be returned.
     */
     public void setTransactionId(String value) {
          this.transactionId = value;
     }

    /**
     * Gets optional transaction id if only log entries related to a transaction should be
     * returned.
     * @return optional transaction id if only log entries related to a transaction
     * should be returned.
     */
     @JsonProperty("transactionId")
     public String getTransactionId() {
          return this.transactionId;
     }

    /**
     * Sets alias of the terms and conditions template used for this entry, if any.
     * @param value alias of the terms and conditions template used for this entry, if any.
     */
     public void setAlias(String value) {
          this.alias = value;
     }

    /**
     * Gets alias of the terms and conditions template used for this entry, if any.
     * @return alias of the terms and conditions template used for this entry, if any.
     */
     @JsonProperty("alias")
     public String getAlias() {
          return this.alias;
     }

    /**
     * Sets title of the document displayed on the terminal at the time of capture.
     * @param value title of the document displayed on the terminal at the time of capture.
     */
     public void setName(String value) {
          this.name = value;
     }

    /**
     * Gets title of the document displayed on the terminal at the time of capture.
     * @return title of the document displayed on the terminal at the time of capture.
     */
     @JsonProperty("name")
     public String getName() {
          return this.name;
     }

    /**
     * Sets full text of the document agreed to at the time of signature capture.
     * @param value full text of the document agreed to at the time of signature capture.
     */
     public void setContent(String value) {
          this.content = value;
     }

    /**
     * Gets full text of the document agreed to at the time of signature capture.
     * @return full text of the document agreed to at the time of signature capture.
     */
     @JsonProperty("content")
     public String getContent() {
          return this.content;
     }

    /**
     * Sets first 32 characters of the full text.
     * @param value first 32 characters of the full text. Used to support user interfaces
     * that show summaries.
     */
     public void setContentLeader(String value) {
          this.contentLeader = value;
     }

    /**
     * Gets first 32 characters of the full text.
     * @return first 32 characters of the full text. Used to support user interfaces that
     * show summaries.
     */
     @JsonProperty("contentLeader")
     public String getContentLeader() {
          return this.contentLeader;
     }

    /**
     * Sets a flag that indicates whether or not a signature has been captured.
     * @param value a flag that indicates whether or not a signature has been captured.
     */
     public void setHasSignature(boolean value) {
          this.hasSignature = value;
     }

    /**
     * Gets a flag that indicates whether or not a signature has been captured.
     * @return a flag that indicates whether or not a signature has been captured.
     */
     @JsonProperty("hasSignature")
     public boolean isHasSignature() {
          return this.hasSignature;
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
     * Sets the base 64 encoded signature image if the format requested.
     * @param value the base 64 encoded signature image if the format requested.
     */
     public void setSignature(String value) {
          this.signature = value;
     }

    /**
     * Gets the base 64 encoded signature image if the format requested.
     * @return the base 64 encoded signature image if the format requested.
     */
     @JsonProperty("signature")
     public String getSignature() {
          return this.signature;
     }

}
