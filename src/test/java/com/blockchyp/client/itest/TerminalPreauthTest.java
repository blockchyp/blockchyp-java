/**
 * Copyright 2019-2022 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
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
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;

public class TerminalPreauthTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testTransaction() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        processTestDelay(client, "TerminalPreauthTest", IntegrationTestConfiguration.getDefaultTerminalName());

        // Set request parameters
        AuthorizationRequest request = new AuthorizationRequest();
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        request.setAmount("15.15");
        request.setTest(true);

        AuthorizationResponse response = client.preauth(request);

        // Response assertions
        Assert.assertTrue(response.isSuccess());
        Assert.assertTrue(response.isApproved());
        Assert.assertTrue(response.isTest());
        Assert.assertTrue(response.getAuthCode().length() == 6);
        Assert.assertNotNull(response.getTransactionId());
        Assert.assertTrue(response.getTransactionId().trim().length() > 0);
        Assert.assertNotNull(response.getTimestamp());
        Assert.assertTrue(response.getTimestamp().trim().length() > 0);
        Assert.assertNotNull(response.getTickBlock());
        Assert.assertTrue(response.getTickBlock().trim().length() > 0);
        Assert.assertEquals("approved", response.getResponseDescription());
        Assert.assertNotNull(response.getPaymentType());
        Assert.assertTrue(response.getPaymentType().trim().length() > 0);
        Assert.assertNotNull(response.getMaskedPan());
        Assert.assertTrue(response.getMaskedPan().trim().length() > 0);
        Assert.assertNotNull(response.getEntryMethod());
        Assert.assertTrue(response.getEntryMethod().trim().length() > 0);
        Assert.assertEquals("15.15", response.getAuthorizedAmount());

    }

}
