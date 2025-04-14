/**
 * Copyright 2019-2025 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.itest;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.IntegrationTest;
import com.blockchyp.client.IntegrationTestConfiguration;
import com.blockchyp.client.dto.DeleteQueuedTransactionRequest;
import com.blockchyp.client.dto.DeleteQueuedTransactionResponse;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;

public class DeleteQueuedTransactionTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testEndpoint() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient("");


        processTestDelay(IntegrationTestConfiguration.getTestClient(), "DeleteQueuedTransactionTest", IntegrationTestConfiguration.getDefaultTerminalName());
        
        // Set request parameters
        AuthorizationRequest setupRequest = new AuthorizationRequest();
        setupRequest.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        setupRequest.setTransactionRef(getUUID());
        setupRequest.setDescription("1060 West Addison");
        setupRequest.setAmount("25.15");
        setupRequest.setTest(true);
        setupRequest.setQueue(true);

        AuthorizationResponse setupResponse = client.charge(setupRequest);


        // Set request parameters
        DeleteQueuedTransactionRequest request = new DeleteQueuedTransactionRequest();
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        request.setTransactionRef("*");

        Exception ex = null;
        try {
            DeleteQueuedTransactionResponse response = client.deleteQueuedTransaction(request);
            // Response assertions
            Assert.assertTrue(response.isSuccess());
        } catch (Exception e) {
            ex = e;
        }

    Assert.assertNull(ex);
    }

}
