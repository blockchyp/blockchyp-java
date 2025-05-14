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
 * Models a request to retrieve or manipulate terms and conditions data.
 */
public class TermsAndConditionsTemplateRequest implements ITimeoutRequest {

     private int timeout;

     private boolean test;

     private String templateId;

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
     @SerializedName("timeout")
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
     @SerializedName("test")
     public boolean isTest() {
          return this.test;
     }

    /**
     * Sets id of a single template.
     * @param value id of a single template.
     */
     public void setTemplateId(String value) {
          this.templateId = value;
     }

    /**
     * Gets id of a single template.
     * @return id of a single template.
     */
     @SerializedName("templateId")
     public String getTemplateId() {
          return this.templateId;
     }

}
