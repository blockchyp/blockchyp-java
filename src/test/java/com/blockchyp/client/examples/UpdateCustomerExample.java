package com.blockchyp.client.examples;



import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.UpdateCustomerRequest;
import com.blockchyp.client.dto.CustomerResponse;
import com.blockchyp.client.dto.Customer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class UpdateCustomerExample {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey(System.getenv("BC_API_KEY"));
        creds.setBearerToken(System.getenv("BC_BEARER_TOKEN"));
        creds.setSigningKey(System.getenv("BC_SIGNING_KEY"));

        BlockChypClient client = new BlockChypClient(creds);

        // Set request parameters
        UpdateCustomerRequest request = new UpdateCustomerRequest();

        Customer customer = new Customer();
        customer.setId("<CUSTOMER ID>");
        customer.setCustomerRef("Customer reference string");
        customer.setFirstName("FirstName");
        customer.setLastName("LastName");
        customer.setCompanyName("Company Name");
        customer.setEmailAddress("notifications@blockchypteam.m8r.co");
        customer.setSmsNumber("(123) 123-1231");
        request.setCustomer(customer);

        // Send the request
        CustomerResponse response = client.updateCustomer(request);
        // View the result
        System.out.println("Response: " + prettyPrint(response));

    }

    public static String prettyPrint(Object object) throws Exception {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return object.getClass().getSimpleName() + ": " + gson.toJson(object);

    }
}
