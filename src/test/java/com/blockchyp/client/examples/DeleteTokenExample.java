package com.blockchyp.client.examples;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.DeleteTokenRequest;
import com.blockchyp.client.dto.DeleteTokenResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class DeleteTokenExample {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey(System.getenv("BC_API_KEY"));
        creds.setBearerToken(System.getenv("BC_BEARER_TOKEN"));
        creds.setSigningKey(System.getenv("BC_SIGNING_KEY"));

        BlockChypClient client = new BlockChypClient(creds);

        // Set request parameters
        DeleteTokenRequest request = new DeleteTokenRequest();
        request.setToken("<TOKEN>");

        // Send the request
        DeleteTokenResponse response = client.deleteToken(request);
        // View the result
        System.out.println("Response: " + prettyPrint(response));

    }

    public static String prettyPrint(Object object) throws Exception {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return object.getClass().getSimpleName() + ": " + gson.toJson(object);

    }
}
