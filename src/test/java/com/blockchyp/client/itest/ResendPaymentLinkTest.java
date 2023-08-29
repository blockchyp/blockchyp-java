/**
 * Copyright 2019-2023 BlockChyp, Inc. All rights reserved. Use of this code is governed
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
import com.blockchyp.client.dto.ResendPaymentLinkRequest;
import com.blockchyp.client.dto.ResendPaymentLinkResponse;
import com.blockchyp.client.dto.PaymentLinkRequest;
import com.blockchyp.client.dto.PaymentLinkResponse;
import com.blockchyp.client.dto.TransactionDisplayTransaction;
import com.blockchyp.client.dto.TransactionDisplayItem;
import com.blockchyp.client.dto.Customer;

public class ResendPaymentLinkTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testEndpoint() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient("");

        
        // Set request parameters
        PaymentLinkRequest setupRequest = new PaymentLinkRequest();
        setupRequest.setAmount("199.99");
        setupRequest.setDescription("Widget");
        setupRequest.setSubject("Widget invoice");

        TransactionDisplayTransaction transaction = new TransactionDisplayTransaction();
        transaction.setSubtotal("195.00");
        transaction.setTax("4.99");
        transaction.setTotal("199.99");

        Collection items = new ArrayList();
        TransactionDisplayItem items0 = new TransactionDisplayItem();
        items0.setDescription("Widget");
        items0.setPrice("195.00");
        items0.setQuantity(1);
        items.add(items0);
        transaction.setItems(items);
        setupRequest.setTransaction(transaction);
        setupRequest.setAutoSend(true);

        Customer customer = new Customer();
        customer.setCustomerRef("Customer reference string");
        customer.setFirstName("FirstName");
        customer.setLastName("LastName");
        customer.setCompanyName("Company Name");
        customer.setEmailAddress("notifications@blockchypteam.m8r.co");
        customer.setSmsNumber("(123) 123-1231");
        setupRequest.setCustomer(customer);

        PaymentLinkResponse setupResponse = client.sendPaymentLink(setupRequest);


        // Set request parameters
        ResendPaymentLinkRequest request = new ResendPaymentLinkRequest();
        request.setLinkCode(setupResponse.getLinkCode());

        Exception ex = null;
        try {
            ResendPaymentLinkResponse response = client.resendPaymentLink(request);
            // Response assertions
            Assert.assertTrue(response.isSuccess());
        } catch (Exception e) {
            ex = e;
        }

    Assert.assertNull(ex);
    }

}
