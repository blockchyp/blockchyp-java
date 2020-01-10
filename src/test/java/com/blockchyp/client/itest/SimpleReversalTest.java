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
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;

public class SimpleReversalTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        processTestDelay(client, "SimpleReversalTest");

         // setup request object
         AuthorizationRequest setupRequest = new AuthorizationRequest();
         setupRequest.setPan("4111111111111111");
         setupRequest.setAmount("25.55");
         setupRequest.setTest(true);
         setupRequest.setTransactionRef(getUUID());
         AuthorizationResponse setupResponse = client.charge(setupRequest);

        // setup request object
        AuthorizationRequest request = new AuthorizationRequest();
        request.setTransactionRef(setupResponse.getTransactionRef());
        request.setTest(true);

        AuthorizationResponse response = client.reverse(request);

        // response assertions
        Assert.assertTrue(response.isApproved());

    }


}
