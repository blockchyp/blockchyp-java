package com.blockchyp.client.dto;

import com.blockchyp.client.CardType;
/**
 * 
 */

public interface IPaymentMethod {
  
     String getToken();
  
     String getTrack1();
  
     String getTrack2();
  
     String getPAN();
  
     String getRoutingNumber();
  
     String getCardholderName();
  
     String getExpMonth();
  
     String getExpYear();
  
     String getCVV();
  
     String getAddress();
  
     String getPostalCode();
  
     boolean isManualEntry();
  
     String getKSN();
  
     String getPINBlock();
  
     CardType getCardType();
  
     String getPaymentType();
  

}