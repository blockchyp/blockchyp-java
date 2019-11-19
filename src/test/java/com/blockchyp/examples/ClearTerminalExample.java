package com.blockchyp.examples;

import org.springframework.beans.factory.annotation.Autowired;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.ClearTerminalRequest;

public class ClearTerminalExample {

    @Autowired
    private BlockChypClient blockchypClient;

    public void clear(String terminalName, String amount) throws Exception {

        ClearTerminalRequest request = new ClearTerminalRequest();
        request.setTerminalName("Test Terminal");

        Acknowledgement ack = blockchypClient.clear(request);

        if (ack.isSuccess()) {
            System.out.println("Terminal?  What terminal?");
        }

    }

}
