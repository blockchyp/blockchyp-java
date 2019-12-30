/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */
package com.blockchyp.client.dto;


/**
 * The response to a text prompt request.
 */
public class TextPromptResponse {

     private boolean success;

     private String error;

     private String responseDescription;

     private String response;

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
     public String getResponseDescription() {
          return this.responseDescription;
     }

     /**
      * Sets the text prompt response.
      * @param value the text prompt response.
      */
     public void setResponse(String value) {
          this.response = value;
     }

     /**
      * Gets the text prompt response.
      * @return the text prompt response.
      */
     public String getResponse() {
          return this.response;
     }

}
