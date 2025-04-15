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
 * Models a branding asset response.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class BrandingAssetResponse implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private String ownerId;

     private String ownerType;

     private String ownerName;

     private String levelName;

     private String narrativeTime;

     private BrandingAsset activeAsset;

     private Collection<BrandingAsset> results;

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
     * Sets the id owner of this branding stack.
     * @param value the id owner of this branding stack.
     */
     public void setOwnerId(String value) {
          this.ownerId = value;
     }

    /**
     * Gets the id owner of this branding stack.
     * @return the id owner of this branding stack.
     */
     @JsonProperty("ownerId")
     public String getOwnerId() {
          return this.ownerId;
     }

    /**
     * Sets the type of user or tenant that owns this branding stack.
     * @param value the type of user or tenant that owns this branding stack.
     */
     public void setOwnerType(String value) {
          this.ownerType = value;
     }

    /**
     * Gets the type of user or tenant that owns this branding stack.
     * @return the type of user or tenant that owns this branding stack.
     */
     @JsonProperty("ownerType")
     public String getOwnerType() {
          return this.ownerType;
     }

    /**
     * Sets the name of the entity or tenant that owns this branding stack.
     * @param value the name of the entity or tenant that owns this branding stack.
     */
     public void setOwnerName(String value) {
          this.ownerName = value;
     }

    /**
     * Gets the name of the entity or tenant that owns this branding stack.
     * @return the name of the entity or tenant that owns this branding stack.
     */
     @JsonProperty("ownerName")
     public String getOwnerName() {
          return this.ownerName;
     }

    /**
     * Sets the owner level currently being displayed.
     * @param value the owner level currently being displayed.
     */
     public void setLevelName(String value) {
          this.levelName = value;
     }

    /**
     * Gets the owner level currently being displayed.
     * @return the owner level currently being displayed.
     */
     @JsonProperty("levelName")
     public String getLevelName() {
          return this.levelName;
     }

    /**
     * Sets a narrative description of the current simulate time.
     * @param value a narrative description of the current simulate time.
     */
     public void setNarrativeTime(String value) {
          this.narrativeTime = value;
     }

    /**
     * Gets a narrative description of the current simulate time.
     * @return a narrative description of the current simulate time.
     */
     @JsonProperty("narrativeTime")
     public String getNarrativeTime() {
          return this.narrativeTime;
     }

    /**
     * Sets the asset currently displayed on the terminal.
     * @param value the asset currently displayed on the terminal.
     */
     public void setActiveAsset(BrandingAsset value) {
          this.activeAsset = value;
     }

    /**
     * Gets the asset currently displayed on the terminal.
     * @return the asset currently displayed on the terminal.
     */
     @JsonProperty("activeAsset")
     public BrandingAsset getActiveAsset() {
          return this.activeAsset;
     }

    /**
     * Sets enumerates all branding assets in a given credential scope.
     * @param value enumerates all branding assets in a given credential scope.
     */
     public void setResults(Collection<BrandingAsset> value) {
          this.results = value;
     }

    /**
     * Gets enumerates all branding assets in a given credential scope.
     * @return enumerates all branding assets in a given credential scope.
     */
     @JsonProperty("results")
     public Collection<BrandingAsset> getResults() {
          return this.results;
     }

    /**
     * Adds a enumerates all branding assets in a given credential scope.
     * @param value enumerates all branding assets in a given credential scope.
     */
     public void addResult(BrandingAsset value) {
          if (this.results == null) {
               this.results = new ArrayList();
          }
          this.results.add(value);
     }

}
