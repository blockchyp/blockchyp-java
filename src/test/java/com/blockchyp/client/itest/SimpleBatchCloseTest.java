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
import com.blockchyp.client.dto.CloseBatchRequest;
import com.blockchyp.client.dto.CloseBatchResponse;

public class SimpleBatchCloseTest {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {

         BlockChypClient client = IntegrationTestConfiguration.getTestClient();



         // setup request object
         CloseBatchRequest request = new CloseBatchRequest();
         request.setTest(true);

         CloseBatchResponse response = client.closeBatch(request);


         // response assertions
         Assert.assertTrue(response.isSuccess());
         Assert.assertNotNull(response.getCapturedTotal());
         Assert.assertTrue(response.getCapturedTotal().trim().length() > 0);
         Assert.assertNotNull(response.getOpenPreauths());
         Assert.assertTrue(response.getOpenPreauths().trim().length() > 0);

    }


}
