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

    public static void main(String[] args) throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey(System.getenv("BC_API_KEY"));
        creds.setBearerToken(System.getenv("BC_BEARER_TOKEN"));
        creds.setSigningKey(System.getenv("BC_SIGNING_KEY"));

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        TransactionDisplayRequest request = new TransactionDisplayRequest();
        request.setTest(true);
        request.setTerminalName("Test Terminal");
        request.setTransaction(newTransactionDisplayTransaction());

        Acknowledgement response = client.updateTransactionDisplay(request);

        // view the result
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

    private static TransactionDisplayTransaction newTransactionDisplayTransaction() {

         TransactionDisplayTransaction val = new TransactionDisplayTransaction();
         val.setSubtotal("60.00");
         val.setTax("5.00");
         val.setTotal("65.00");
         val.setItems(newTransactionDisplayItems());
         return val;

    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static Collection newTransactionDisplayItems() {

         Collection results = new ArrayList();
         results.add(newTransactionDisplayItem2());
         return results;

    }

    private static TransactionDisplayItem newTransactionDisplayItem2() {

         TransactionDisplayItem val = new TransactionDisplayItem();
         val.setDescription("Leki Trekking Poles");
         val.setPrice("35.00");
         val.setQuantity(2);
         val.setExtended("70.00");
         val.setDiscounts(newTransactionDisplayDiscounts());
         return val;

    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static Collection newTransactionDisplayDiscounts() {

         Collection results = new ArrayList();
         results.add(newTransactionDisplayDiscount2());
         return results;

    }

    private static TransactionDisplayDiscount newTransactionDisplayDiscount2() {

         TransactionDisplayDiscount val = new TransactionDisplayDiscount();
         val.setDescription("memberDiscount");
         val.setAmount("10.00");
         return val;

    }
}
