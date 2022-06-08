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

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey(System.getenv("BC_API_KEY"));
        creds.setBearerToken(System.getenv("BC_BEARER_TOKEN"));
        creds.setSigningKey(System.getenv("BC_SIGNING_KEY"));

        BlockChypClient client = new BlockChypClient(creds);

        // Set request parameters
        PaymentLinkRequest request = new PaymentLinkRequest();
        request.setTransactionRef("<TX REF>");
        request.setAmount("199.99");
        request.setDescription("Widget");
        request.setSubject("Widget invoice");

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
        request.setTransaction(transaction);
        request.setAutoSend(true);

        Customer customer = new Customer();
        customer.setCustomerRef("Customer reference string");
        customer.setFirstName("FirstName");
        customer.setLastName("LastName");
        customer.setCompanyName("Company Name");
        customer.setEmailAddress("support@blockchyp.com");
        customer.setSmsNumber("(123) 123-1231");
        request.setCustomer(customer);

        // Send the request
        PaymentLinkResponse response = client.sendPaymentLink(request);
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
