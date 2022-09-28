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
 * Models basic information needed to create a test merchant.
 */
public class AddTestMerchantRequest implements ITimeoutRequest {

     private boolean test;

     private String dbaName;

     private String companyName;

     private int timeout;

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
     * Sets the DBA name for the test merchant.
     * @param value the DBA name for the test merchant.
     */
     public void setDbaName(String value) {
          this.dbaName = value;
     }

    /**
     * Gets the DBA name for the test merchant.
     * @return the DBA name for the test merchant.
     */
     @JsonProperty("dbaName")
     public String getDbaName() {
          return this.dbaName;
     }

    /**
     * Sets the corporate name for the test merchant.
     * @param value the corporate name for the test merchant.
     */
     public void setCompanyName(String value) {
          this.companyName = value;
     }

    /**
     * Gets the corporate name for the test merchant.
     * @return the corporate name for the test merchant.
     */
     @JsonProperty("companyName")
     public String getCompanyName() {
          return this.companyName;
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

}
