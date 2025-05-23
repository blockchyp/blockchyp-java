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
 * Models a media library response.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class MediaLibraryResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private int maxResults;

     private int startIndex;

     private int resultCount;

     private int pages;

     private int currentPage;

     private Collection<MediaMetadata> results;

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
     * Sets total number of pages.
     * @param value total number of pages.
     */
     public void setPages(int value) {
          this.pages = value;
     }

    /**
     * Gets total number of pages.
     * @return total number of pages.
     */
     @JsonProperty("pages")
     public int getPages() {
          return this.pages;
     }

    /**
     * Sets page currently selected through paging.
     * @param value page currently selected through paging.
     */
     public void setCurrentPage(int value) {
          this.currentPage = value;
     }

    /**
     * Gets page currently selected through paging.
     * @return page currently selected through paging.
     */
     @JsonProperty("currentPage")
     public int getCurrentPage() {
          return this.currentPage;
     }

    /**
     * Sets enumerates all media assets available in the context.
     * @param value enumerates all media assets available in the context.
     */
     public void setResults(Collection<MediaMetadata> value) {
          this.results = value;
     }

    /**
     * Gets enumerates all media assets available in the context.
     * @return enumerates all media assets available in the context.
     */
     @JsonProperty("results")
     public Collection<MediaMetadata> getResults() {
          return this.results;
     }

    /**
     * Adds a enumerates all media assets available in the context.
     * @param value enumerates all media assets available in the context.
     */
     public void addResult(MediaMetadata value) {
          if (this.results == null) {
               this.results = new ArrayList();
          }
          this.results.add(value);
     }

}
