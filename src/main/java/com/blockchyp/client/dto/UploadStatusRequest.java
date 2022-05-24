/**
 * Copyright 2019-2022 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Used to request the status of a file upload.
 */
public class UploadStatusRequest {

     private String uploadId;

     private int timeout;

    /**
     * Sets id used to track status and progress of an upload while in progress.
     * @param value id used to track status and progress of an upload while in progress.
     */
     public void setUploadId(String value) {
          this.uploadId = value;
     }

    /**
     * Gets id used to track status and progress of an upload while in progress.
     * @return id used to track status and progress of an upload while in progress.
     */
     @JsonProperty("uploadId")
     public String getUploadId() {
          return this.uploadId;
     }

    /**
     * Sets an optional timeout override.
     * @param value an optional timeout override.
     */
     public void setTimeout(int value) {
          this.timeout = value;
     }

    /**
     * Gets an optional timeout override.
     * @return an optional timeout override.
     */
     @JsonProperty("timeout")
     public int getTimeout() {
          return this.timeout;
     }

}
