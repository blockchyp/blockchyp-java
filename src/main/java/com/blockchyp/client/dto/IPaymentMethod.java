/**
 * Copyright 2019-2024 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;

import com.blockchyp.client.dto.CardType;

/**
 * Request details about a payment method.
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

