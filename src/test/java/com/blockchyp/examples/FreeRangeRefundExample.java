package com.blockchyp.examples;

import org.springframework.beans.factory.annotation.Autowired;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationResponse;
import com.blockchyp.client.dto.RefundRequest;

public class FreeRangeRefundExample {

    @Autowired
    private BlockChypClient blockchypClient;

    public void capture(String terminalName, String amount) throws Exception {

        RefundRequest request = new RefundRequest();
        request.setTransactionRef("your own refund id");
        request.setTerminalName("Test Terminal");
        request.setAmount("55.00");

        AuthorizationResponse response = blockchypClient.refund(request);

        if (response.isApproved()) {
            System.out.println("Approved!");
        }

    }

}
