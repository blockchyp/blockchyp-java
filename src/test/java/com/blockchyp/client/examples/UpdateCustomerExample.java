package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.UpdateCustomerRequest;
import com.blockchyp.client.dto.CustomerResponse;
import com.blockchyp.client.dto.Customer;


public class UpdateCustomerExample {

    public static void main(String[] args) throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey(System.getenv("BC_API_KEY"));
        creds.setBearerToken(System.getenv("BC_BEARER_TOKEN"));
        creds.setSigningKey(System.getenv("BC_SIGNING_KEY"));

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        UpdateCustomerRequest request = new UpdateCustomerRequest();
        request.setCustomer(newCustomer());

        CustomerResponse response = client.updateCustomer(request);

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

    private static Customer newCustomer() {

         Customer val = new Customer();
         val.setId("ID of the customer to update");
         val.setCustomerRef("Customer reference string");
         val.setFirstName("FirstName");
         val.setLastName("LastName");
         val.setCompanyName("Company Name");
         val.setEmailAddress("support@blockchyp.com");
         val.setSmsNumber("(123) 123-1231");
         return val;

    }
}
