package com.blockchyp.client.itest;

import java.io.File;

import com.blockchyp.client.GatewayCredentials;
import com.fasterxml.jackson.databind.ObjectMapper;

public class IntegrationTestConfiguration {
    
    
    
    protected static IntegrationTestSettings getSettings() {
        
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readValue(new File("/etc/blockchyp/sdk-itest-config.json"), IntegrationTestSettings.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }
    
    protected static String getDefaultTerminalName() {
        return getSettings().getDefaultTerminalName();
    }
    
    
    public static String getGatewayHost() {
        return getSettings().getGatewayHost();
    }
    
    public static GatewayCredentials getTestCredentials() {
        
        GatewayCredentials creds = new GatewayCredentials();
        IntegrationTestSettings settings = getSettings();
        creds.setApiKey(settings.getApiKey());
        creds.setBearerToken(settings.getBearerToken());
        creds.setSigningKey(settings.getSigningKey());
                
        return creds;
    }
    
    

}
