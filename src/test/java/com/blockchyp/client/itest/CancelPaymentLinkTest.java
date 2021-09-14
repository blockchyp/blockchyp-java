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
import com.blockchyp.client.dto.CancelPaymentLinkRequest;
import com.blockchyp.client.dto.CancelPaymentLinkResponse;
import com.blockchyp.client.dto.PaymentLinkRequest;
import com.blockchyp.client.dto.PaymentLinkResponse;
import com.blockchyp.client.dto.TransactionDisplayTransaction;
import com.blockchyp.client.dto.TransactionDisplayItem;
import com.blockchyp.client.dto.Customer;

public class CancelPaymentLinkTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testTransaction() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient();

        processTestDelay(client, "CancelPaymentLinkTest", IntegrationTestConfiguration.getDefaultTerminalName());

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
        customer.setEmailAddress("support@blockchyp.com");
        customer.setSmsNumber("(123) 123-1231");
        setupRequest.setCustomer(customer);

         PaymentLinkResponse setupResponse = client.sendPaymentLink(setupRequest);

        // Set request parameters
        CancelPaymentLinkRequest request = new CancelPaymentLinkRequest();
        request.setLinkCode(setupResponse.getLinkCode());

        CancelPaymentLinkResponse response = client.cancelPaymentLink(request);

        // Response assertions
        Assert.assertTrue(response.isSuccess());

    }

}