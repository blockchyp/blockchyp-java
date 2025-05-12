package com.blockchyp.client.examples;



import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.PartnerCommissionBreakdownRequest;
import com.blockchyp.client.dto.PartnerCommissionBreakdownResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class PartnerCommissionBreakdownExample {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey(System.getenv("BC_API_KEY"));
        creds.setBearerToken(System.getenv("BC_BEARER_TOKEN"));
        creds.setSigningKey(System.getenv("BC_SIGNING_KEY"));

        BlockChypClient client = new BlockChypClient(creds);

        // Set request parameters
        PartnerCommissionBreakdownRequest request = new PartnerCommissionBreakdownRequest();


        // Send the request
        PartnerCommissionBreakdownResponse response = client.partnerCommissionBreakdown(request);
        // View the result
        System.out.println("Response: " + prettyPrint(response));

    }

    public static String prettyPrint(Object object) throws Exception {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return object.getClass().getSimpleName() + ": " + gson.toJson(object);

    }
}
