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
import com.blockchyp.client.dto.TransactionDisplayRequest;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.TransactionDisplayTransaction;
import com.blockchyp.client.dto.TransactionDisplayItem;
import com.blockchyp.client.dto.TransactionDisplayDiscount;

public class NewTransactionDisplayTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testEndpoint() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient("");


        processTestDelay(IntegrationTestConfiguration.getTestClient(), "NewTransactionDisplayTest", IntegrationTestConfiguration.getDefaultTerminalName());
        
        // Set request parameters
        TransactionDisplayRequest request = new TransactionDisplayRequest();
        request.setTest(true);
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());

        TransactionDisplayTransaction transaction = new TransactionDisplayTransaction();
        transaction.setSubtotal("35.00");
        transaction.setTax("5.00");
        transaction.setTotal("70.00");

        Collection items = new ArrayList();
        TransactionDisplayItem items0 = new TransactionDisplayItem();
        items0.setDescription("Leki Trekking Poles");
        items0.setPrice("35.00");
        items0.setQuantity(2);
        items0.setExtended("70.00");

        Collection discounts = new ArrayList();
        TransactionDisplayDiscount discounts0 = new TransactionDisplayDiscount();
        discounts0.setDescription("memberDiscount");
        discounts0.setAmount("10.00");
        discounts.add(discounts0);
        items0.setDiscounts(discounts);
        items.add(items0);
        transaction.setItems(items);
        request.setTransaction(transaction);

        Exception ex = null;
        try {
            Acknowledgement response = client.newTransactionDisplay(request);
            // Response assertions
            Assert.assertTrue(response.isSuccess());
        } catch (Exception e) {
            ex = e;
        }

    Assert.assertNull(ex);
    }

}
