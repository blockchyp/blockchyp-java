/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Models information needed to process a file upload.
 */
public class UploadMetadata {

     private String uploadId;

     private int64 fileSize;

     private String fileName;

     private int timeout;

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
     public void setFileSize(int64 value) {
          this.fileSize = value;
     }

    /**
     * Gets the size of the file to be uploaded in bytes.
     * @return the size of the file to be uploaded in bytes.
     */
     @JsonProperty("fileSize")
     public int64 getFileSize() {
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

    /**
     * Sets an optional upload timeout override.
     * @param value an optional upload timeout override.
     */
     public void setTimeout(int value) {
          this.timeout = value;
     }

    /**
     * Gets an optional upload timeout override.
     * @return an optional upload timeout override.
     */
     @JsonProperty("timeout")
     public int getTimeout() {
          return this.timeout;
     }

}
