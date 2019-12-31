package com.blockchyp.client.dto;


/**
 * 
 */

public interface IPaymentMethodResponse {

     String getToken();

     String getEntryMethod();

     String getPaymentType();

     String getMaskedPan();

     String getPublicKey();

     boolean isScopeAlert();

     String getCardHolder();

     ReceiptSuggestions getReceiptSuggestions();


}

