/**
 * Copyright 2019-2023 BlockChyp, Inc. All rights reserved. Use of this code is governed
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
import com.blockchyp.client.dto.RefundRequest;
import com.blockchyp.client.dto.AuthorizationResponse;
import com.blockchyp.client.dto.AuthorizationRequest;

public class PartialRefundTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testEndpoint() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient("");


        processTestDelay(IntegrationTestConfiguration.getTestClient(), "PartialRefundTest", IntegrationTestConfiguration.getDefaultTerminalName());
        
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
        RefundRequest request = new RefundRequest();
        request.setTransactionId(setupResponse.getTransactionId());
        request.setAmount("5.00");
        request.setTest(true);

        Exception ex = null;
        try {
            AuthorizationResponse response = client.refund(request);
            // Response assertions
            Assert.assertTrue(response.isSuccess());
            Assert.assertTrue(response.isApproved());
        } catch (Exception e) {
            ex = e;
        }

    Assert.assertNull(ex);
    }

}
