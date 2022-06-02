package com.blockchyp.client.examples;



import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.TextPromptRequest;
import com.blockchyp.client.dto.TextPromptResponse;
import com.blockchyp.client.dto.PromptType;


public class TextPromptExample {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey(System.getenv("BC_API_KEY"));
        creds.setBearerToken(System.getenv("BC_BEARER_TOKEN"));
        creds.setSigningKey(System.getenv("BC_SIGNING_KEY"));

        BlockChypClient client = new BlockChypClient(creds);

        // Set request parameters
        TextPromptRequest request = new TextPromptRequest();
        request.setTest(true);
        request.setTerminalName("Test Terminal");
        request.setPromptType(PromptType.EMAIL);

        // Send the request
        TextPromptResponse response = client.textPrompt(request);
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
