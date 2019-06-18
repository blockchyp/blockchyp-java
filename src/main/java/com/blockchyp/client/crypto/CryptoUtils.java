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

/**
 * This is utility class providing cryptography support for the BlockChyp client.
 * It handles the authorization headers required for direct gateway requests along 
 * with AES encryption for the offline route cache.
 * 
 */

public final class CryptoUtils {

    public static final String HEADER_NONCE = "Nonce";
    public static final String HEADER_TIMESTAMP = "Timestamp";
    public static final String HEADER_AUTHORIZATION = "Authorization";
    public static final String AUTH_SCHEME_DUAL = "Dual";

    public static final int AES_KEY_SIZE_IN_BYTES = 16;
    public static final int NONCE_SIZE_IN_BYTES = 32;

    private static CryptoUtils instance;

    private SecureRandom rand;

    private CryptoUtils() {
        rand = new SecureRandom();
    }

    /**
     * Returns the CryptoUtils singleton.
     * @return an instance of {@link CryptoUtils}
     */
    public static CryptoUtils getInstance() {

        if (instance == null) {
            instance = new CryptoUtils();
        }

        return instance;

    }

    
    /**
     * Computes a SHA 256 hash of the given hex.
     * @param hex data to be hashed in hex format.
     * @return hex encoded hash of the input data
     */
    public String computeSHA256(String hex) {

        try {

            return DigestUtils.sha256Hex(Hex.decodeHex(hex));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
    
    /**
     * Generates the big three API request headers based on the input credentials.
     * @param apiKey BlockChyp API Key (root or transient)
     * @param bearerToken BlockChyp Bearer Token (root or transient)
     * @param signingKey BlockChyp Signing Key (root or transient)
     * @return a {@link java.util.Map} containing the API request headers.
     */

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public Map<String, String> generateApiHeaders(String apiKey, String bearerToken, String signingKey) {

        Map results = new HashMap();

        Base32 base32 = new Base32();

        String nonce = StringUtils.remove(base32.encodeAsString(randomBytes(NONCE_SIZE_IN_BYTES)), "=");
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

    /**
     * Generates a timestamp encoded for use in Gateway API request headers.
     * 
     * @return ISO encoded UTC timestamp string.
     */
    public String generateTimestamp() {

        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        fmt.setTimeZone(TimeZone.getTimeZone("UTC"));

        return fmt.format(new Date());

    }
    
    /**
     * Decrypts cipher text previously encoded with {@link encrypt}.
     * 
     * @param cipherText the initialization vector and cipher text separated by a pipe character.
     * @param key the AES encryption to use.
     * @return the plain text
     * @throws Exception if the decryption or associated encoding operations fail.
     */

    public String decrypt(String cipherText, byte[] key) throws Exception {

        String[] tokens = StringUtils.split(cipherText, "|");

        SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        byte[] iv = Hex.decodeHex(tokens[0]);
        AlgorithmParameterSpec paramSpec = new IvParameterSpec(iv);
        cipher.init(Cipher.DECRYPT_MODE, secretKey, paramSpec);
        return new String(cipher.doFinal(Hex.decodeHex(tokens[1])));

    }
    
    /**
     * Encrypts the given plain text using the given key using AES with PKCS#5 padding.
     * 
     * Generates and returns a CBC initialization vector prepended to the main cipher text.
     * 
     * @param plainText the message to be encrypted
     * @param key AES encryption key
     * @return return hex encoded initialization vector and cipher text, pipe delimited.
     * @throws Exception if an error occurs during encryption or encoding.
     */
    public String encrypt(String plainText, byte[] key) throws Exception {

        SecretKeySpec secretKey = new SecretKeySpec(key, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        byte[] iv = new byte[AES_KEY_SIZE_IN_BYTES];
        new Random().nextBytes(iv);
        AlgorithmParameterSpec paramSpec = new IvParameterSpec(iv);
        cipher.init(Cipher.ENCRYPT_MODE, secretKey, paramSpec);
        return Hex.encodeHexString(iv) + "|" + Hex.encodeHexString(cipher.doFinal(plainText.getBytes()));

    }
    
    /**
     * Returns an array of random bytes of the given length.
     * @param len Number of random bytes to return.
     * @return byte[]
     */

    public byte[] randomBytes(int len) {

        byte[] results = new byte[len];

        rand.nextBytes(results);

        return results;

    }

}
