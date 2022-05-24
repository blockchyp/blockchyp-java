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
 * Models a request to retrieve or manipulate terminal slide shows.
 */
public class SlideShowRequest {

     private String slideShowId;

     private int timeout;

    /**
     * Sets id used to track a slide show.
     * @param value id used to track a slide show.
     */
     public void setSlideShowId(String value) {
          this.slideShowId = value;
     }

    /**
     * Gets id used to track a slide show.
     * @return id used to track a slide show.
     */
     @JsonProperty("slideShowId")
     public String getSlideShowId() {
          return this.slideShowId;
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
