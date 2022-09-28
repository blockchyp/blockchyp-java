package com.blockchyp.client.dto;

/**
 * contains a basic api acknowledgement.
 */

public interface IAcknowledgement {

     boolean isSuccess();

     String getError();

     String getResponseDescription();


}

