package com.blockchyp.client.itest;

import java.util.UUID;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.MessageRequest;

import org.junit.Assert;

/**
 * Base test case for integration tests.  A place to hang reusable logic for tests.
 * 
 * @author jeffreydpayne
 *
 */
public abstract class BaseTestCase {
	
    protected String getUUID() {
    	
    	return UUID.randomUUID().toString();
    	
    }
    
    protected void processTestDelay(BlockChypClient client, String testName, String terminalName) {
    	
    	String testDelay = System.getenv("BC_TEST_DELAY");
    	
    	if (testDelay == null) {
    		testDelay = "2";
    	}
    	
		try {
    			
    		MessageRequest request = new MessageRequest();
    		request.setTerminalName(terminalName);
    		request.setTest(true);
    		request.setMessage("Running " + testName + " in " + testDelay + " seconds...");
		
			Acknowledgement ack = client.message(request);
			Assert.assertTrue(ack.isSuccess());
			
			int testDelayInt = Integer.parseInt(testDelay);
    		Thread.sleep(testDelayInt * 1000);
		} catch (Exception e) {
			Assert.fail(e.getLocalizedMessage());
		}
    	
    }
    
}
