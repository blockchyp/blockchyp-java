package com.blockchyp.client;

import java.io.File;
import java.util.UUID;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.APICredentials;
import com.blockchyp.client.IntegrationTestSettings;
import com.blockchyp.client.IntegrationTestSettings.TestAPICredentials;
import com.fasterxml.jackson.databind.ObjectMapper;

/*
 * This test utility class loads the client configuration from the usual spot for 
 * SDK tests, which should be <USER_HOME>/blockchyp/sdk-itest-config.json or 
 * <USER_HOME>/.config/blockchyp/sdk-itest-config.json
 * 
 */

public class IntegrationTestConfiguration {
	
	static final String[] HOME_ENV_VARIABLES = {"user.dir", "HOME"};
	
    protected static IntegrationTestSettings getSettings() {
        
        ObjectMapper mapper = new ObjectMapper();
        try {
        	
        	File configFile = new File(resolveFileLocation());
        	
        	if (!configFile.exists()) {
        		throw new IllegalStateException("Unable to locate test configuration file at " + configFile.getAbsolutePath());
        	}
        	
        	System.out.println("Loading test configuration from "  + configFile.getAbsolutePath());
        	
            return mapper.readValue(configFile, IntegrationTestSettings.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }
    
    protected static String resolveUserHome() {
    	
    	for (int i = 0; i < HOME_ENV_VARIABLES.length; i++) {
    		String envValue = System.getenv(HOME_ENV_VARIABLES[i]);
    		if (StringUtils.isNotEmpty(envValue)) {
    			return envValue;
    		}
    	}
    	
    	return null;
    	
    }
    
    protected static String resolveFileLocation() {
    	
    	String configHome = null;
    	
    	if (SystemUtils.IS_OS_WINDOWS) {
    		configHome = System.getenv("userprofile");
    	} else {
    		configHome = System.getenv("XDG_CONFIG_HOME");
    		if (StringUtils.isEmpty(configHome)) {
    			String userHome = resolveUserHome();
    			if (userHome == null) {
    				configHome = "~/"; //hail mary
    			} else {
    				configHome = userHome + "/.config";
    			}
    		}
    	}
    	
    	
    	return configHome + "/blockchyp/sdk-itest-config.json";
    	
    }
    
    public static String getDefaultTerminalName() {
        return getSettings().getDefaultTerminalName();
    }   
    
    public static String getDashboardHost() {
        return getSettings().getDashboardHost();
    }
    
    public static String getGatewayHost() {
        return getSettings().getGatewayHost();
    }
    
    public static String getTestGatewayHost() {
        return getSettings().getTestGatewayHost();
    }
    
    public static APICredentials getTestCredentials() {
        
        APICredentials creds = new APICredentials();
        IntegrationTestSettings settings = getSettings();
        creds.setApiKey(settings.getApiKey());
        creds.setBearerToken(settings.getBearerToken());
        creds.setSigningKey(settings.getSigningKey());
                
        return creds;
    }
    
    public static APICredentials getTestCredentials(String profile) {
    	
    	TestAPICredentials testCreds = getSettings().getProfile(profile);
    	
    	return new APICredentials(testCreds.getApiKey(), testCreds.getBearerToken(), testCreds.getSigningKey());

    }
    
    
    public static BlockChypClient getTestClient() {
		return new BlockChypClient(
				IntegrationTestConfiguration.getDashboardHost(),
				IntegrationTestConfiguration.getGatewayHost(), 
				IntegrationTestConfiguration.getTestGatewayHost(), 
				IntegrationTestConfiguration.getTestCredentials()
			);
    }
    
    public static BlockChypClient getTestClient(String profile) {
		return new BlockChypClient(
				IntegrationTestConfiguration.getDashboardHost(),
				IntegrationTestConfiguration.getGatewayHost(), 
				IntegrationTestConfiguration.getTestGatewayHost(), 
				IntegrationTestConfiguration.getTestCredentials(profile)
			);
    }
    
    

}
