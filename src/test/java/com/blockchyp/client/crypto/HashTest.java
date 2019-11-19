package com.blockchyp.client.crypto;

import org.junit.Test;

import org.junit.Assert;

public class HashTest {


    @Test
    public void testSHA256() {


        String msg = "f181167e704a9d06d66a2299b67882da7133d120c789e57d44041fa2a84ccad805a9f64788a905ac8734b990552c19070e18c09363b832680594b9aaa1dfc987179225d3cea9c8086aeaa04b3f72eb9fcf674dc6efd7ce158628b274677f0164beaf9eb0f54283b3fb7e592118db27069e231d1e4a3a500784ed123931db8240b7bbb99618b78348491bebe370b7850c459fb5390fb126b58c2212729d1e35c99880ca68e066949f03e6e56e261d15892828eddf250120e336a3580b5158ab32f5415bfce9ebeec70ef1e7bc8f50eec349d2175b9ec7dc4b6dfdc2201f4a55edf8becb860419871732c994e829caf7793ed695ca094a9154cb343659269addcf";

        String expectedHash = "f04e71b08dd61a4b9b88e695f09e4688b1d54dd0930450b52444bcd961b6ec6d";

        String actualHash = CryptoUtils.getInstance().computeSHA256(msg);

        Assert.assertEquals(expectedHash, actualHash);


    }

}
