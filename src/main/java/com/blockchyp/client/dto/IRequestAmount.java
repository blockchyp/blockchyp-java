/**
 * Copyright 2019-2023 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.dto;


/**
 * Request details about tender amounts.
 */

public interface IRequestAmount {

     String getCurrencyCode();

     String getAmount();

     boolean isTaxExempt();

     boolean isSurcharge();

     boolean isCashDiscount();


}

