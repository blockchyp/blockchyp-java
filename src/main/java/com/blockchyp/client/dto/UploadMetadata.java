/**
 * Copyright 2019-2025 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Models information needed to process a file upload.
 */
public class UploadMetadata implements ITimeoutRequest {

     private int timeout;

     private boolean test;

     private String uploadId;

     private int fileSize;

     private String fileName;

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
     * Sets optional id used to track status and progress of an upload while in progress.
     * @param value optional id used to track status and progress of an upload while in
     * progress.
     */
     public void setUploadId(String value) {
          this.uploadId = value;
     }

    /**
     * Gets optional id used to track status and progress of an upload while in progress.
     * @return optional id used to track status and progress of an upload while in
     * progress.
     */
     @JsonProperty("uploadId")
     public String getUploadId() {
          return this.uploadId;
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
     * Sets the name of file to be uploaded.
     * @param value the name of file to be uploaded.
     */
     public void setFileName(String value) {
          this.fileName = value;
     }

    /**
     * Gets the name of file to be uploaded.
     * @return the name of file to be uploaded.
     */
     @JsonProperty("fileName")
     public String getFileName() {
          return this.fileName;
     }

}
