package com.blockchyp.client.examples;



import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.BrandingAsset;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class UpdateBrandingAssetExample {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static void main(String[] args) throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey(System.getenv("BC_API_KEY"));
        creds.setBearerToken(System.getenv("BC_BEARER_TOKEN"));
        creds.setSigningKey(System.getenv("BC_SIGNING_KEY"));

        BlockChypClient client = new BlockChypClient(creds);

        // Set request parameters
        BrandingAsset request = new BrandingAsset();
        request.setMediaId("<MEDIA ID>");
        request.setPadded(true);
        request.setOrdinal(10);
        request.setStartDate("01/06/2021");
        request.setStartTime("14:00");
        request.setEndDate("11/05/2024");
        request.setEndTime("16:00");
        request.setNotes("Test Branding Asset");
        request.setPreview(false);
        request.setEnabled(true);

        // Send the request
        BrandingAsset response = client.updateBrandingAsset(request);
        // View the result
        System.out.println("Response: " + prettyPrint(response));

    }

    public static String prettyPrint(Object object) throws Exception {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return object.getClass().getSimpleName() + ": " + gson.toJson(object);

    }
}
