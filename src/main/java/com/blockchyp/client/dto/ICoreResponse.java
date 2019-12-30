package com.blockchyp.client.dto;

/**
 * 
 */

public interface ICoreResponse {

     String getTransactionID();

     String getBatchID();

     String getTransactionRef();

     String getTransactionType();

     String getTimestamp();

     String getTickBlock();

     boolean isTest();

     String getSig();


}

