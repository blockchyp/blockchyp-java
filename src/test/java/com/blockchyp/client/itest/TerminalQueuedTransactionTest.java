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

public class TerminalQueuedTransactionTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testTransaction() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        processTestDelay(client, "TerminalQueuedTransactionTest", IntegrationTestConfiguration.getDefaultTerminalName());

        // Set request parameters
        AuthorizationRequest request = new AuthorizationRequest();
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        request.setTransactionRef(getUUID());
        request.setDescription("1060 West Addison");
        request.setAmount("25.15");
        request.setTest(true);
        request.setQueue(true);

        AuthorizationResponse response = client.charge(request);

        // Response assertions
        Assert.assertTrue(response.isSuccess());
        Assert.assertFalse(response.isApproved());
        Assert.assertEquals("Queued", response.getResponseDescription());

    }

}
