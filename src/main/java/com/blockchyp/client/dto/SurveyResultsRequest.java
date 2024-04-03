/**
 * Copyright 2019-2024 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Models a request to retrieve survey results.
 */
public class SurveyResultsRequest implements ITimeoutRequest {

     private int timeout;

     private boolean test;

     private String questionId;

     private String startDate;

     private String endDate;

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
     * Sets id of a single question.
     * @param value id of a single question.
     */
     public void setQuestionId(String value) {
          this.questionId = value;
     }

    /**
     * Gets id of a single question.
     * @return id of a single question.
     */
     @JsonProperty("questionId")
     public String getQuestionId() {
          return this.questionId;
     }

    /**
     * Sets an optional start date for filtering response data.
     * @param value an optional start date for filtering response data.
     */
     public void setStartDate(String value) {
          this.startDate = value;
     }

    /**
     * Gets an optional start date for filtering response data.
     * @return an optional start date for filtering response data.
     */
     @JsonProperty("startDate")
     public String getStartDate() {
          return this.startDate;
     }

    /**
     * Sets an optional end date for filtering response data.
     * @param value an optional end date for filtering response data.
     */
     public void setEndDate(String value) {
          this.endDate = value;
     }

    /**
     * Gets an optional end date for filtering response data.
     * @return an optional end date for filtering response data.
     */
     @JsonProperty("endDate")
     public String getEndDate() {
          return this.endDate;
     }

}
