package com.blockchyp.client.dto;


/**
 * 
 */

public interface ICoreResponse {

     String getTransactionId();

     String getBatchId();

     String getTransactionRef();

     String getTransactionType();

     String getTimestamp();

     String getTickBlock();

     boolean isTest();

     String getSig();


}

