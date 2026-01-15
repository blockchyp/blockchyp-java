/**
 * Copyright 2019-2026 BlockChyp, Inc. All rights reserved. Use of this code is governed
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
import com.blockchyp.client.dto.CaptureRequest;
import com.blockchyp.client.dto.CaptureResponse;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;

public class SimpleCaptureTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testEndpoint() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient("");

        
        // Set request parameters
        AuthorizationRequest setupRequest = new AuthorizationRequest();
        setupRequest.setPan("4111111111111111");
        setupRequest.setExpMonth("12");
        setupRequest.setExpYear("2025");
        setupRequest.setAmount("42.45");
        setupRequest.setTest(true);
        setupRequest.setBypassDupeFilter(true);

        AuthorizationResponse setupResponse = client.preauth(setupRequest);


        // Set request parameters
        CaptureRequest request = new CaptureRequest();
        request.setTransactionId(setupResponse.getTransactionId());
        request.setTest(true);

        Exception ex = null;
        try {
            CaptureResponse response = client.capture(request);
            // Response assertions
            Assert.assertTrue(response.isSuccess());
            Assert.assertTrue(response.isApproved());
        } catch (Exception e) {
            ex = e;
        }

    Assert.assertNull(ex);
    }

}
