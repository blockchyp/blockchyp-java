/**
 * Copyright 2019-2023 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;


/**
 * Response details about tender amounts.
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

