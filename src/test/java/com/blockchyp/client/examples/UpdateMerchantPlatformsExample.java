package com.blockchyp.client.examples;



import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.MerchantPlatform;
import com.blockchyp.client.dto.Acknowledgement;


public class UpdateMerchantPlatformsExample {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey(System.getenv("BC_API_KEY"));
        creds.setBearerToken(System.getenv("BC_BEARER_TOKEN"));
        creds.setSigningKey(System.getenv("BC_SIGNING_KEY"));

        BlockChypClient client = new BlockChypClient(creds);

        // Set request parameters
        MerchantPlatform request = new MerchantPlatform();


        // Send the request
        Acknowledgement response = client.updateMerchantPlatforms(request);
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
