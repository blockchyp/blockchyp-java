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
 * Creates a payment link.
 */
public class PaymentLinkResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private String linkCode;

     private String url;

     private String qrcodeUrl;

     private String qrcodeBinary;

     private String customerId;

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
     * Sets the payment link code.
     * @param value the payment link code.
     */
     public void setLinkCode(String value) {
          this.linkCode = value;
     }

    /**
     * Gets the payment link code.
     * @return the payment link code.
     */
     @JsonProperty("linkCode")
     public String getLinkCode() {
          return this.linkCode;
     }

    /**
     * Sets the url for the payment link.
     * @param value the url for the payment link.
     */
     public void setUrl(String value) {
          this.url = value;
     }

    /**
     * Gets the url for the payment link.
     * @return the url for the payment link.
     */
     @JsonProperty("url")
     public String getUrl() {
          return this.url;
     }

    /**
     * Sets the url for a QR Code associated with this link.
     * @param value the url for a QR Code associated with this link.
     */
     public void setQrcodeUrl(String value) {
          this.qrcodeUrl = value;
     }

    /**
     * Gets the url for a QR Code associated with this link.
     * @return the url for a QR Code associated with this link.
     */
     @JsonProperty("qrcodeUrl")
     public String getQrcodeUrl() {
          return this.qrcodeUrl;
     }

    /**
     * Sets the hex encoded binary for the QR Code, if requested.
     * @param value the hex encoded binary for the QR Code, if requested. Encoded in PNG
     * format.
     */
     public void setQrcodeBinary(String value) {
          this.qrcodeBinary = value;
     }

    /**
     * Gets the hex encoded binary for the QR Code, if requested.
     * @return the hex encoded binary for the QR Code, if requested. Encoded in PNG format.
     */
     @JsonProperty("qrcodeBinary")
     public String getQrcodeBinary() {
          return this.qrcodeBinary;
     }

    /**
     * Sets the customer id created or used for the payment.
     * @param value the customer id created or used for the payment.
     */
     public void setCustomerId(String value) {
          this.customerId = value;
     }

    /**
     * Gets the customer id created or used for the payment.
     * @return the customer id created or used for the payment.
     */
     @JsonProperty("customerId")
     public String getCustomerId() {
          return this.customerId;
     }

}
