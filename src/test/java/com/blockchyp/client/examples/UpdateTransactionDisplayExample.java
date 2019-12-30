package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.TransactionDisplayRequest;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.TransactionDisplayTransaction;
import com.blockchyp.client.dto.TransactionDisplayItem;
import com.blockchyp.client.dto.TransactionDisplayDiscount;


public class UpdateTransactionDisplayExample {

    public void runSampleTransaction() throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey("ZDSMMZLGRPBPRTJUBTAFBYZ33Q");
        creds.setBearerToken("ZLBW5NR4U5PKD5PNP3ZP3OZS5U");
        creds.setSigningKey("9c6a5e8e763df1c9256e3d72bd7f53dfbd07312938131c75b3bfd254da787947");

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        TransactionDisplayRequest request = new TransactionDisplayRequest();
        request.setTest(true);
        request.setTerminalName("Test Terminal");
        request.setTransaction(newTransactionDisplayTransaction());

        Acknowledgement response = client.updateTransactionDisplay(request);

        //process the result

        if (response.isSuccess()) {
            System.out.println("Succeded");
        }

    }

    private TransactionDisplayTransaction newTransactionDisplayTransaction() {
         TransactionDisplayTransaction val = new TransactionDisplayTransaction();
         val.setSubtotal("60.00");
         val.setTax("5.00");
         val.setTotal("65.00");
         val.setItems(newTransactionDisplayItems());
         return val;
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private Collection newTransactionDisplayItems() {
         Collection results = new ArrayList();
         results.add(newTransactionDisplayItem2());
         return results;
    }
    private TransactionDisplayItem newTransactionDisplayItem2() {
         TransactionDisplayItem val = new TransactionDisplayItem();
         val.setDescription("Leki Trekking Poles");
         val.setPrice("35.00");
         val.setQuantity(2);
         val.setExtended("70.00");
         val.setDiscounts(newTransactionDisplayDiscounts());
         return val;
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
    private Collection newTransactionDisplayDiscounts() {
         Collection results = new ArrayList();
         results.add(newTransactionDisplayDiscount2());
         return results;
    }
    private TransactionDisplayDiscount newTransactionDisplayDiscount2() {
         TransactionDisplayDiscount val = new TransactionDisplayDiscount();
         val.setDescription("memberDiscount");
         val.setAmount("10.00");
         return val;
    }

}
