package com.blockchyp.client.crypto;

import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;

import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

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

    @SuppressWarnings({ "rawtypes", "unchecked" })
	public Map<String, String> generateApiHeaders(String apiKey, String bearerToken, String signingKey) {
        
        Map results = new HashMap();
        
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
    
    public String decrypt(String cipherText, byte[] key) throws Exception {
    	
    	String[] tokens = StringUtils.split(cipherText, "|");
    	
    	SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
    	Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    	byte[] iv = Hex.decodeHex(tokens[0]);
        AlgorithmParameterSpec paramSpec = new IvParameterSpec(iv);
        cipher.init(Cipher.DECRYPT_MODE, secretKey, paramSpec);
        return new String(cipher.doFinal(Hex.decodeHex(tokens[1])));

    }
    
    public String encrypt(String plainText, byte[] key) throws Exception {
    	
    	SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
    	Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    	byte[] iv = new byte[16];
    	new Random().nextBytes(iv);
        AlgorithmParameterSpec paramSpec = new IvParameterSpec(iv);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, paramSpec);
        return Hex.encodeHexString(iv) + "|" + Hex.encodeHexString(cipher.doFinal(plainText.getBytes()));
    	
    }


    public byte[] randomBytes(int len) {

        byte[] results = new byte[len];

        rand.nextBytes(results);

        return results;

    }

}
