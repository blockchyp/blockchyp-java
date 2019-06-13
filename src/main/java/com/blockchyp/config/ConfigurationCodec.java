package com.blockchyp.config;

import org.apache.commons.codec.binary.Base64;

import com.fasterxml.jackson.databind.ObjectMapper;

public final class ConfigurationCodec {
    
    private static ConfigurationCodec instance;
    
    private ConfigurationCodec() {
        
    }
    
    public static ConfigurationCodec getInstance() {
        if (instance == null) {
            instance = new ConfigurationCodec();
        }
        return instance;
    }
    
    public String encode(BlockChypConfiguration config) {
        
        ObjectMapper mapper = new ObjectMapper();
        try {
            return Base64.encodeBase64String(mapper.writeValueAsBytes(config));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
 
    }
    
    public BlockChypConfiguration decode(String encodedConfig) {
        
        ObjectMapper mapper = new ObjectMapper();
        
        byte[] json = Base64.decodeBase64(encodedConfig);
        
        try {
            BlockChypConfiguration config = mapper.readValue(json, BlockChypConfiguration.class);
            return config;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        
        
        
    }

}
