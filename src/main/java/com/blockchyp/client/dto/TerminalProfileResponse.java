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
 * Models a terminal profile response.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class TerminalProfileResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private Collection<TerminalProfile> results;

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
     * Sets enumerates all terminal profiles in the response.
     * @param value enumerates all terminal profiles in the response.
     */
     public void setResults(Collection<TerminalProfile> value) {
          this.results = value;
     }

    /**
     * Gets enumerates all terminal profiles in the response.
     * @return enumerates all terminal profiles in the response.
     */
     @JsonProperty("results")
     public Collection<TerminalProfile> getResults() {
          return this.results;
     }

    /**
     * Adds a enumerates all terminal profiles in the response.
     * @param value enumerates all terminal profiles in the response.
     */
     public void addResult(TerminalProfile value) {
          if (this.results == null) {
               this.results = new ArrayList();
          }
          this.results.add(value);
     }

}
