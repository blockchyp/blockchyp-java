package com.blockchyp.client.crypto;

import org.junit.Assert;
import org.junit.Test;

public class EllipticCurveTest {
    
    
    @Test
    public void testECDSA() {
        
        String msg = "f181167e704a9d06d66a2299b67882da7133d120c789e57d44041fa2a84ccad805a9f64788a905ac8734b990552c19070e18c09363b832680594b9aaa1dfc987179225d3cea9c8086aeaa04b3f72eb9fcf674dc6efd7ce158628b274677f0164beaf9eb0f54283b3fb7e592118db27069e231d1e4a3a500784ed123931db8240b7bbb99618b78348491bebe370b7850c459fb5390fb126b58c2212729d1e35c99880ca68e066949f03e6e56e261d15892828eddf250120e336a3580b5158ab32f5415bfce9ebeec70ef1e7bc8f50eec349d2175b9ec7dc4b6dfdc2201f4a55edf8becb860419871732c994e829caf7793ed695ca094a9154cb343659269addcf";

        EllipticCurvePublicKey publicKey = new EllipticCurvePublicKey();
        publicKey.setCurve("P256");
        publicKey.setX("19df5428dd9910f6ab782f93f7f6510c3586b388645a4c32949648808a942a6a");
        publicKey.setY("9271bc89d32269918a9dcadc7a9d1f9fb74c8694526457256216cf004bef75b5");
        
        EllipticCurveSignature expectedSig = new EllipticCurveSignature();
        expectedSig.setCurve("P256");
        expectedSig.setR("d87c63c63d91dd0a316c93a78a758ff38079082d7b57122bc6885ddff13ac641");
        expectedSig.setS("5f2e0ff997ffa5508bcf4168c0ae61e453a8a93c54e9b2634c2f4fedd7e64cca");
        

        boolean result = CryptoUtils.getInstance().validateECDSA(msg, publicKey, expectedSig);
        
        Assert.assertTrue(result);
        
        
    }

}
