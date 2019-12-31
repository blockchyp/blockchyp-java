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
import com.blockchyp.client.dto.RefundRequest;
import com.blockchyp.client.dto.AuthorizationResponse;
import com.blockchyp.client.dto.AuthorizationRequest;

public class SimpleRefundTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {

         BlockChypClient client = IntegrationTestConfiguration.getTestClient();

         processTestDelay(client, "SimpleRefundTest");


	     // setup request object
         AuthorizationRequest setupRequest = new AuthorizationRequest();

         setupRequest.setPan("4111111111111111");

         setupRequest.setAmount("25.55");

         setupRequest.setTest(true);

         setupRequest.setTransactionRef(getUUID());

         AuthorizationResponse setupResponse = client.charge(setupRequest);



         // setup request object
         RefundRequest request = new RefundRequest();
         request.setTransactionId(setupResponse.getTransactionId());
         request.setTest(true);

         AuthorizationResponse response = client.refund(request);


         // response assertions
         Assert.assertTrue(response.isApproved());

    }


}
