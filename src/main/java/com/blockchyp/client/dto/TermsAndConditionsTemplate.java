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
 * Models a full terms and conditions template.
 */
public class TermsAndConditionsTemplate implements ITimeoutRequest, IAbstractAcknowledgement {

     private int timeout;

     private boolean test;

     private boolean success;

     private String error;

     private String responseDescription;

     private String id;

     private String alias;

     private String name;

     private String content;

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
     * Sets primary identifier for a given template.
     * @param value primary identifier for a given template.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets primary identifier for a given template.
     * @return primary identifier for a given template.
     */
     @JsonProperty("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets an alias or code used to refer to a template.
     * @param value an alias or code used to refer to a template.
     */
     public void setAlias(String value) {
          this.alias = value;
     }

    /**
     * Gets an alias or code used to refer to a template.
     * @return an alias or code used to refer to a template.
     */
     @JsonProperty("alias")
     public String getAlias() {
          return this.alias;
     }

    /**
     * Sets the name of the template.
     * @param value the name of the template. Displayed as the agreement title on the
     * terminal.
     */
     public void setName(String value) {
          this.name = value;
     }

    /**
     * Gets the name of the template.
     * @return the name of the template. Displayed as the agreement title on the terminal.
     */
     @JsonProperty("name")
     public String getName() {
          return this.name;
     }

    /**
     * Sets the full text of the agreement template.
     * @param value the full text of the agreement template.
     */
     public void setContent(String value) {
          this.content = value;
     }

    /**
     * Gets the full text of the agreement template.
     * @return the full text of the agreement template.
     */
     @JsonProperty("content")
     public String getContent() {
          return this.content;
     }

}
