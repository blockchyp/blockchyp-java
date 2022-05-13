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
import com.blockchyp.client.dto.MerchantProfile;
import com.blockchyp.client.dto.MerchantProfileResponse;
import com.blockchyp.client.dto.Address;

public class UpdateMerchantTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testTransaction() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        processTestDelay(client, "UpdateMerchantTest", IntegrationTestConfiguration.getDefaultTerminalName());

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

        MerchantProfileResponse response = client.updateMerchant(request);

        // Response assertions
        Assert.assertTrue(response.isSuccess());

    }

}
