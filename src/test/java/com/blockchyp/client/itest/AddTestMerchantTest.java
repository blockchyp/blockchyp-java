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
import com.blockchyp.client.dto.AddTestMerchantRequest;
import com.blockchyp.client.dto.MerchantProfileResponse;

public class AddTestMerchantTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testTransaction() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        processTestDelay(client, "AddTestMerchantTest", IntegrationTestConfiguration.getDefaultTerminalName());

        // Set request parameters
        AddTestMerchantRequest request = new AddTestMerchantRequest();
        request.setDbaName("Test Merchant");
        request.setCompanyName("Test Merchant");

        MerchantProfileResponse response = client.addTestMerchant(request);

        // Response assertions
        Assert.assertTrue(response.isSuccess());

    }

}