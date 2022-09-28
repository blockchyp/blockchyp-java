/**
 * Copyright 2019-2022 BlockChyp, Inc. All rights reserved. Use of this code is governed
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
 * A list of queued transactions on a terminal.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class ListQueuedTransactionsResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private Collection<String> transactionRefs;

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
     * Sets a list of queued transactions on the terminal.
     * @param value a list of queued transactions on the terminal.
     */
     public void setTransactionRefs(Collection<String> value) {
          this.transactionRefs = value;
     }

    /**
     * Gets a list of queued transactions on the terminal.
     * @return a list of queued transactions on the terminal.
     */
     @JsonProperty("transactionRefs")
     public Collection<String> getTransactionRefs() {
          return this.transactionRefs;
     }

    /**
     * Adds a a list of queued transactions on the terminal.
     * @param value a list of queued transactions on the terminal.
     */
     public void addTransactionRef(String value) {
          if (this.transactionRefs == null) {
               this.transactionRefs = new ArrayList();
          }
          this.transactionRefs.add(value);
     }

}
