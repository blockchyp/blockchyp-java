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
import com.blockchyp.client.dto.GiftActivateRequest;
import com.blockchyp.client.dto.GiftActivateResponse;

public class SimpleGiftActivateTest {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {

         BlockChypClient client = IntegrationTestConfiguration.getTestClient();



         // setup request object
         GiftActivateRequest request = new GiftActivateRequest();
         request.setTest(true);
         request.setTerminalName("Test Terminal");
         request.setAmount("50.00");

         GiftActivateResponse response = client.giftActivate(request);


         // response assertions
         Assert.assertTrue(response.isApproved());
         Assert.assertNotNull(response.getPublicKey());
         Assert.assertTrue(response.getPublicKey().trim().length() > 0);

    }


}
