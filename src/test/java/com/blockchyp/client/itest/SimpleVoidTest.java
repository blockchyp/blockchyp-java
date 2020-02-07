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
import com.blockchyp.client.dto.VoidRequest;
import com.blockchyp.client.dto.VoidResponse;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;

public class SimpleVoidTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        processTestDelay(client, "SimpleVoidTest");

         // setup request object
         AuthorizationRequest setupRequest = new AuthorizationRequest();
         setupRequest.setPan("4111111111111111");
         setupRequest.setAmount("25.55");
         setupRequest.setTest(true);
         setupRequest.setTransactionRef(getUUID());
         AuthorizationResponse setupResponse = client.charge(setupRequest);

        // setup request object
        VoidRequest request = new VoidRequest();
        request.setTransactionId(setupResponse.getTransactionId());
        request.setTest(true);

        VoidResponse response = client.voidTx(request);

        // response assertions
        Assert.assertTrue(response.isSuccess());
        Assert.assertTrue(response.isApproved());

    }


}
