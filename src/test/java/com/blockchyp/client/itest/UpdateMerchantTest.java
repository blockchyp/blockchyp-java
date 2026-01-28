/**
 * Copyright 2019-2026 BlockChyp, Inc. All rights reserved. Use of this code is governed
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
import com.blockchyp.client.dto.MerchantProfile;
import com.blockchyp.client.dto.MerchantProfileResponse;
import com.blockchyp.client.dto.Address;

public class UpdateMerchantTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testEndpoint() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient("partner");

        
        // Set request parameters
        MerchantProfile request = new MerchantProfile();
        request.setTest(true);
        request.setDbaName("Test Merchant");
        request.setCompanyName("Test Merchant");

        Address billingAddress = new Address();
        billingAddress.setAddress1("1060 West Addison");
        billingAddress.setCity("Chicago");
        billingAddress.setStateOrProvince("IL");
        billingAddress.setPostalCode("60613");
        request.setBillingAddress(billingAddress);

        Exception ex = null;
        try {
            MerchantProfileResponse response = client.updateMerchant(request);
            // Response assertions
            Assert.assertTrue(response.isSuccess());
        } catch (Exception e) {
            ex = e;
        }

    Assert.assertNull(ex);
    }

}
