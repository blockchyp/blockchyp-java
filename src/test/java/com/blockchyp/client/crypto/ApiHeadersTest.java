package com.blockchyp.client.crypto;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class ApiHeadersTest {
    
    
    @Test
    public void testApiHeaderGeneration() {
        
        String apiId = "SGLATIFZD7PIMLAQJ2744MOEGI";
        String bearerToken = "FI2SWNNJHJVO6DBZEF26YEHHMY";
        String signingKey = "c3a8214c318dd470b0107d6c111f086b60ad695aaeb598bf7d1032eee95339a0";
        
        Map<String, String> headers = CryptoUtils.getInstance().generateApiHeaders(apiId, bearerToken, signingKey);
        
        for (String key : headers.keySet()) {
            System.out.println(key + ": " + headers.get(key));
        }
        
        
        Assert.assertEquals(3, headers.size());
        
        
        Assert.assertNotNull(headers.get("Nonce"));
        Assert.assertNotNull(headers.get("Timestamp"));
        Assert.assertNotNull(headers.get("Authorization"));
        
    }

}
