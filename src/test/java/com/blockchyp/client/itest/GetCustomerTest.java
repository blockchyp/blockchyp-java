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
import com.blockchyp.client.dto.CustomerRequest;
import com.blockchyp.client.dto.CustomerResponse;
import com.blockchyp.client.dto.UpdateCustomerRequest;
import com.blockchyp.client.dto.Customer;

public class GetCustomerTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testTransaction() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        processTestDelay(client, "GetCustomerTest");

        // Set request parameters
        UpdateCustomerRequest setupRequest = new UpdateCustomerRequest();

        Customer customer = new Customer();
        customer.setFirstName("Test");
        customer.setLastName("Customer");
        customer.setCompanyName("Test Company");
        customer.setEmailAddress("support@blockchyp.com");
        customer.setSmsNumber("(123) 123-1234");
        setupRequest.setCustomer(customer);

         CustomerResponse setupResponse = client.updateCustomer(setupRequest);

        // Set request parameters
        CustomerRequest request = new CustomerRequest();
        request.setCustomerId(setupResponse.getCustomer().getId());

        CustomerResponse response = client.customer(request);

        // Response assertions
        Assert.assertTrue(response.isSuccess());

    }

}
