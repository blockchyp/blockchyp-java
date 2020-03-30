package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.TransactionDisplayRequest;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.TransactionDisplayTransaction;
import com.blockchyp.client.dto.TransactionDisplayItem;
import com.blockchyp.client.dto.TransactionDisplayDiscount;


public class UpdateTransactionDisplayExample {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey(System.getenv("BC_API_KEY"));
        creds.setBearerToken(System.getenv("BC_BEARER_TOKEN"));
        creds.setSigningKey(System.getenv("BC_SIGNING_KEY"));

        BlockChypClient client = new BlockChypClient(creds);

        // Set request parameters
        TransactionDisplayRequest request = new TransactionDisplayRequest();
        request.setTest(true);
        request.setTerminalName("Test Terminal");

        TransactionDisplayTransaction transaction = new TransactionDisplayTransaction();
        transaction.setSubtotal("60.00");
        transaction.setTax("5.00");
        transaction.setTotal("65.00");

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

        // Send the request
        Acknowledgement response = client.updateTransactionDisplay(request);

        // View the result
        System.out.println("Response: " + prettyPrint(response));

    }

    public static String prettyPrint(Object object) throws Exception {

        ObjectWriter writer = new ObjectMapper()
            .writer()
            .withDefaultPrettyPrinter();

        return object.getClass().getSimpleName()
            + ": "
            + writer.writeValueAsString(object);

    }
}
