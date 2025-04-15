/**
 * Copyright 2019-2025 BlockChyp, Inc. All rights reserved. Use of this code is governed
 * by a license that can be found in the LICENSE file.
 *
 * This file was generated automatically by the BlockChyp SDK Generator. Changes to this
 * file will be lost every time the code is regenerated.
 */

package com.blockchyp.client.itest;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.IntegrationTest;
import com.blockchyp.client.IntegrationTestConfiguration;
import com.blockchyp.client.dto.SubmitApplicationRequest;
import com.blockchyp.client.dto.Acknowledgement;
import com.blockchyp.client.dto.Address;
import com.blockchyp.client.dto.Owner;
import com.blockchyp.client.dto.ApplicationAccount;

public class SubmitApplicationTest extends BaseTestCase {

    @Test
    @Category(IntegrationTest.class)
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public void testEndpoint() throws Exception {

        BlockChypClient client = IntegrationTestConfiguration.getTestClient("partner");

        
        // Set request parameters
        SubmitApplicationRequest request = new SubmitApplicationRequest();
        request.setTest(true);
        request.setInviteCode("asdf");
        request.setDbaName("BlockChyp");
        request.setCorporateName("BlockChyp Inc.");
        request.setWebSite("https://www.blockchyp.com");
        request.setTaxIdNumber("123456789");
        request.setEntityType("CORPORATION");
        request.setStateOfIncorporation("UT");
        request.setMerchantType("RETAIL");
        request.setBusinessDescription("Payment processing solutions");
        request.setYearsInBusiness("5");
        request.setBusinessPhoneNumber("5555551234");

        Address physicalAddress = new Address();
        physicalAddress.setAddress1("355 S 520 W");
        physicalAddress.setCity("Lindon");
        physicalAddress.setStateOrProvince("UT");
        physicalAddress.setPostalCode("84042");
        physicalAddress.setCountryCode("US");
        request.setPhysicalAddress(physicalAddress);

        Address mailingAddress = new Address();
        mailingAddress.setAddress1("355 S 520 W");
        mailingAddress.setCity("Lindon");
        mailingAddress.setStateOrProvince("UT");
        mailingAddress.setPostalCode("84042");
        mailingAddress.setCountryCode("US");
        request.setMailingAddress(mailingAddress);
        request.setContactFirstName("John");
        request.setContactLastName("Doe");
        request.setContactPhoneNumber("5555555678");
        request.setContactEmail("john.doe@example.com");
        request.setContactTitle("CEO");
        request.setContactTaxIdNumber("987654321");
        request.setContactDob("1980-01-01");
        request.setContactDlNumber("D1234567");
        request.setContactDlStateOrProvince("NY");
        request.setContactDlExpiration("2025-12-31");

        Address contactHomeAddress = new Address();
        contactHomeAddress.setAddress1("355 S 520 W");
        contactHomeAddress.setCity("Lindon");
        contactHomeAddress.setStateOrProvince("UT");
        contactHomeAddress.setPostalCode("84042");
        contactHomeAddress.setCountryCode("US");
        request.setContactHomeAddress(contactHomeAddress);
        request.setContactRole("OWNER");

        Collection owners = new ArrayList();
        Owner owners0 = new Owner();
        owners0.setFirstName("John");
        owners0.setLastName("Doe");
        owners0.setJobTitle("CEO");
        owners0.setTaxIdNumber("876543210");
        owners0.setPhoneNumber("5555559876");
        owners0.setDob("1981-02-02");
        owners0.setOwnership("50");
        owners0.setEmail("john.doe@example.com");
        owners0.setDlNumber("D7654321");
        owners0.setDlStateOrProvince("UT");
        owners0.setDlExpiration("2024-12-31");

        Address address = new Address();
        address.setAddress1("355 S 520 W");
        address.setCity("Lindon");
        address.setStateOrProvince("UT");
        address.setPostalCode("84042");
        address.setCountryCode("US");
        owners0.setAddress(address);
        owners.add(owners0);
        request.setOwners(owners);

        ApplicationAccount manualAccount = new ApplicationAccount();
        manualAccount.setName("Business Checking");
        manualAccount.setBank("Test Bank");
        manualAccount.setAccountHolderName("BlockChyp Inc.");
        manualAccount.setRoutingNumber("124001545");
        manualAccount.setAccountNumber("987654321");
        request.setManualAccount(manualAccount);
        request.setAverageTransaction("100.00");
        request.setHighTransaction("1000.00");
        request.setAverageMonth("10000.00");
        request.setHighMonth("20000.00");
        request.setRefundPolicy("30_DAYS");
        request.setRefundDays("30");
        request.setTimeZone("America/Denver");
        request.setBatchCloseTime("23:59");
        request.setMultipleLocations("false");
        request.setEbtRequested("false");
        request.setEcommerce("true");
        request.setCardPresentPercentage("70");
        request.setPhoneOrderPercentage("10");
        request.setEcomPercentage("20");
        request.setSignerName("John Doe");

        Exception ex = null;
        try {
            Acknowledgement response = client.submitApplication(request);
            // Response assertions
            Assert.assertTrue(response.isSuccess());
        } catch (Exception e) {
            ex = e;
        }

    Assert.assertNull(ex);
    }

}
