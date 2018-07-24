package com.blockchyp.client.crypto;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.security.Security;
import java.security.spec.AlgorithmParameterSpec;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.ArrayUtils;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.signers.ECDSASigner;
import org.bouncycastle.jce.ECNamedCurveTable;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECNamedCurveParameterSpec;
import org.bouncycastle.math.ec.ECCurve;

public class CryptoUtils {
    
   public static String GROUP_14_PRIME = "FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD129024E088A67CC74020BBEA63B139B22514A08798E3404DDEF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7EDEE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3DC2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F83655D23DCA3AD961C62F356208552BB9ED529077096966D670C354E4ABC9804F1746C08CA18217C32905E462E36CE3BE39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9DE2BCBF6955817183995497CEA956AE515D2261898FA051015728E5A8AACAA68FFFFFFFFFFFFFFFF";
   public static long GROUP_14_GENERATOR = 2;
    
    private static CryptoUtils instance;
    
    private SecureRandom rand;
    
    
    private CryptoUtils() {
        rand = new SecureRandom();
        Security.addProvider(new BouncyCastleProvider());  
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
    
    public boolean validateECDSA(String hexMsg, EllipticCurvePublicKey pk, EllipticCurveSignature sig) {
        
        try {
            
            ECNamedCurveParameterSpec params = ECNamedCurveTable.getParameterSpec("P-256");
            ECCurve curve = params.getCurve();
           
            ECPublicKeyParameters keyParams = new ECPublicKeyParameters(
                    curve.createPoint(
                            new BigInteger(pk.getX(), 16), 
                            new BigInteger(pk.getY(), 16)), 
                    new ECDomainParameters(curve, params.getG(), params.getN()));
            
            ECDSASigner signer = new ECDSASigner();
            signer.init(false, keyParams);
            
            byte[] hash = DigestUtils.sha256(Hex.decodeHex(hexMsg));
            
            return signer.verifySignature(hash, new BigInteger(sig.getR(), 16), new BigInteger(sig.getS(), 16));                
            
            
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }
    
    public String computeSharedKey(String privateKey, String publicKey) {
        
        BigInteger p = new BigInteger(GROUP_14_PRIME, 16);
        BigInteger priv = new BigInteger(privateKey, 16);
        BigInteger pub = new BigInteger(publicKey, 16);
        
        BigInteger shared = pub.modPow(priv, p);
        
        //convert to the proper key size
        return Hex.encodeHexString(ArrayUtils.subarray(shared.toByteArray(), 0, 16));
       
    }
    
    public byte[] randomBytes(int len) {
        
        byte[] results = new byte[len];
        
        rand.nextBytes(results);
        
        return results;
        
    }
    
    
    public BigInteger randomBigInt(BigInteger len) {
        
        
        byte[] val = new byte[len.toByteArray().length];

        rand.nextBytes(val);
        
        BigInteger result;
        
        do {
            rand.nextBytes(val);
            result = new BigInteger(val);
            if (result.compareTo(BigInteger.ZERO) < 0) {
                result = result.negate();
            }
        } while (result.compareTo(len) > -1);
        
        return result;
        
    }
    
    public String encrypt(String plainText, String key) {

        try {

            byte[] iv = randomBytes(16);
            byte[] rawKey = Hex.decodeHex(key);
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding", "BC");
            SecretKeySpec secretKeySpec = new SecretKeySpec(rawKey, "AES");
            AlgorithmParameterSpec paramSpec = new IvParameterSpec(iv);
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec, paramSpec);

            byte[] cipherText = cipher.doFinal(plainText.getBytes());
            byte[] results = ArrayUtils.addAll(iv, cipherText);
            return Hex.encodeHexString(results);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    public String decrypt(String cipherText, String key) {
        
        try {
        
            byte[] fullCipher = Hex.decodeHex(cipherText);
            byte[] rawKey = Hex.decodeHex(key);
            byte[] iv = ArrayUtils.subarray(fullCipher, 0, 16);
            byte[] baseCipher = ArrayUtils.subarray(fullCipher, 16, fullCipher.length);
            
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding", "BC");
            SecretKeySpec secretKeySpec = new SecretKeySpec(rawKey, "AES");
            AlgorithmParameterSpec paramSpec = new IvParameterSpec(iv);
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec, paramSpec);

            byte[] plainBytes = cipher.doFinal(baseCipher);
            return new String(plainBytes);
            
        
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        
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
