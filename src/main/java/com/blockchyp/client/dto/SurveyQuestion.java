/**
 * Copyright 2019-2026 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Models a survey question.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class SurveyQuestion implements ITimeoutRequest, IAbstractAcknowledgement {

     private int timeout;

     private boolean test;

     private boolean success;

     private String error;

     private String responseDescription;

     private String id;

     private int ordinal;

     private boolean enabled;

     private String questionText;

     private String questionType;

     private int transactionCount;

     private int responseCount;

     private float responseRate;

     private Collection<SurveyDataPoint> responses;

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
     * Sets internal id for a survey question.
     * @param value internal id for a survey question.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets internal id for a survey question.
     * @return internal id for a survey question.
     */
     @JsonProperty("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets ordinal number indicating the position of the survey question in the post
     * transaction sequence.
     * @param value ordinal number indicating the position of the survey question in the
     * post transaction sequence.
     */
     public void setOrdinal(int value) {
          this.ordinal = value;
     }

    /**
     * Gets ordinal number indicating the position of the survey question in the post
     * transaction sequence.
     * @return ordinal number indicating the position of the survey question in the post
     * transaction sequence.
     */
     @JsonProperty("ordinal")
     public int getOrdinal() {
          return this.ordinal;
     }

    /**
     * Sets determines whether or not the question will be presented post transaction.
     * @param value determines whether or not the question will be presented post
     * transaction.
     */
     public void setEnabled(boolean value) {
          this.enabled = value;
     }

    /**
     * Gets determines whether or not the question will be presented post transaction.
     * @return determines whether or not the question will be presented post
     * transaction.
     */
     @JsonProperty("enabled")
     public boolean isEnabled() {
          return this.enabled;
     }

    /**
     * Sets the full text of the transaction.
     * @param value the full text of the transaction.
     */
     public void setQuestionText(String value) {
          this.questionText = value;
     }

    /**
     * Gets the full text of the transaction.
     * @return the full text of the transaction.
     */
     @JsonProperty("questionText")
     public String getQuestionText() {
          return this.questionText;
     }

    /**
     * Sets the type of question.
     * @param value the type of question. Valid values are 'yes_no' and 'scaled'.
     */
     public void setQuestionType(String value) {
          this.questionType = value;
     }

    /**
     * Gets the type of question.
     * @return the type of question. Valid values are 'yes_no' and 'scaled'.
     */
     @JsonProperty("questionType")
     public String getQuestionType() {
          return this.questionType;
     }

    /**
     * Sets the total number of transactions processed during the query period if results
     * are requested.
     * @param value the total number of transactions processed during the query period if
     * results are requested.
     */
     public void setTransactionCount(int value) {
          this.transactionCount = value;
     }

    /**
     * Gets the total number of transactions processed during the query period if results
     * are requested.
     * @return the total number of transactions processed during the query period if
     * results are requested.
     */
     @JsonProperty("transactionCount")
     public int getTransactionCount() {
          return this.transactionCount;
     }

    /**
     * Sets the total number of responses during the query period if results are
     * requested.
     * @param value the total number of responses during the query period if results are
     * requested.
     */
     public void setResponseCount(int value) {
          this.responseCount = value;
     }

    /**
     * Gets the total number of responses during the query period if results are
     * requested.
     * @return the total number of responses during the query period if results are
     * requested.
     */
     @JsonProperty("responseCount")
     public int getResponseCount() {
          return this.responseCount;
     }

    /**
     * Sets the response rate, expressed as a ratio, if results are requested.
     * @param value the response rate, expressed as a ratio, if results are requested.
     */
     public void setResponseRate(float value) {
          this.responseRate = value;
     }

    /**
     * Gets the response rate, expressed as a ratio, if results are requested.
     * @return the response rate, expressed as a ratio, if results are requested.
     */
     @JsonProperty("responseRate")
     public float getResponseRate() {
          return this.responseRate;
     }

    /**
     * Sets the set of response data points.
     * @param value the set of response data points.
     */
     public void setResponses(Collection<SurveyDataPoint> value) {
          this.responses = value;
     }

    /**
     * Gets the set of response data points.
     * @return the set of response data points.
     */
     @JsonProperty("responses")
     public Collection<SurveyDataPoint> getResponses() {
          return this.responses;
     }

    /**
     * Adds a the set of response data points.
     * @param value the set of response data points.
     */
     public void addResponse(SurveyDataPoint value) {
          if (this.responses == null) {
               this.responses = new ArrayList();
          }
          this.responses.add(value);
     }

}
