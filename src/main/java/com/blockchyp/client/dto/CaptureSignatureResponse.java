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
 * Customer signature data.
 */
public class CaptureSignatureResponse implements IAbstractAcknowledgement, ISignatureResponse {

     private boolean success;

     private String error;

     private String responseDescription;

     private String sigFile;

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
     @SerializedName("success")
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
     @SerializedName("error")
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
     @SerializedName("responseDescription")
     public String getResponseDescription() {
          return this.responseDescription;
     }

    /**
     * Sets the hex encoded signature data.
     * @param value the hex encoded signature data.
     */
     public void setSigFile(String value) {
          this.sigFile = value;
     }

    /**
     * Gets the hex encoded signature data.
     * @return the hex encoded signature data.
     */
     @SerializedName("sigFile")
     public String getSigFile() {
          return this.sigFile;
     }

}
