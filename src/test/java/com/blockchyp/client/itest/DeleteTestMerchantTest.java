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
import com.blockchyp.client.dto.MerchantProfileRequest;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.AddTestMerchantRequest;
import com.blockchyp.client.dto.MerchantProfileResponse;

public class DeleteTestMerchantTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testEndpoint() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient("partner");

        
        // Set request parameters
        AddTestMerchantRequest setupRequest = new AddTestMerchantRequest();
        setupRequest.setDbaName("Test Merchant");
        setupRequest.setCompanyName("Test Merchant");

        MerchantProfileResponse setupResponse = client.addTestMerchant(setupRequest);


        // Set request parameters
        MerchantProfileRequest request = new MerchantProfileRequest();
        request.setMerchantId(setupResponse.getMerchantId());

        Exception ex = null;
        try {
            Acknowledgement response = client.deleteTestMerchant(request);
            // Response assertions
            Assert.assertTrue(response.isSuccess());
        } catch (Exception e) {
            ex = e;
        }

    Assert.assertNull(ex);
    }

}
