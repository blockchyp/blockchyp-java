package com.blockchyp.client.dto;

/**
 * 
 */

public interface IPaymentMethodResponse {

     String getToken();

     String getEntryMethod();

     String getPaymentType();

     String getMaskedPAN();

     String getPublicKey();

     boolean isScopeAlert();

     String getCardHolder();

     ReceiptSuggestions getReceiptSuggestions();


}

