/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */

package com.blockchyp.client.dto;


/**
 * Core request fields for a transaction.
 */

public interface ICoreRequest {

     String getTransactionRef();

     String getOrderRef();

     String getDestinationAccount();

     boolean isTest();

     int getTimeout();


}

