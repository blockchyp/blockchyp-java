package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.PaymentLinkRequest;
import com.blockchyp.client.dto.PaymentLinkResponse;
import com.blockchyp.client.dto.TransactionDisplayTransaction;
import com.blockchyp.client.dto.TransactionDisplayItem;
import com.blockchyp.client.dto.Customer;


public class SendPaymentLinkExample {

    public static void main(String[] args) throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey(System.getenv("BC_API_KEY"));
        creds.setBearerToken(System.getenv("BC_BEARER_TOKEN"));
        creds.setSigningKey(System.getenv("BC_SIGNING_KEY"));

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        PaymentLinkRequest request = new PaymentLinkRequest();
        request.setAmount("199.99");
        request.setDescription("Widget");
        request.setSubject("Widget invoice");
        request.setTransaction(newTransactionDisplayTransaction());
        request.setAutoSend(true);
        request.setCustomer(newCustomer());

        PaymentLinkResponse response = client.sendPaymentLink(request);

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
         val.setSubtotal("195.00");
         val.setTax("4.99");
         val.setTotal("199.99");
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
         val.setDescription("Widget");
         val.setPrice("195.00");
         val.setQuantity(1);
         return val;

    }

    private static Customer newCustomer() {

         Customer val = new Customer();
         val.setCustomerRef("Customer reference string");
         val.setFirstName("FirstName");
         val.setLastName("LastName");
         val.setCompanyName("Company Name");
         val.setEmailAddress("support@blockchyp.com");
         val.setSmsNumber("(123) 123-1231");
         return val;

    }
}
