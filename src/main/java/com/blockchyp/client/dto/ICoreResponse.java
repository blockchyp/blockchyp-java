/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */

package com.blockchyp.client.dto;


/**
 * Core response fields for a transaction.
 */

public interface ICoreResponse {

     String getTransactionId();

     String getBatchId();

     String getTransactionRef();

     String getTransactionType();

     String getTimestamp();

     String getTickBlock();

     boolean isTest();

     String getSig();


}

