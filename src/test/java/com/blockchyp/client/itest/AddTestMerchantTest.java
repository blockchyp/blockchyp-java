/**
 * Copyright 2019-2025 BlockChyp, Inc. All rights reserved. Use of this code is governed
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
import com.blockchyp.client.dto.AddTestMerchantRequest;
import com.blockchyp.client.dto.MerchantProfileResponse;

public class AddTestMerchantTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testEndpoint() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient("partner");

        
        // Set request parameters
        AddTestMerchantRequest request = new AddTestMerchantRequest();
        request.setDbaName("Test Merchant");
        request.setCompanyName("Test Merchant");

        Exception ex = null;
        try {
            MerchantProfileResponse response = client.addTestMerchant(request);
            // Response assertions
            Assert.assertTrue(response.isSuccess());
            Assert.assertEquals("Test Merchant", response.getDbaName());
            Assert.assertEquals("Test Merchant", response.getCompanyName());
            Assert.assertTrue(response.isVisa());
        } catch (Exception e) {
            ex = e;
        }

    Assert.assertNull(ex);
    }

}
