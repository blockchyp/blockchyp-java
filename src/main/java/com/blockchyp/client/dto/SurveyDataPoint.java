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
public class SurveyDataPoint {

     private String answerKey;

     private String answerDescription;

     private int responseCount;

     private float responsePercentage;

     private float averageTransaction;

    /**
     * Sets a unique identifier for a specific answer type.
     * @param value a unique identifier for a specific answer type.
     */
     public void setAnswerKey(String value) {
          this.answerKey = value;
     }

    /**
     * Gets a unique identifier for a specific answer type.
     * @return a unique identifier for a specific answer type.
     */
     @JsonProperty("answerKey")
     public String getAnswerKey() {
          return this.answerKey;
     }

    /**
     * Sets a narrative description of the answer.
     * @param value a narrative description of the answer.
     */
     public void setAnswerDescription(String value) {
          this.answerDescription = value;
     }

    /**
     * Gets a narrative description of the answer.
     * @return a narrative description of the answer.
     */
     @JsonProperty("answerDescription")
     public String getAnswerDescription() {
          return this.answerDescription;
     }

    /**
     * Sets the number of responses.
     * @param value the number of responses.
     */
     public void setResponseCount(int value) {
          this.responseCount = value;
     }

    /**
     * Gets the number of responses.
     * @return the number of responses.
     */
     @JsonProperty("responseCount")
     public int getResponseCount() {
          return this.responseCount;
     }

    /**
     * Sets response rate as a percentage of total transactions
     * @param value response rate as a percentage of total transactions
     */
     public void setResponsePercentage(float value) {
          this.responsePercentage = value;
     }

    /**
     * Gets response rate as a percentage of total transactions
     * @return response rate as a percentage of total transactions
     */
     @JsonProperty("responsePercentage")
     public float getResponsePercentage() {
          return this.responsePercentage;
     }

    /**
     * Sets the average transaction amount for a given answer.
     * @param value the average transaction amount for a given answer.
     */
     public void setAverageTransaction(float value) {
          this.averageTransaction = value;
     }

    /**
     * Gets the average transaction amount for a given answer.
     * @return the average transaction amount for a given answer.
     */
     @JsonProperty("averageTransaction")
     public float getAverageTransaction() {
          return this.averageTransaction;
     }

}
