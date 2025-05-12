package com.blockchyp.client.examples;



import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.MerchantProfileRequest;
import com.blockchyp.client.dto.MerchantPlatformsResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class MerchantPlatformsExample {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey(System.getenv("BC_API_KEY"));
        creds.setBearerToken(System.getenv("BC_BEARER_TOKEN"));
        creds.setSigningKey(System.getenv("BC_SIGNING_KEY"));

        BlockChypClient client = new BlockChypClient(creds);

        // Set request parameters
        MerchantProfileRequest request = new MerchantProfileRequest();
        request.setMerchantId("XXXXXXXXXXXXX");

        // Send the request
        MerchantPlatformsResponse response = client.merchantPlatforms(request);
        // View the result
        System.out.println("Response: " + prettyPrint(response));

    }

    public static String prettyPrint(Object object) throws Exception {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return object.getClass().getSimpleName() + ": " + gson.toJson(object);

    }
}
