package com.blockchyp.client.dto;

import com.blockchyp.client.dto.CardType;

/**
 * 
 */

public interface IPaymentMethod {

     String getToken();

     String getTrack1();

     String getTrack2();

     String getPan();

     String getRoutingNumber();

     String getCardholderName();

     String getExpMonth();

     String getExpYear();

     String getCvv();

     String getAddress();

     String getPostalCode();

     boolean isManualEntry();

     String getKsn();

     String getPinBlock();

     CardType getCardType();

     String getPaymentType();


}

