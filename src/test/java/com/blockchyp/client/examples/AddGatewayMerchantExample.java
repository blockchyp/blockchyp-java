package com.blockchyp.client.examples;



import java.util.ArrayList;
import java.util.Collection;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AddGatewayMerchantRequest;
import com.blockchyp.client.dto.MerchantProfileResponse;
import com.blockchyp.client.dto.MerchantProfile;


public class AddGatewayMerchantExample {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey(System.getenv("BC_API_KEY"));
        creds.setBearerToken(System.getenv("BC_BEARER_TOKEN"));
        creds.setSigningKey(System.getenv("BC_SIGNING_KEY"));

        BlockChypClient client = new BlockChypClient(creds);

        // Set request parameters
        AddGatewayMerchantRequest request = new AddGatewayMerchantRequest();

        MerchantProfile profile = new MerchantProfile();
        profile.setDbaName("DBA Name");
        profile.setCompanyName("Corporate Entity Name");
        request.setProfile(profile);

        // Send the request
        MerchantProfileResponse response = client.addGatewayMerchant(request);
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
