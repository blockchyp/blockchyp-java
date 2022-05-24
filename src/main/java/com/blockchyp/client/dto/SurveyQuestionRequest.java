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
 * Models a request to retrieve or manipulate survey questions.
 */
public class SurveyQuestionRequest {

     private String questionId;

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
