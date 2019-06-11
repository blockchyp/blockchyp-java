package com.blockchyp.client.itest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.TransactionDisplayDiscount;
import com.blockchyp.client.dto.TransactionDisplayItem;
import com.blockchyp.client.dto.TransactionDisplayRequest;
import com.blockchyp.client.dto.TransactionDisplayTransaction;

public class LineItemDisplayTest {
	
	
    @Test
    @Category(IntegrationTest.class)
    public void testLineItemDisplay() throws Exception {
        
        
    	BlockChypClient client = IntegrationTestConfiguration.getTestClient();
    	
    	Acknowledgement ack = client.clearTransactionDisplay(IntegrationTestConfiguration.getDefaultTerminalName());
    	
        Assert.assertNotNull(ack);
        Assert.assertTrue(ack.isSuccess());
        
        Thread.sleep(2000);
        
        TransactionDisplayRequest request = new TransactionDisplayRequest();
        request.setTest(true);
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        
        TransactionDisplayDiscount discount = new TransactionDisplayDiscount();
        discount.setAmount("5.00");
        discount.setDescription("Member Discount");
        TransactionDisplayItem item = new TransactionDisplayItem();
        item.addDiscount(discount);
        item.setDescription("Leki Trekking Poles");
        item.setPrice("150.00");
        item.setQuantity(1f);
        item.setSubtotal("150.00");
        
        TransactionDisplayTransaction tx = new TransactionDisplayTransaction();
        tx.addItem(item);
        tx.setSubtotal("145.00");
        tx.setTax("5.00");
        tx.setTotal("150.00");
        
        request.setTransaction(tx);

        
        ack = client.newTransactionDisplay(request);
        
        Assert.assertNotNull(ack);
        Assert.assertTrue(ack.isSuccess());
        
        Thread.sleep(2000);
        
        
        request = new TransactionDisplayRequest();
        request.setTest(true);
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        
        item = new TransactionDisplayItem();
        item.setDescription("Black Diamond Ice Axe");
        item.setPrice("199.00");
        item.setQuantity(1f);
        item.setSubtotal("199.00");
        
        tx = new TransactionDisplayTransaction();
        tx.addItem(item);
        tx.setSubtotal("344.00");
        tx.setTax("6.00");
        tx.setTotal("350.00");
        
        request.setTransaction(tx);
        
        ack = client.updateTransactionDisplay(request);
        
        Assert.assertNotNull(ack);
        Assert.assertTrue(ack.isSuccess());
        
        
        Thread.sleep(2000);
        
        
        request = new TransactionDisplayRequest();
        request.setTest(true);
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        
        item = new TransactionDisplayItem();
        item.setDescription("Northwest Forest Pass");
        item.setPrice("30.00");
        item.setQuantity(1f);
        item.setSubtotal("30.00");
        
        tx = new TransactionDisplayTransaction();
        tx.addItem(item);
        tx.setSubtotal("374.00");
        tx.setTax("6.00");
        tx.setTotal("380.00");
        
        request.setTransaction(tx);

        
        ack = client.updateTransactionDisplay(request);
        
        Assert.assertNotNull(ack);
        Assert.assertTrue(ack.isSuccess());
        
    }

}
