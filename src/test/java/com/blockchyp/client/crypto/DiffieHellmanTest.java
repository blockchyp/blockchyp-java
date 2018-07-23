package com.blockchyp.client.crypto;



import org.junit.Assert;
import org.junit.Test;

public class DiffieHellmanTest {
    
    
    @Test
    public void testDiffieHellmanLifeCycle() {
        
        DiffieHellmanKey key1 = CryptoUtils.getInstance().generateDiffieHellmanKeys();
        DiffieHellmanKey key2 = CryptoUtils.getInstance().generateDiffieHellmanKeys();

        Assert.assertNotNull(key1);
        Assert.assertNotNull(key1.getPrivateKey());
        Assert.assertNotNull(key1.getPublicKey());
        Assert.assertNotNull(key2);
        Assert.assertNotNull(key2.getPrivateKey());
        Assert.assertNotNull(key2.getPublicKey());
        
        System.out.println("Public Key 1: " + key1.getPublicKey());
        System.out.println("Public Key 2: " + key2.getPublicKey());
        
        System.out.println("Private Key 1: " + key1.getPrivateKey());
        System.out.println("Private Key 2: " + key2.getPrivateKey());
        
        String shared1 = CryptoUtils.getInstance().computeSharedKey(key1.getPrivateKey(), key2.getPublicKey());
        String shared2 = CryptoUtils.getInstance().computeSharedKey(key2.getPrivateKey(), key1.getPublicKey());

        System.out.println("Shared Key 1: " + shared1);
        System.out.println("Shared Key 2: " + shared2);
        
        Assert.assertEquals(shared1, shared2);
        
        String plainText = "The quick brown fox jumped over the lazy dog.";
        
        String cipherText = CryptoUtils.getInstance().encrypt(plainText, shared1);
        
        System.out.println("Cipher: " + cipherText);
        
        String decryptedPlainText = CryptoUtils.getInstance().decrypt(cipherText, shared2);
        
        
        Assert.assertEquals(plainText, decryptedPlainText);

    }

}
