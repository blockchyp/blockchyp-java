package com.blockchyp.client.examples;



import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.MerchantProfile;
import com.blockchyp.client.dto.MerchantProfileResponse;
import com.blockchyp.client.dto.Address;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class UpdateMerchantExample {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey(System.getenv("BC_API_KEY"));
        creds.setBearerToken(System.getenv("BC_BEARER_TOKEN"));
        creds.setSigningKey(System.getenv("BC_SIGNING_KEY"));

        BlockChypClient client = new BlockChypClient(creds);

        // Set request parameters
        MerchantProfile request = new MerchantProfile();
        request.setMerchantId("<MERCHANT ID>");
        request.setTest(true);
        request.setDbaName("Test Merchant");
        request.setCompanyName("Test Merchant");

        Address billingAddress = new Address();
        billingAddress.setAddress1("1060 West Addison");
        billingAddress.setCity("Chicago");
        billingAddress.setStateOrProvince("IL");
        billingAddress.setPostalCode("60613");
        request.setBillingAddress(billingAddress);

        // Send the request
        MerchantProfileResponse response = client.updateMerchant(request);
        // View the result
        System.out.println("Response: " + prettyPrint(response));

    }

    public static String prettyPrint(Object object) throws Exception {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return object.getClass().getSimpleName() + ": " + gson.toJson(object);

    }
}
