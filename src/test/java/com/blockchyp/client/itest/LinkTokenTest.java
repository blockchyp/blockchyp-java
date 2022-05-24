/**
 * Copyright 2019-2022 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
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
import com.blockchyp.client.dto.LinkTokenRequest;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.EnrollRequest;
import com.blockchyp.client.dto.EnrollResponse;
import com.blockchyp.client.dto.Customer;

public class LinkTokenTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testTransaction() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        processTestDelay(client, "LinkTokenTest", IntegrationTestConfiguration.getDefaultTerminalName());

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
        LinkTokenRequest request = new LinkTokenRequest();
        request.setToken(setupResponse.getToken());
        request.setCustomerId(setupResponse.getCustomer().getId());

        Acknowledgement response = client.linkToken(request);

        // Response assertions
        Assert.assertTrue(response.isSuccess());

    }

}
