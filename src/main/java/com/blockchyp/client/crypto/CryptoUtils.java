package com.blockchyp.client.crypto;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;

import javax.crypto.Mac;

import org.apache.commons.codec.binary.Base32;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.HmacAlgorithms;
import org.apache.commons.codec.digest.HmacUtils;
import org.apache.commons.lang.StringUtils;

public class CryptoUtils {

    public final static String HEADER_NONCE = "Nonce";
    public final static String HEADER_TIMESTAMP = "Timestamp";
    public final static String HEADER_AUTHORIZATION = "Authorization";
    public final static String AUTH_SCHEME_DUAL = "Dual";

    private static CryptoUtils instance;

    private SecureRandom rand;

    private CryptoUtils() {
        rand = new SecureRandom();
    }

    public static CryptoUtils getInstance() {

        if (instance == null) {
            instance = new CryptoUtils();
        }

        return instance;

    }

    public String computeSHA256(String hex) {

        try {

            return DigestUtils.sha256Hex(Hex.decodeHex(hex));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public Map<String, String> generateApiHeaders(String apiKey, String bearerToken, String signingKey) {
        
        Map<String, String> results = new HashMap<>();
        
        Base32 base32 = new Base32();
        
        String nonce =  StringUtils.remove(base32.encodeAsString(randomBytes(32)), "=");
        String ts = generateTimestamp();
        
        String toSign = apiKey + bearerToken + ts + nonce;
        
        results.put(HEADER_NONCE, nonce);
        results.put(HEADER_TIMESTAMP, ts);
        
        try {
        
            Mac mac = HmacUtils.getInitializedMac(HmacAlgorithms.HMAC_SHA_256, Hex.decodeHex(signingKey));
            String hmac = Hex.encodeHexString(mac.doFinal(toSign.getBytes()));
            String authHeader = AUTH_SCHEME_DUAL + " " + bearerToken + ":" + apiKey + ":" + hmac;
            results.put(HEADER_AUTHORIZATION, authHeader);
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        
        
        
        
        return results;
        
        
        
    }
    
    public String generateTimestamp() {
        
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        fmt.setTimeZone(TimeZone.getTimeZone("UTC"));
        
        return fmt.format(new Date());
        
    }


    public byte[] randomBytes(int len) {

        byte[] results = new byte[len];

        rand.nextBytes(results);

        return results;

    }

}
