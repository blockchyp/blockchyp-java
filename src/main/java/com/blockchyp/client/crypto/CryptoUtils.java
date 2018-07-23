package com.blockchyp.client.crypto;

import java.math.BigInteger;
import java.security.SecureRandom;

public class CryptoUtils {
    
   public static String GROUP_14_PRIME = "FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD129024E088A67CC74020BBEA63B139B22514A08798E3404DDEF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7EDEE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3DC2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F83655D23DCA3AD961C62F356208552BB9ED529077096966D670C354E4ABC9804F1746C08CA18217C32905E462E36CE3BE39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9DE2BCBF6955817183995497CEA956AE515D2261898FA051015728E5A8AACAA68FFFFFFFFFFFFFFFF";
   public static long GROUP_14_GENERATOR = 2;
    
    private static CryptoUtils instance;
    
    
    private CryptoUtils() {
        
    }
    
    public static CryptoUtils getInstance() {
        
        if (instance == null) {
            instance = new CryptoUtils();
        }
        
        return instance;
        
    }
    
    public String computeSharedKey(String privateKey, String publicKey) {
        
        BigInteger p = new BigInteger(GROUP_14_PRIME, 16);
        BigInteger priv = new BigInteger(privateKey, 16);
        BigInteger pub = new BigInteger(publicKey, 16);
        
        BigInteger shared = pub.modPow(priv, p);
       
        return shared.toString(16);
       
    }
    
    
    public BigInteger randomBigInt(BigInteger len) {
        
        SecureRandom rnd = new SecureRandom();
        
        byte[] val = new byte[len.toByteArray().length];

        rnd.nextBytes(val);
        
        BigInteger result;
        
        do {
            rnd.nextBytes(val);
            result = new BigInteger(val);
            if (result.compareTo(BigInteger.ZERO) < 0) {
                result = result.negate();
            }
        } while (result.compareTo(len) > -1);
        
        return result;
        
    }
    
    public DiffieHellmanKey generateDiffieHellmanKeys() {
        
        DiffieHellmanKey key = new DiffieHellmanKey();
        
        BigInteger p = new BigInteger(GROUP_14_PRIME, 16);
        BigInteger g = BigInteger.valueOf(GROUP_14_GENERATOR);
        
        BigInteger privateKey = randomBigInt(p);
        
        BigInteger publicKey = g.modPow(privateKey, p);
        
        key.setPrivateKey(privateKey.toString(16));
        key.setPublicKey(publicKey.toString(16));
        
        return key;
        
    }

}
