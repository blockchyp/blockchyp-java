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
 * Used to request the status of a file upload.
 */
public class UploadStatusRequest implements ITimeoutRequest {

     private int timeout;

     private boolean test;

     private String uploadId;

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

}
