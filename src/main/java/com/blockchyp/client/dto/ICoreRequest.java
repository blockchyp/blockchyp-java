package com.blockchyp.client.dto;


/**
 * 
 */

public interface ICoreRequest {

     String getTransactionRef();

     String getOrderRef();

     String getDestinationAccount();

     boolean isTest();

     int getTimeout();


}

