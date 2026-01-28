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
import com.blockchyp.client.dto.UpdateTokenRequest;
import com.blockchyp.client.dto.UpdateTokenResponse;
import com.blockchyp.client.dto.EnrollRequest;
import com.blockchyp.client.dto.EnrollResponse;
import com.blockchyp.client.dto.Customer;

public class UpdateTokenTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testEndpoint() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient("");

        
        // Set request parameters
        EnrollRequest setupRequest = new EnrollRequest();
        setupRequest.setPan("4111111111111111");
        setupRequest.setTest(true);

        Customer customer = new Customer();
        customer.setCustomerRef("TESTCUSTOMER");
        customer.setFirstName("Test");
        customer.setLastName("Customer");
        setupRequest.setCustomer(customer);

        EnrollResponse setupResponse = client.enroll(setupRequest);


        // Set request parameters
        UpdateTokenRequest request = new UpdateTokenRequest();
        request.setToken(setupResponse.getToken());
        request.setExpiryMonth("12");
        request.setExpiryYear("2040");

        Exception ex = null;
        try {
            UpdateTokenResponse response = client.updateToken(request);
            // Response assertions
            Assert.assertTrue(response.isSuccess());
        } catch (Exception e) {
            ex = e;
        }

    Assert.assertNull(ex);
    }

}
