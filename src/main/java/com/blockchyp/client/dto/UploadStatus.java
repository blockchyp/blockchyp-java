/**
 * Copyright 2019-2024 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Models the current status of a file upload.
 */
public class UploadStatus implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private String id;

     private String mediaId;

     private int fileSize;

     private int uploadedAmount;

     private String status;

     private boolean complete;

     private boolean processing;

     private int percentage;

     private String thumbnailLocation;

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
     * Sets id used to track status and progress of an upload while in progress.
     * @param value id used to track status and progress of an upload while in progress.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets id used to track status and progress of an upload while in progress.
     * @return id used to track status and progress of an upload while in progress.
     */
     @JsonProperty("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets the media id assigned to the result.
     * @param value the media id assigned to the result.
     */
     public void setMediaId(String value) {
          this.mediaId = value;
     }

    /**
     * Gets the media id assigned to the result.
     * @return the media id assigned to the result.
     */
     @JsonProperty("mediaId")
     public String getMediaId() {
          return this.mediaId;
     }

    /**
     * Sets the size of the file to be uploaded in bytes.
     * @param value the size of the file to be uploaded in bytes.
     */
     public void setFileSize(int value) {
          this.fileSize = value;
     }

    /**
     * Gets the size of the file to be uploaded in bytes.
     * @return the size of the file to be uploaded in bytes.
     */
     @JsonProperty("fileSize")
     public int getFileSize() {
          return this.fileSize;
     }

    /**
     * Sets the amount of the file already uploaded.
     * @param value the amount of the file already uploaded.
     */
     public void setUploadedAmount(int value) {
          this.uploadedAmount = value;
     }

    /**
     * Gets the amount of the file already uploaded.
     * @return the amount of the file already uploaded.
     */
     @JsonProperty("uploadedAmount")
     public int getUploadedAmount() {
          return this.uploadedAmount;
     }

    /**
     * Sets the current status of a file upload.
     * @param value the current status of a file upload.
     */
     public void setStatus(String value) {
          this.status = value;
     }

    /**
     * Gets the current status of a file upload.
     * @return the current status of a file upload.
     */
     @JsonProperty("status")
     public String getStatus() {
          return this.status;
     }

    /**
     * Sets whether or not the upload and associated file processing is complete.
     * @param value whether or not the upload and associated file processing is complete.
     */
     public void setComplete(boolean value) {
          this.complete = value;
     }

    /**
     * Gets whether or not the upload and associated file processing is complete.
     * @return whether or not the upload and associated file processing is complete.
     */
     @JsonProperty("complete")
     public boolean isComplete() {
          return this.complete;
     }

    /**
     * Sets whether or not the file is processing.
     * @param value whether or not the file is processing. This normally applied to video
     * files undergoing format transcoding.
     */
     public void setProcessing(boolean value) {
          this.processing = value;
     }

    /**
     * Gets whether or not the file is processing.
     * @return whether or not the file is processing. This normally applied to video files
     * undergoing format transcoding.
     */
     @JsonProperty("processing")
     public boolean isProcessing() {
          return this.processing;
     }

    /**
     * Sets current upload progress rounded to the nearest integer.
     * @param value current upload progress rounded to the nearest integer.
     */
     public void setPercentage(int value) {
          this.percentage = value;
     }

    /**
     * Gets current upload progress rounded to the nearest integer.
     * @return current upload progress rounded to the nearest integer.
     */
     @JsonProperty("percentage")
     public int getPercentage() {
          return this.percentage;
     }

    /**
     * Sets the url of a thumbnail for the file, if available.
     * @param value the url of a thumbnail for the file, if available.
     */
     public void setThumbnailLocation(String value) {
          this.thumbnailLocation = value;
     }

    /**
     * Gets the url of a thumbnail for the file, if available.
     * @return the url of a thumbnail for the file, if available.
     */
     @JsonProperty("thumbnailLocation")
     public String getThumbnailLocation() {
          return this.thumbnailLocation;
     }

}
