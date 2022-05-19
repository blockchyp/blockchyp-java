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
 * Models a slide within a slide show.
 */
public class Slide {

     private String mediaId;

     private int ordinal;

     private String thumbnailUrl;

    /**
     * Sets the id for the media asset to be used for this slide.
     * @param value the id for the media asset to be used for this slide. Must be an image.
     */
     public void setMediaId(String value) {
          this.mediaId = value;
     }

    /**
     * Gets the id for the media asset to be used for this slide.
     * @return the id for the media asset to be used for this slide. Must be an image.
     */
     @JsonProperty("mediaId")
     public String getMediaId() {
          return this.mediaId;
     }

    /**
     * Sets position of the slide within the slide show.
     * @param value position of the slide within the slide show.
     */
     public void setOrdinal(int value) {
          this.ordinal = value;
     }

    /**
     * Gets position of the slide within the slide show.
     * @return position of the slide within the slide show.
     */
     @JsonProperty("ordinal")
     public int getOrdinal() {
          return this.ordinal;
     }

    /**
     * Sets the fully qualified thumbnail url for the slide.
     * @param value the fully qualified thumbnail url for the slide.
     */
     public void setThumbnailUrl(String value) {
          this.thumbnailUrl = value;
     }

    /**
     * Gets the fully qualified thumbnail url for the slide.
     * @return the fully qualified thumbnail url for the slide.
     */
     @JsonProperty("thumbnailUrl")
     public String getThumbnailUrl() {
          return this.thumbnailUrl;
     }

}
