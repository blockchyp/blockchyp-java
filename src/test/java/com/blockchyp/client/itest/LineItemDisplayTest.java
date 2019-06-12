package com.blockchyp.client.itest;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.ClearTerminalRequest;
import com.blockchyp.client.dto.TransactionDisplayDiscount;
import com.blockchyp.client.dto.TransactionDisplayItem;
import com.blockchyp.client.dto.TransactionDisplayRequest;
import com.blockchyp.client.dto.TransactionDisplayTransaction;

public class LineItemDisplayTest {
	
	
    @Test
    @Category(IntegrationTest.class)
    public void testLineItemDisplay() throws Exception {
        
        
    	BlockChypClient client = IntegrationTestConfiguration.getTestClient();
    	
    	ClearTerminalRequest clearRequest = new ClearTerminalRequest();
    	clearRequest.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
    	clearRequest.setTest(true);
    	
    	Acknowledgement ack = client.clear(clearRequest);
    	
        Assert.assertNotNull(ack);
        Assert.assertTrue(ack.isSuccess());
        
        Thread.sleep(2000);
        
        TransactionDisplayRequest request = new TransactionDisplayRequest();
        request.setTest(true);
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        
        BigDecimal subtotal = new BigDecimal(0);
        subtotal.setScale(2, BigDecimal.ROUND_UP);
        BigDecimal taxRate = new BigDecimal(0.042);
        
        NumberFormat format = new DecimalFormat("#.00");
        
        
        TransactionDisplayDiscount discount = new TransactionDisplayDiscount();
        discount.setAmount("5.00");
        discount.setDescription("Member Discount");
        TransactionDisplayItem item = new TransactionDisplayItem();
        item.addDiscount(discount);
        item.setDescription("Leki Trekking Poles");
        item.setPrice("150.00");
        item.setQuantity(1f);
        item.setExtended("145.00");
        
        subtotal = subtotal.add(new BigDecimal(145));
        
        TransactionDisplayTransaction tx = new TransactionDisplayTransaction();
        tx.addItem(item);
        tx.setSubtotal(format.format(subtotal));
        
        BigDecimal tax = subtotal.multiply(taxRate);
        tax.setScale(2, BigDecimal.ROUND_UP);
        tx.setTax(format.format(tax));        
        tx.setTotal(format.format(subtotal.add(tax)));
        
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
        item.setExtended("199.00");
        
        tx = new TransactionDisplayTransaction();
        tx.addItem(item);
        
        subtotal = subtotal.add(new BigDecimal(199));
        tx.setSubtotal(format.format(subtotal));
        
        tax = subtotal.multiply(taxRate);
        tax.setScale(2, BigDecimal.ROUND_UP);
        tx.setTax(format.format(tax));        
        tx.setTotal(format.format(subtotal.add(tax)));
        
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
        item.setExtended("30.00");
        
        tx = new TransactionDisplayTransaction();
        tx.addItem(item);
        
        subtotal = subtotal.add(new BigDecimal(30));
        
        tx.setSubtotal(format.format(subtotal));
        tax = subtotal.multiply(taxRate);
        tax.setScale(2, BigDecimal.ROUND_UP);
        tx.setTax(format.format(tax));        
        tx.setTotal(format.format(subtotal.add(tax)));
        
        request.setTransaction(tx);

        
        ack = client.updateTransactionDisplay(request);
        
        Assert.assertNotNull(ack);
        Assert.assertTrue(ack.isSuccess());
        
        
        Thread.sleep(2000);
        
        
        request = new TransactionDisplayRequest();
        request.setTest(true);
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        
        item = new TransactionDisplayItem();
        item.setId("Rope");
        item.setDescription("Mammut 10 mm Rope");
        item.setPrice("2.50");
        item.setQuantity(30f);
        
        BigDecimal extended = new BigDecimal(2.5).multiply(new BigDecimal(30));
        
        item.setExtended(format.format(extended));
        
        tx = new TransactionDisplayTransaction();
        tx.addItem(item);
        
        subtotal = subtotal.add(extended);
        tx.setSubtotal(format.format(subtotal));
        tax = subtotal.multiply(taxRate);
        tax.setScale(2, BigDecimal.ROUND_UP);
        tx.setTax(format.format(tax));        
        tx.setTotal(format.format(subtotal.add(tax)));
        
        request.setTransaction(tx);

        
        ack = client.updateTransactionDisplay(request);
        
        Assert.assertNotNull(ack);
        Assert.assertTrue(ack.isSuccess());
        
        Thread.sleep(2000);
        
        
        request = new TransactionDisplayRequest();
        request.setTest(true);
        request.setTerminalName(IntegrationTestConfiguration.getDefaultTerminalName());
        
        item = new TransactionDisplayItem();
        item.setId("Rope");
        item.setDescription("Mammut 10 mm Rope");
        item.setPrice("2.50");
        item.setQuantity(10.5f);
        
        BigDecimal extDiff = new BigDecimal(2.5).multiply(new BigDecimal(10.5));
        
        extended = extended.add(extDiff);
        
        item.setExtended(format.format(extended));
        
        tx = new TransactionDisplayTransaction();
        tx.addItem(item);
        
        subtotal = subtotal.add(extDiff);
        tx.setSubtotal(format.format(subtotal));
        tax = subtotal.multiply(taxRate);
        tax.setScale(2, BigDecimal.ROUND_UP);
        tx.setTax(format.format(tax));        
        tx.setTotal(format.format(subtotal.add(tax)));
        
        request.setTransaction(tx);

        
        ack = client.updateTransactionDisplay(request);
        
        Assert.assertNotNull(ack);
        Assert.assertTrue(ack.isSuccess());
        
        
    }

}
