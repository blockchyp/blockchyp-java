/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */

package com.blockchyp.client.dto;

import com.blockchyp.client.dto.AvsResponse;

/**
 * Response details about a payment method.
 */

public interface IPaymentMethodResponse {

     String getToken();

     String getEntryMethod();

     String getPaymentType();

     String getMaskedPan();

     String getPublicKey();

     boolean isScopeAlert();

     String getCardHolder();

     String getExpMonth();

     String getExpYear();

     AvsResponse getAvsResponse();

     ReceiptSuggestions getReceiptSuggestions();

     Customer getCustomer();


}

