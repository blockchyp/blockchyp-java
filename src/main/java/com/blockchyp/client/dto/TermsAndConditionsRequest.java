/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.blockchyp.client.dto.SignatureFormat;

/**
 * The fields needed for custom Terms and Conditions prompts.
 */
public class TermsAndConditionsRequest implements ICoreRequest, IPreviousTransaction, ISignatureRequest, ITerminalReference {

     private String transactionRef;

     private String orderRef;

     private String destinationAccount;

     private boolean test;

     private int timeout;

     private String transactionId;

     private String sigFile;

     private SignatureFormat sigFormat;

     private int sigWidth;

     private String terminalName;

     private String tcAlias;

     private String tcName;

     private String tcContent;

     private boolean sigRequired;

     /**
      * Sets the transaction reference string assigned to the transaction request.
      * @param value the transaction reference string assigned to the transaction
      * request. If no transaction ref was assiged on the request, then the gateway will
      * randomly generate one.
      */
     public void setTransactionRef(String value) {
          this.transactionRef = value;
     }

     /**
      * Gets the transaction reference string assigned to the transaction request.
      * @return the transaction reference string assigned to the transaction request.
      * If no transaction ref was assiged on the request, then the gateway will randomly
      * generate one.
      */
     @JsonProperty("transactionRef")
     public String getTransactionRef() {
          return this.transactionRef;
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
      * Sets the ID of the previous transaction being referenced.
      * @param value the ID of the previous transaction being referenced.
      */
     public void setTransactionId(String value) {
          this.transactionId = value;
     }

     /**
      * Gets the ID of the previous transaction being referenced.
      * @return the ID of the previous transaction being referenced.
      */
     @JsonProperty("transactionId")
     public String getTransactionId() {
          return this.transactionId;
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
      * @param value the width that the signature image should be scaled to, preserving
      * the aspect ratio. If not provided, the signature is returned in the terminal's max
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
      * Sets an alias for a Terms and Conditions template configured in the BlockChyp
      * dashboard.
      * @param value an alias for a Terms and Conditions template configured in the
      * BlockChyp dashboard.
      */
     public void setTcAlias(String value) {
          this.tcAlias = value;
     }

     /**
      * Gets an alias for a Terms and Conditions template configured in the BlockChyp
      * dashboard.
      * @return an alias for a Terms and Conditions template configured in the BlockChyp
      * dashboard.
      */
     @JsonProperty("tcAlias")
     public String getTcAlias() {
          return this.tcAlias;
     }

     /**
      * Sets the name of the Terms and Conditions the user is accepting.
      * @param value the name of the Terms and Conditions the user is accepting.
      */
     public void setTcName(String value) {
          this.tcName = value;
     }

     /**
      * Gets the name of the Terms and Conditions the user is accepting.
      * @return the name of the Terms and Conditions the user is accepting.
      */
     @JsonProperty("tcName")
     public String getTcName() {
          return this.tcName;
     }

     /**
      * Sets the content of the terms and conditions that will be presented to the user.
      * @param value the content of the terms and conditions that will be presented to the
      * user.
      */
     public void setTcContent(String value) {
          this.tcContent = value;
     }

     /**
      * Gets the content of the terms and conditions that will be presented to the user.
      * @return the content of the terms and conditions that will be presented to the user.
      */
     @JsonProperty("tcContent")
     public String getTcContent() {
          return this.tcContent;
     }

     /**
      * Sets that a signature should be requested.
      * @param value that a signature should be requested.
      */
     public void setSigRequired(boolean value) {
          this.sigRequired = value;
     }

     /**
      * Gets that a signature should be requested.
      * @return that a signature should be requested.
      */
     @JsonProperty("sigRequired")
     public boolean isSigRequired() {
          return this.sigRequired;
     }

}
