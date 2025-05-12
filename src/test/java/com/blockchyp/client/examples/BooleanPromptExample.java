package com.blockchyp.client.examples;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.BooleanPromptRequest;
import com.blockchyp.client.dto.BooleanPromptResponse;

public class BooleanPromptExample {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey(System.getenv("BC_API_KEY"));
        creds.setBearerToken(System.getenv("BC_BEARER_TOKEN"));
        creds.setSigningKey(System.getenv("BC_SIGNING_KEY"));

        BlockChypClient client = new BlockChypClient(creds);

        // Set request parameters
        BooleanPromptRequest request = new BooleanPromptRequest();
        request.setTest(true);
        request.setTerminalName("Test Terminal");
        request.setPrompt("Would you like to become a member?");
        request.setYesCaption("Yes");
        request.setNoCaption("No");

        // Send the request
        BooleanPromptResponse response = client.booleanPrompt(request);

        // View the result
        System.out.println("Response: " + prettyPrint(response));
    }

    public static String prettyPrint(Object object) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return object.getClass().getSimpleName() + ": " + gson.toJson(object);
    }
}
