package com.blockchyp.client.dto;


/**
 * 
 */

public interface IPaymentAmounts {

     boolean isPartialAuth();

     boolean isAltCurrency();

     boolean isFsaAuth();

     String getCurrencyCode();

     String getRequestedAmount();

     String getAuthorizedAmount();

     String getRemainingBalance();

     String getTipAmount();

     String getTaxAmount();

     String getRequestedCashBackAmount();

     String getAuthorizedCashBackAmount();


}

