package com.blockchyp.examples;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.ClearTerminalRequest;
import com.blockchyp.client.dto.PingRequest;
import com.blockchyp.client.dto.TransactionDisplayDiscount;
import com.blockchyp.client.dto.TransactionDisplayItem;
import com.blockchyp.client.dto.TransactionDisplayRequest;
import com.blockchyp.client.dto.TransactionDisplayTransaction;
import com.blockchyp.client.itest.IntegrationTestConfiguration;

public class LineItemDisplayExample {
    
    @Autowired
    private BlockChypClient blockchypClient;
    
    public void lineItemDisplay() throws Exception {
       
        
        TransactionDisplayRequest request = new TransactionDisplayRequest();
        request.setTerminalName("Test Terminal");
        
        TransactionDisplayDiscount discount = new TransactionDisplayDiscount();
        discount.setAmount("5.00");
        discount.setDescription("Member Discount");
        TransactionDisplayItem item = new TransactionDisplayItem();
        item.addDiscount(discount);
        item.setDescription("Leki Trekking Poles");  // we live in washington state and we're hikers
        item.setPrice("150.00");
        item.setQuantity(1f);
        item.setExtended("145.00");
       
        
        TransactionDisplayTransaction tx = new TransactionDisplayTransaction();
        tx.addItem(item);
        tx.setSubtotal("145");
        tx.setTax("0.00");        
        request.setTransaction(tx);

        // newTransactionDisplay() replaces the terminal contents
        Acknowledgement ack = blockchypClient.newTransactionDisplay(request); 
     
        request = new TransactionDisplayRequest();
        request.setTerminalName("Test Terminal");
        
        item = new TransactionDisplayItem();
        item.setDescription("Northwest Forest Pass");  //you'll get a free one if you work here
        item.setPrice("30.00");
        item.setQuantity(1f);
        item.setExtended("30.00");
        
        tx.setSubtotal("175.00");
        tx.setTax("0.00");        
        tx.setTotal("175.00");

        // updateTransactionDisplay() adds more line items to the display
        ack = blockchypClient.updateTransactionDisplay(request);
        
        
    }

}
