/**
 * Copyright 2019-2025 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.blockchyp.client.dto.AvsResponse;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Response details about a payment method.
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public interface IPaymentMethodResponse {

     String getToken();

     String getEntryMethod();

     String getPaymentType();

     String getNetwork();

     String getLogo();

     String getMaskedPan();

     String getPublicKey();

     boolean isScopeAlert();

     String getCardHolder();

     String getExpMonth();

     String getExpYear();

     AvsResponse getAvsResponse();

     String getCvvResponse();

     ReceiptSuggestions getReceiptSuggestions();

     Customer getCustomer();

     Collection getCustomers();


}

