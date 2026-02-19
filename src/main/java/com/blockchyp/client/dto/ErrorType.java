/**
 * Copyright 2019-2026 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Models an error response.
 */
public class ErrorType {

     private int status;

     private String title;

     private String detail;

    /**
     * Sets the HTTP status code.
     * @param value the HTTP status code.
     */
     public void setStatus(int value) {
          this.status = value;
     }

    /**
     * Gets the HTTP status code.
     * @return the HTTP status code.
     */
     @JsonProperty("status")
     public int getStatus() {
          return this.status;
     }

    /**
     * Sets the error title.
     * @param value the error title.
     */
     public void setTitle(String value) {
          this.title = value;
     }

    /**
     * Gets the error title.
     * @return the error title.
     */
     @JsonProperty("title")
     public String getTitle() {
          return this.title;
     }

    /**
     * Sets the detailed error message.
     * @param value the detailed error message.
     */
     public void setDetail(String value) {
          this.detail = value;
     }

    /**
     * Gets the detailed error message.
     * @return the detailed error message.
     */
     @JsonProperty("detail")
     public String getDetail() {
          return this.detail;
     }

}
