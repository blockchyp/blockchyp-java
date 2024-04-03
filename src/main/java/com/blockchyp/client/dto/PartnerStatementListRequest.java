/**
 * Copyright 2019-2024 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

/**
 * Models a request to retrieve a list of partner statements.
 */
public class PartnerStatementListRequest implements ITimeoutRequest {

     private int timeout;

     private boolean test;

     private Date startDate;

     private Date endDate;

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
     * Sets optional start date filter for batch history.
     * @param value optional start date filter for batch history.
     */
     public void setStartDate(Date value) {
          this.startDate = value;
     }

    /**
     * Gets optional start date filter for batch history.
     * @return optional start date filter for batch history.
     */
     @JsonProperty("startDate")
     public Date getStartDate() {
          return this.startDate;
     }

    /**
     * Sets optional end date filter for batch history.
     * @param value optional end date filter for batch history.
     */
     public void setEndDate(Date value) {
          this.endDate = value;
     }

    /**
     * Gets optional end date filter for batch history.
     * @return optional end date filter for batch history.
     */
     @JsonProperty("endDate")
     public Date getEndDate() {
          return this.endDate;
     }

}
