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
 * Models a request to retrieve survey results.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class MediaMetadata implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private String id;

     private String originalFile;

     private String name;

     private String description;

     private Collection<String> tags;

     private String fileUrl;

     private String thumbnailUrl;

     private boolean video;

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
     * Sets id used to identify the media asset.
     * @param value id used to identify the media asset.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets id used to identify the media asset.
     * @return id used to identify the media asset.
     */
     @JsonProperty("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets the original filename assigned to the media asset.
     * @param value the original filename assigned to the media asset.
     */
     public void setOriginalFile(String value) {
          this.originalFile = value;
     }

    /**
     * Gets the original filename assigned to the media asset.
     * @return the original filename assigned to the media asset.
     */
     @JsonProperty("originalFile")
     public String getOriginalFile() {
          return this.originalFile;
     }

    /**
     * Sets the descriptive name of the media asset.
     * @param value the descriptive name of the media asset.
     */
     public void setName(String value) {
          this.name = value;
     }

    /**
     * Gets the descriptive name of the media asset.
     * @return the descriptive name of the media asset.
     */
     @JsonProperty("name")
     public String getName() {
          return this.name;
     }

    /**
     * Sets a description of the media asset and its purpose.
     * @param value a description of the media asset and its purpose.
     */
     public void setDescription(String value) {
          this.description = value;
     }

    /**
     * Gets a description of the media asset and its purpose.
     * @return a description of the media asset and its purpose.
     */
     @JsonProperty("description")
     public String getDescription() {
          return this.description;
     }

    /**
     * Sets an array of tags associated with a media asset.
     * @param value an array of tags associated with a media asset.
     */
     public void setTags(Collection<String> value) {
          this.tags = value;
     }

    /**
     * Gets an array of tags associated with a media asset.
     * @return an array of tags associated with a media asset.
     */
     @JsonProperty("tags")
     public Collection<String> getTags() {
          return this.tags;
     }

    /**
     * Sets the url for the full resolution versio of the media file.
     * @param value the url for the full resolution versio of the media file.
     */
     public void setFileUrl(String value) {
          this.fileUrl = value;
     }

    /**
     * Gets the url for the full resolution versio of the media file.
     * @return the url for the full resolution versio of the media file.
     */
     @JsonProperty("fileUrl")
     public String getFileUrl() {
          return this.fileUrl;
     }

    /**
     * Sets the url for to the thumbnail of an image.
     * @param value the url for to the thumbnail of an image.
     */
     public void setThumbnailUrl(String value) {
          this.thumbnailUrl = value;
     }

    /**
     * Gets the url for to the thumbnail of an image.
     * @return the url for to the thumbnail of an image.
     */
     @JsonProperty("thumbnailUrl")
     public String getThumbnailUrl() {
          return this.thumbnailUrl;
     }

    /**
     * Sets an identifier used to flag video files.
     * @param value an identifier used to flag video files.
     */
     public void setVideo(boolean value) {
          this.video = value;
     }

    /**
     * Gets an identifier used to flag video files.
     * @return an identifier used to flag video files.
     */
     @JsonProperty("video")
     public boolean isVideo() {
          return this.video;
     }

    /**
     * Adds a an array of tags associated with a media asset.
     * @param value an array of tags associated with a media asset.
     */
     public void addTag(String value) {
          if (this.tags == null) {
               this.tags = new ArrayList();
          }
          this.tags.add(value);
     }

}
