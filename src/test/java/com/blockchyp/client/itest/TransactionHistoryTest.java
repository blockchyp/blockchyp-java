/**
 * Copyright 2019 BlockChyp, Inc. All rights reserved. Use of this code is governed by a
 * license that can be found in the LICENSE file.
 *
 * This file was generated automatically. Changes to this file will be lost every time the
 * code is regenerated.
 */

package com.blockchyp.client.itest;

import java.util.ArrayList;
import java.util.Collection;


import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.IntegrationTest;
import com.blockchyp.client.IntegrationTestConfiguration;
import com.blockchyp.client.dto.TransactionHistoryRequest;
import com.blockchyp.client.dto.TransactionHistoryResponse;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;

public class TransactionHistoryTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testTransaction() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        processTestDelay(client, "TransactionHistoryTest");

        // Set request parameters
        AuthorizationRequest setupRequest = new AuthorizationRequest();
        setupRequest.setPan("4111111111111111");
        setupRequest.setExpMonth("12");
        setupRequest.setExpYear("2025");
        setupRequest.setAmount("25.55");
        setupRequest.setTest(true);
        setupRequest.setTransactionRef(getUUID());

         AuthorizationResponse setupResponse = client.charge(setupRequest);

        // Set request parameters
        TransactionHistoryRequest request = new TransactionHistoryRequest();
        request.setMaxResults(10);

        TransactionHistoryResponse response = client.transactionHistory(request);

        // Response assertions
        Assert.assertTrue(response.isSuccess());

    }

}
