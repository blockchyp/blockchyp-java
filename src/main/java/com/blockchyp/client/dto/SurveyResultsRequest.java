/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Models a request to retrieve survey results.
 */
public class SurveyResultsRequest {

     private String questionId;

     private String startDate;

     private String endDate;

     private int timeout;

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

    /**
     * Sets an optional timeout override.
     * @param value an optional timeout override.
     */
     public void setTimeout(int value) {
          this.timeout = value;
     }

    /**
     * Gets an optional timeout override.
     * @return an optional timeout override.
     */
     @JsonProperty("timeout")
     public int getTimeout() {
          return this.timeout;
     }

}
