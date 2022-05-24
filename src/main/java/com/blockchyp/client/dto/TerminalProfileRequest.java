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
 * 
 */
public class TerminalProfileRequest {

     private int timeout;

    /**
     * Sets the optional timeout override for a terminal profile request.
     * @param value the optional timeout override for a terminal profile request.
     */
     public void setTimeout(int value) {
          this.timeout = value;
     }

    /**
     * Gets the optional timeout override for a terminal profile request.
     * @return the optional timeout override for a terminal profile request.
     */
     @JsonProperty("timeout")
     public int getTimeout() {
          return this.timeout;
     }

}
