/**
 * Copyright 2019-2022 BlockChyp, Inc. All rights reserved. Use of this code is governed
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
 * Models a media library response.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class SlideShow implements IAbstractAcknowledgement {

     private boolean success;

     private String error;

     private String responseDescription;

     private String id;

     private String name;

     private int delay;

     private Collection<Slide> slides;

     private int timeout;

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
     * Sets the primary id for the slide show.
     * @param value the primary id for the slide show.
     */
     public void setId(String value) {
          this.id = value;
     }

    /**
     * Gets the primary id for the slide show.
     * @return the primary id for the slide show.
     */
     @JsonProperty("id")
     public String getId() {
          return this.id;
     }

    /**
     * Sets the name of the slide show.
     * @param value the name of the slide show.
     */
     public void setName(String value) {
          this.name = value;
     }

    /**
     * Gets the name of the slide show.
     * @return the name of the slide show.
     */
     @JsonProperty("name")
     public String getName() {
          return this.name;
     }

    /**
     * Sets time between slides in seconds.
     * @param value time between slides in seconds.
     */
     public void setDelay(int value) {
          this.delay = value;
     }

    /**
     * Gets time between slides in seconds.
     * @return time between slides in seconds.
     */
     @JsonProperty("delay")
     public int getDelay() {
          return this.delay;
     }

    /**
     * Sets enumerates all slides in the display sequence.
     * @param value enumerates all slides in the display sequence.
     */
     public void setSlides(Collection<Slide> value) {
          this.slides = value;
     }

    /**
     * Gets enumerates all slides in the display sequence.
     * @return enumerates all slides in the display sequence.
     */
     @JsonProperty("slides")
     public Collection<Slide> getSlides() {
          return this.slides;
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

    /**
     * Adds a enumerates all slides in the display sequence.
     * @param value enumerates all slides in the display sequence.
     */
     public void addSlide(Slide value) {
          if (this.slides == null) {
               this.slides = new ArrayList();
          }
          this.slides.add(value);
     }

}
