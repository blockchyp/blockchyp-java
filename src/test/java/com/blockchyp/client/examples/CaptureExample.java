package com.blockchyp.client.examples;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.CaptureRequest;
import com.blockchyp.client.dto.CaptureResponse;

public class CaptureExample {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey(System.getenv("BC_API_KEY"));
        creds.setBearerToken(System.getenv("BC_BEARER_TOKEN"));
        creds.setSigningKey(System.getenv("BC_SIGNING_KEY"));

        BlockChypClient client = new BlockChypClient(creds);

        // Set request parameters
        CaptureRequest request = new CaptureRequest();
        request.setTest(true);
        request.setTransactionId("<ORIGINAL TRANSACTION ID>");
        request.setAmount("32.00");

        // Send the request
        CaptureResponse response = client.capture(request);

        // View the result
        System.out.println("Response: " + prettyPrint(response));
    }

    public static String prettyPrint(Object object) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return object.getClass().getSimpleName() + ": " + gson.toJson(object);
    }
}
