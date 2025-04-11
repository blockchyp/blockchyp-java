/**
 * Copyright 2019-2025 BlockChyp, Inc. All rights reserved. Use of this code is governed
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
 * The results for a merchant list request.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class GetMerchantsResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private boolean test;

     private int maxResults;

     private int startIndex;

     private int resultCount;

     private Collection<MerchantProfileResponse> merchants;

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
     * Sets whether or not these results are for test or live merchants.
     * @param value whether or not these results are for test or live merchants.
     */
     public void setTest(boolean value) {
          this.test = value;
     }

    /**
     * Gets whether or not these results are for test or live merchants.
     * @return whether or not these results are for test or live merchants.
     */
     @JsonProperty("test")
     public boolean isTest() {
          return this.test;
     }

    /**
     * Sets max to be returned in a single page.
     * @param value max to be returned in a single page. Defaults to the system max of 250.
     */
     public void setMaxResults(int value) {
          this.maxResults = value;
     }

    /**
     * Gets max to be returned in a single page.
     * @return max to be returned in a single page. Defaults to the system max of 250.
     */
     @JsonProperty("maxResults")
     public int getMaxResults() {
          return this.maxResults;
     }

    /**
     * Sets starting index for paged results.
     * @param value starting index for paged results. Defaults to zero.
     */
     public void setStartIndex(int value) {
          this.startIndex = value;
     }

    /**
     * Gets starting index for paged results.
     * @return starting index for paged results. Defaults to zero.
     */
     @JsonProperty("startIndex")
     public int getStartIndex() {
          return this.startIndex;
     }

    /**
     * Sets total number of results accessible through paging.
     * @param value total number of results accessible through paging.
     */
     public void setResultCount(int value) {
          this.resultCount = value;
     }

    /**
     * Gets total number of results accessible through paging.
     * @return total number of results accessible through paging.
     */
     @JsonProperty("resultCount")
     public int getResultCount() {
          return this.resultCount;
     }

    /**
     * Sets merchants in the current page of results.
     * @param value merchants in the current page of results.
     */
     public void setMerchants(Collection<MerchantProfileResponse> value) {
          this.merchants = value;
     }

    /**
     * Gets merchants in the current page of results.
     * @return merchants in the current page of results.
     */
     @JsonProperty("merchants")
     public Collection<MerchantProfileResponse> getMerchants() {
          return this.merchants;
     }

    /**
     * Adds a merchants in the current page of results.
     * @param value merchants in the current page of results.
     */
     public void addMerchant(MerchantProfileResponse value) {
          if (this.merchants == null) {
               this.merchants = new ArrayList();
          }
          this.merchants.add(value);
     }

}
