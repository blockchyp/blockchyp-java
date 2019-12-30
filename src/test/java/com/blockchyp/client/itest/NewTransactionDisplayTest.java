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
import com.blockchyp.client.dto.TransactionDisplayRequest;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.TransactionDisplayTransaction;
import com.blockchyp.client.dto.TransactionDisplayItem;
import com.blockchyp.client.dto.TransactionDisplayDiscount;

public class NewTransactionDisplayTest {

    @Test
    @Category(IntegrationTest.class)
    public void testTransaction() throws Exception {

         BlockChypClient client = IntegrationTestConfiguration.getTestClient();



         // setup request object
         TransactionDisplayRequest request = new TransactionDisplayRequest();
         request.setTest(true);
         request.setTerminalName("Test Terminal");
         request.setTransaction(newTransactionDisplayTransaction());

         Acknowledgement response = client.newTransactionDisplay(request);


         // response assertions
         Assert.assertTrue(response.isSuccess());

    }

    private TransactionDisplayTransaction newTransactionDisplayTransaction() {
         TransactionDisplayTransaction val = new TransactionDisplayTransaction();
         val.setSubtotal("35.00");
         val.setTax("5.00");
         val.setTotal("70.00");
         val.setItems(newTransactionDisplayItems());
         return val;
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private Collection newTransactionDisplayItems() {
         Collection results = new ArrayList();
         results.add(newTransactionDisplayItem2());
         return results;
    }
    private TransactionDisplayItem newTransactionDisplayItem2() {
         TransactionDisplayItem val = new TransactionDisplayItem();
         val.setDescription("Leki Trekking Poles");
         val.setPrice("35.00");
         val.setQuantity(2);
         val.setExtended("70.00");
         val.setDiscounts(newTransactionDisplayDiscounts());
         return val;
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private Collection newTransactionDisplayDiscounts() {
         Collection results = new ArrayList();
         results.add(newTransactionDisplayDiscount2());
         return results;
    }
    private TransactionDisplayDiscount newTransactionDisplayDiscount2() {
         TransactionDisplayDiscount val = new TransactionDisplayDiscount();
         val.setDescription("memberDiscount");
         val.setAmount("10.00");
         return val;
    }

}
