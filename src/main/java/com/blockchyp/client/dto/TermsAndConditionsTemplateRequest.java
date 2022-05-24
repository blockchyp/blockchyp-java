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
 * Models a request to retrieve or manipulate terms and conditions data.
 */
public class TermsAndConditionsTemplateRequest {

     private String templateId;

     private int timeout;

    /**
     * Sets id of a single template.
     * @param value id of a single template.
     */
     public void setTemplateId(String value) {
          this.templateId = value;
     }

    /**
     * Gets id of a single template.
     * @return id of a single template.
     */
     @JsonProperty("templateId")
     public String getTemplateId() {
          return this.templateId;
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
