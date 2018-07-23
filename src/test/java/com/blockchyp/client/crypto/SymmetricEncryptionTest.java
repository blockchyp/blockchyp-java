package com.blockchyp.client.crypto;

import org.junit.Test;

import org.junit.Assert;

public class SymmetricEncryptionTest {

    
    @Test
    public void testAESDecryption() {
        
        String key = "7ef938ebbd24808f800bb368a4b97ba7";
        String cipherText = "14b4e146a46ca9581d0900590b5d4bb9b945e7d3574834d239e9a695bc4ad5a7a7d05bc0e677f34cb8f125844b82a58c40ce2d1b07d44efe5a87a2dfc9cdd6d4";
        String expectedText = "The quick brown fox jumped over the lazy dog.";
        
        String plainText = CryptoUtils.getInstance().decrypt(cipherText, key);
        
        Assert.assertEquals(plainText, expectedText);
        
    }

}
