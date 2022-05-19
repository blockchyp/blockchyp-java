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
 * Models a request to retrieve or manipulate media assets.
 */
public class MediaRequest {

     private String mediaId;

     private int timeout;

    /**
     * Sets id used to track a media asset.
     * @param value id used to track a media asset.
     */
     public void setMediaId(String value) {
          this.mediaId = value;
     }

    /**
     * Gets id used to track a media asset.
     * @return id used to track a media asset.
     */
     @JsonProperty("mediaId")
     public String getMediaId() {
          return this.mediaId;
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
