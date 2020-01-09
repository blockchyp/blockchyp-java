# BlockChyp Java SDK

[![Build Status](https://circleci.com/gh/blockchyp/blockchyp-java/tree/master.svg?style=shield)](https://circleci.com/gh/blockchyp/blockchyp-java/tree/master)
[![Maven Central](https://img.shields.io/maven-central/v/com.blockchyp/blockchyp-java.svg)](https://search.maven.org/artifact/com.blockchyp/blockchyp-java)
[![Javadocs](https://img.shields.io/badge/javadocs-latest-blueviolet)](https://docs.blockchyp.com/sdks/java/latest/index.html)
[![License: MIT](https://img.shields.io/badge/license-MIT-blue.svg)](https://github.com/blockchyp/blockchyp-java/blob/master/LICENSE)

This is the recommended means for Java developers to access the BlockChyp gateway and BlockChyp terminals.
This SDK was designed to be compatible with the broadest possible range of Java point-of-sale systems. We've
avoided some of the newer Java features we love like streams and generics in order to maintain compatibility
all the way back to Java 1.6.

We've tried to avoid introducing classpath problems for you whenever possible. HTTP interaction is done using
commons-httpclient-3.1 and we also use commons-lang, commons-io, and commons-codec. We're using the Bouncy Castle
JCE provider for encryption services, but we don't use any Bouncy Castle specific classes so if you exclude this
dependency you should still be fine with the standard Java stuff.


## Getting the SDK

There are several techniques for getting your hands on the SDK. Most developers use a dependency management system like
Maven.

#### Maven

The BlockChyp SDK is in Maven's Central Repository. Just add this snippet to your pom:

```
	<dependency>
	    <groupId>com.blockchyp</groupId>
	    <artifactId>blockchyp-java</artifactId>
	    <version>1.0.0</version>
	</dependency>
```

#### Gradle

For the hipsters among you who've moved up to Gradle, try adding this snippet under dependencies in your Gradle build file.

```
	compile group: 'com.blockchyp', name: 'blockchyp-java', version:'1.0.0'
```

You'll also need the Maven plugin turned on. Make sure your Gradle build has something like this in it:

```
	apply plugin: 'maven'
```

#### Building From Source

The BlockChyp SDK has a pretty conventional Maven build with a single pom.xml and no weird repository dependencies. Just clone this repository
and run `mvn package` to build a jar.

#### Download a Jar

We strongly recommend you get BlockChyp from the Maven repository, but just in case you want a jar, you can download one right here on
Github from releases.


## Using the SDK

Once the BlockChyp SDK is in your classpath, you can start using it to run transactions. All interaction with BlockChyp is done via the BlockChypClient class.

Just instantiate the BlockChypClient class, add your credentials and start charging. Here's an example..

```
package com.blockchyp.examples;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.APICredentials;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;

public class HelloBlockChyp {


    public static void main(String[] args) throws Exception {


        APICredentials creds = new APICredentials("APIKEY", "BEARER TOKEN", "SIGNING_KEY");

        BlockChypClient client = new BlockChypClient(creds);

        AuthorizationRequest request = new AuthorizationRequest();
        request.setTerminalName("Test Terminal");
        request.setAmount("50.00");


        AuthorizationResponse response = client.charge(request);

        if (response.isApproved()) {
            System.out.println("Approved!  Auth Code: " + response.getAuthCode());
        }


    }

}
```

The above code is sufficient for running a basic charge transaction against a terminal. You don't need to keep track of terminal IP addresses or anything like that.
Our terminal routing system, which is essentially a DNS system for payment terminals on private networks, handles everything for you.

#### What About Spring?

Don't worry. We've got you covered. The BlockChypClient was designed to be easy to use with Spring or other dependency injection frameworks. We're former Spring developers ourselves.

If you're still using XML based configuration for Spring, you'll need a snippet like this...

```
<?xml version = "1.0" encoding = "UTF-8"?>

<beans xmlns = "http://www.springframework.org/schema/beans"
   xmlns:xsi = "http://www.w3.org/2001/XMLSchema-instance"
   xsi:schemaLocation = "http://www.springframework.org/schema/beans
   http://www.springframework.org/schema/beans/spring-beans-3.0.xsd">


   <bean id="blockchypCredentials" class="com.blockchyp.client.dto.APICredentials">
      <property name="apiKey" value="API_KEY_VALUE"/>
      <property name="bearerToken" value="BEARER_TOKEN"/>
      <property name="signingKey" value="SIGNING_KEY"/>
   </bean>

   <bean id="blockchypClient" class="com.blockchyp.client.BlockChypClient">
      <property name="defaultCredentials" ref="blockchypCredentials"/>
   </bean>


   <bean id="blockchypSpringExample" class="com.blockchyp.examples.SpringExample">
      <property name="blockchypClient" ref="blockchypClient"/>
   </bean>


</beans>
```

This is pretty conventional Spring dependency injection. The example below shows the Java code behind the above example.
If you're autowiring wherever possible, you can probably leave out the last bean definition from the XML sample above.
Also note that APICredentials and BlockChypClient can also be initialized via constructors if you prefer constructor
based dependency injection.

```
package com.blockchyp.examples;

import org.springframework.beans.factory.annotation.Autowired;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;

public class SpringExample {

    @Autowired
    private BlockChypClient blockchypClient;

    public boolean charge(String terminalName, String amount) throws Exception {

        AuthorizationRequest request = new AuthorizationRequest();
        request.setTerminalName("Test Terminal");
        request.setAmount("50.00");


        AuthorizationResponse response = blockchypClient.charge(request);

        return response.isApproved();

    }

}
```

#### Spring Boot or Configuration Without XML

We get it. You're over XML. We think XML's been unfairly maligned as a format for configuration, but we know we can't fight progress
and we've stopped using it too.

Here's an example of how to do all of the above without XML.

```
package com.blockchyp.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.APICredentials;

@Configuration
public class SpringConfigExample {

    @Bean
    public APICredentials blockchypCredentials() {
        return new APICredentials("APIKEY", "BEARER TOKEN", "SIGNING_KEY");
    }

    @Bean
    public BlockChypClient blockchypClient() {
        return new BlockChypClient(blockchypCredentials());
    }

}
```

## SSL/TLS Configuration

We designed this SDK to work out of the box with no special configuration for those developers who never read this
(most developers, we assume), but there are a few recommended best practices for production use.

By default, the Java SDK communicates with terminals without SSL or TLS. (Gateway communication is always TLS.)  The reason for
this is that BlockChyp terminals
run on private networks where the standard root certificate authorities cannot be used and it's difficult, if not impossible,
to add new root CA's in Java programmatically. We recommend you install our terminal root CA as a trusted CA and turn
https on in your client. In order to provide some extra protection in situations where developers choose not to do this,
the SDK uses transient credentials when communicating with terminals in order to prevent exposing real merchant credentials.


##### BlockChyp Root Certificate For Private Terminal Networks:
```
-----BEGIN CERTIFICATE-----
MIIFAjCCAuqgAwIBAgIBATANBgkqhkiG9w0BAQsFADAgMR4wHAYDVQQDDBVCbG9j
a0NoeXAgSW50ZXJuYWwgQ0EwIBcNMTgwMTAxMDAwMDA4WhgPNDc1NTExMjkwMDAw
MDhaMCAxHjAcBgNVBAMMFUJsb2NrQ2h5cCBJbnRlcm5hbCBDQTCCAiIwDQYJKoZI
hvcNAQEBBQADggIPADCCAgoCggIBANyWuVhDiqeCrHMxbTv5PN5UOZdR8n4PPwUV
z0dALnLS7Lkl9nnuBxUK5XFGsZHBQ3GqSsWgA0HBUAAkKY/hzDIY+mrKOTMFMhoF
SKmcNwmdt+NXuUtYwL5STsr1U/XnxcizsSEHcGP5LhIH16AY0XYMVzNTBXrylH7O
Hf/pPJaVbuywAkiyrEV+lTo1mVTOCucGoNRPogluuyfbBCUH9bWBajbjHWdyiX58
IV786JWkw5ogLXgDekrrzdVxQH1t2kN2PvXNHGOBlB0NL/QwKHxfbvgIu6EkyEXv
vSuFclgaM3x38zcEaIS8id/wZYkwZXAqquR5Hi5fqPILC1xmRF+zC1GH1uJ+gsQu
wqwaiwmD9Rcbm2ZOSVntQy5bCF7IzPlMHzMlt33dF9mZo9bJwFO1APdpeWy+Ooga
n1k/yS2EPnkAv+DiRpNf2it6n86+X7Z4C6QGgP5+rfc53uxeaF8gPLgXViaHHTZD
NflxaNjgKD0xAwB3Yhca8RQSjRPwKYk1FrbhTSAIidnwmA4jrV7juZ2RSWA99VzR
O68OmE/7NygxGgo995pPc+s6DO6IOnZvT2tSs0b2UmEKT51/cf93lv+phX/69hTC
ctMEYoIGNRAvcISA0lfTWHAbiRzMyagtuiRMttS7C+IshsgBrjHSHMsEYj8RhRnR
0FvmChUNAgMBAAGjRTBDMB0GA1UdDgQWBBSBl1rnpf7Omve8fXPl9EltnlcqGTAS
BgNVHRMBAf8ECDAGAQH/AgEBMA4GA1UdDwEB/wQEAwIBBjANBgkqhkiG9w0BAQsF
AAOCAgEAkt9ywLJvM0TjEUjlC32niE8mNIPX5azHJ0++PlZ2Fc7ZKy4nntt2YErl
l4qEOB8ED2VaLQuxx0O9H2oh1QsMuxT3rQ4SDNmQVH9vUYJWgIkYjY1zKubEyktv
oZyi8xK5e0/ME//vU0ru6y0dmcFtDvpwm/JZPjoVKHK58JpCKH8xhVxQo7NxAIf8
Ow+fr58plDQP1CbfjO1gJpFg7lQ282rz9n0Ju2mXm3guclcx74mDJGlzGLGCJCnu
Qxta8Dv/Cg8+kNM36boORMChaoAgIerXL17EhyUh3ZsSaxEchqvCWtLv1+ekhGpF
A08xS33r1GgQV/cyunuz3czQ0Y/7UjKluo6sbS0RmVtAWJA/DhwXgQlHlFyROmhG
pcKXeLc7+LrBZxITVuQk8Mg9aceAnzBqjeTjQNPQJkOwqIFgDUXNNqvA5mhn/j25
u8CcDY/0p5C4tFQc1npgQwJZAwRGEvFmXVDgEZ8FFkzhn74oxI99Xs1HGc9zO/uP
GV0cahaj9xspMPMBe5Q2mNhVca6+RIZPSIcVbsgYy+2QDBep7NpraQgG7V0f2XTu
uLBaPXbY9PZLFklSSZOLXAuuOk0G57lfyVFRNAZ2R3uQdkDpx90Ti6PDWj9M6x1p
jD1XNpXvgH2k91jjsK67khN+4bWoFBsfrMYt6vgjtXyv0kf12y0=
-----END CERTIFICATE-----
```



## The Rest APIs

All BlockChyp SDKs provide a convenient way of accessing the BlockChyp REST APIs.
You can checkout the REST API documentation via the links below.

[Terminal REST API Docs](https://docs.blockchyp.com/rest-api/terminal/index.html)

[Gateway REST API Docs](https://docs.blockchyp.com/rest-api/gateway/index.html)

## Other SDKs

BlockChyp has officially supported SDKs for eight different development platforms and counting.
Here's the full list with links to their GitHub repositories.

[Go SDK](https://github.com/blockchyp/blockchyp-go)

[Node.js/JavaScript SDK](https://github.com/blockchyp/blockchyp-js)

[Java SDK](https://github.com/blockchyp/blockchyp-java)

[.net/C# SDK](https://github.com/blockchyp/blockchyp-csharp)

[Ruby SDK](https://github.com/blockchyp/blockchyp-ruby)

[PHP SDK](https://github.com/blockchyp/blockchyp-php)

[Python SDK](https://github.com/blockchyp/blockchyp-python)

[iOS (Objective-C/Swift) SDK](https://github.com/blockchyp/blockchyp-ios)

## Getting a Developer Kit

In order to test your integration with real terminals, you'll need a BlockChyp
Developer Kit. Our kits include a fully functioning payment terminal with
test pin encryption keys. Every kit includes a comprehensive set of test
cards with test cards for every major card brand and entry method, including
Contactless and Contact EMV and mag stripe cards. Each kit also includes
test gift cards for our blockchain gift card system.

Access to BlockChyp's developer program is currently invite only, but you
can request an invitation by contacting our engineering team at **nerds@blockchyp.com**.

You can also view a number of long form demos and learn more about us on our [YouTube Channel](https://www.youtube.com/channel/UCE-iIVlJic_XArs_U65ZcJg).

## Transaction Code Examples

You don't want to read words. You want examples. Here's a quick rundown of the
stuff you can do with the BlockChyp Java SDK and a few basic examples.

#### Charge

Executes a standard direct preauth and capture.

```java
package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;


public class ChargeExample {

    public void runSampleTransaction() throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey("ZDSMMZLGRPBPRTJUBTAFBYZ33Q");
        creds.setBearerToken("ZLBW5NR4U5PKD5PNP3ZP3OZS5U");
        creds.setSigningKey("9c6a5e8e763df1c9256e3d72bd7f53dfbd07312938131c75b3bfd254da787947");

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        AuthorizationRequest request = new AuthorizationRequest();
        request.setTest(true);
        request.setTerminalName("Test Terminal");
        request.setAmount("55.00");

        AuthorizationResponse response = client.charge(request);

        //process the result

        if (response.isApproved()) {
            System.out.println("Approved");
        }

    System.out.println(response.getAuthCode());
    System.out.println(response.getAuthorizedAmount());
    }


}


```

#### Preauthorization

Executes a preauthorization intended to be captured later.

```java
package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;


public class PreauthExample {

    public void runSampleTransaction() throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey("ZDSMMZLGRPBPRTJUBTAFBYZ33Q");
        creds.setBearerToken("ZLBW5NR4U5PKD5PNP3ZP3OZS5U");
        creds.setSigningKey("9c6a5e8e763df1c9256e3d72bd7f53dfbd07312938131c75b3bfd254da787947");

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        AuthorizationRequest request = new AuthorizationRequest();
        request.setTest(true);
        request.setTerminalName("Test Terminal");
        request.setAmount("27.00");

        AuthorizationResponse response = client.preauth(request);

        //process the result

        if (response.isApproved()) {
            System.out.println("Approved");
        }

    System.out.println(response.getAuthCode());
    System.out.println(response.getAuthorizedAmount());
    }


}


```

#### Terminal Ping

Tests connectivity with a payment terminal.

```java
package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.PingRequest;
import com.blockchyp.client.dto.PingResponse;


public class PingExample {

    public void runSampleTransaction() throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey("ZDSMMZLGRPBPRTJUBTAFBYZ33Q");
        creds.setBearerToken("ZLBW5NR4U5PKD5PNP3ZP3OZS5U");
        creds.setSigningKey("9c6a5e8e763df1c9256e3d72bd7f53dfbd07312938131c75b3bfd254da787947");

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        PingRequest request = new PingRequest();
        request.setTerminalName("Test Terminal");

        PingResponse response = client.ping(request);

        //process the result

        if (response.isSuccess()) {
            System.out.println("Success");
        }

    }


}


```

#### Balance

Checks the remaining balance on a payment method.

```java
package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.BalanceRequest;
import com.blockchyp.client.dto.BalanceResponse;
import com.blockchyp.client.dto.CardType;


public class BalanceExample {

    public void runSampleTransaction() throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey("ZDSMMZLGRPBPRTJUBTAFBYZ33Q");
        creds.setBearerToken("ZLBW5NR4U5PKD5PNP3ZP3OZS5U");
        creds.setSigningKey("9c6a5e8e763df1c9256e3d72bd7f53dfbd07312938131c75b3bfd254da787947");

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        BalanceRequest request = new BalanceRequest();
        request.setTest(true);
        request.setTerminalName("Test Terminal");
        request.setCardType(CardType.EBT);

        BalanceResponse response = client.balance(request);

        //process the result

        if (response.isSuccess()) {
            System.out.println("Success");
        }

    }


}


```

#### Terminal Clear

Clears the line item display and any in progress transaction.

```java
package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.ClearTerminalRequest;
import com.blockchyp.client.dto.Acknowledgement;


public class ClearExample {

    public void runSampleTransaction() throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey("ZDSMMZLGRPBPRTJUBTAFBYZ33Q");
        creds.setBearerToken("ZLBW5NR4U5PKD5PNP3ZP3OZS5U");
        creds.setSigningKey("9c6a5e8e763df1c9256e3d72bd7f53dfbd07312938131c75b3bfd254da787947");

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        ClearTerminalRequest request = new ClearTerminalRequest();
        request.setTest(true);
        request.setTerminalName("Test Terminal");

        Acknowledgement response = client.clear(request);

        //process the result

        if (response.isSuccess()) {
            System.out.println("Success");
        }

    }


}


```

#### Terms & Conditions Capture

Prompts the user to accept terms and conditions.

```java
package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.TermsAndConditionsRequest;
import com.blockchyp.client.dto.TermsAndConditionsResponse;
import com.blockchyp.client.dto.SignatureFormat;


public class TermsAndConditionsExample {

    public void runSampleTransaction() throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey("ZDSMMZLGRPBPRTJUBTAFBYZ33Q");
        creds.setBearerToken("ZLBW5NR4U5PKD5PNP3ZP3OZS5U");
        creds.setSigningKey("9c6a5e8e763df1c9256e3d72bd7f53dfbd07312938131c75b3bfd254da787947");

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        TermsAndConditionsRequest request = new TermsAndConditionsRequest();
        request.setTest(true);
        request.setTerminalName("Test Terminal");
        request.setTcAlias("hippa"); // Alias for a Terms and Conditions template configured in the BlockChyp dashboard.
        request.setTcName("HIPPA Disclosure"); // Name of the contract or document if not using an alias.
        request.setTcContent("Full contract text"); // Full text of the contract or disclosure if not using an alias.
        request.setSigFormat(SignatureFormat.PNG); // file format for the signature image.
        request.setSigWidth(200); // width of the signature image in pixels.
        request.setSigRequired(true); // Whether or not a signature is required. Defaults to true.

        TermsAndConditionsResponse response = client.termsAndConditions(request);

        //process the result

        if (response.isSuccess()) {
            System.out.println("Success");
        }

    System.out.println(response.getSig());
    System.out.println(response.getSigFile());
    }


}


```

#### Update Transaction Display

Appends items to an existing transaction display Subtotal, Tax, and Total are
overwritten by the request. Items with the same description are combined into
groups.

```java
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
            System.out.println("Success");
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


```

#### New Transaction Display

Displays a new transaction on the terminal.

```java
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


public class NewTransactionDisplayExample {

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

        Acknowledgement response = client.newTransactionDisplay(request);

        //process the result

        if (response.isSuccess()) {
            System.out.println("Success");
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


```

#### Text Prompt

Asks the consumer text based question.

```java
package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.TextPromptRequest;
import com.blockchyp.client.dto.TextPromptResponse;
import com.blockchyp.client.dto.PromptType;


public class TextPromptExample {

    public void runSampleTransaction() throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey("ZDSMMZLGRPBPRTJUBTAFBYZ33Q");
        creds.setBearerToken("ZLBW5NR4U5PKD5PNP3ZP3OZS5U");
        creds.setSigningKey("9c6a5e8e763df1c9256e3d72bd7f53dfbd07312938131c75b3bfd254da787947");

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        TextPromptRequest request = new TextPromptRequest();
        request.setTest(true);
        request.setTerminalName("Test Terminal");
        request.setPromptType(PromptType.EMAIL); // Type of prompt. Can be 'email', 'phone', 'customer-number', or 'rewards-number'.

        TextPromptResponse response = client.textPrompt(request);

        //process the result

        if (response.isSuccess()) {
            System.out.println("Success");
        }

    System.out.println(response.getResponse());
    }


}


```

#### Boolean Prompt

Asks the consumer a yes/no question.

```java
package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.BooleanPromptRequest;
import com.blockchyp.client.dto.BooleanPromptResponse;


public class BooleanPromptExample {

    public void runSampleTransaction() throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey("ZDSMMZLGRPBPRTJUBTAFBYZ33Q");
        creds.setBearerToken("ZLBW5NR4U5PKD5PNP3ZP3OZS5U");
        creds.setSigningKey("9c6a5e8e763df1c9256e3d72bd7f53dfbd07312938131c75b3bfd254da787947");

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        BooleanPromptRequest request = new BooleanPromptRequest();
        request.setTest(true);
        request.setTerminalName("Test Terminal");
        request.setPrompt("Would you like to become a member?");
        request.setYesCaption("Yes");
        request.setNoCaption("No");

        BooleanPromptResponse response = client.booleanPrompt(request);

        //process the result

        if (response.isSuccess()) {
            System.out.println("Success");
        }

    System.out.println(response.isResponse());
    }


}


```

#### Display Message

Displays a short message on the terminal.

```java
package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.MessageRequest;
import com.blockchyp.client.dto.Acknowledgement;


public class MessageExample {

    public void runSampleTransaction() throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey("ZDSMMZLGRPBPRTJUBTAFBYZ33Q");
        creds.setBearerToken("ZLBW5NR4U5PKD5PNP3ZP3OZS5U");
        creds.setSigningKey("9c6a5e8e763df1c9256e3d72bd7f53dfbd07312938131c75b3bfd254da787947");

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        MessageRequest request = new MessageRequest();
        request.setTest(true);
        request.setTerminalName("Test Terminal");
        request.setMessage("Thank you for your business.");

        Acknowledgement response = client.message(request);

        //process the result

        if (response.isSuccess()) {
            System.out.println("Success");
        }

    }


}


```

#### Refund

Executes a refund.

```java
package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.RefundRequest;
import com.blockchyp.client.dto.AuthorizationResponse;


public class RefundExample {

    public void runSampleTransaction() throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey("ZDSMMZLGRPBPRTJUBTAFBYZ33Q");
        creds.setBearerToken("ZLBW5NR4U5PKD5PNP3ZP3OZS5U");
        creds.setSigningKey("9c6a5e8e763df1c9256e3d72bd7f53dfbd07312938131c75b3bfd254da787947");

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        RefundRequest request = new RefundRequest();
        request.setTerminalName("Test Terminal");
        request.setTransactionId("<PREVIOUS TRANSACTION ID>");
        request.setAmount("5.00"); // Optional amount for partial refunds.

        AuthorizationResponse response = client.refund(request);

        //process the result

        if (response.isApproved()) {
            System.out.println("Approved");
        }

    }


}


```

#### Enroll

Adds a new payment method to the token vault.

```java
package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.EnrollRequest;
import com.blockchyp.client.dto.EnrollResponse;


public class EnrollExample {

    public void runSampleTransaction() throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey("ZDSMMZLGRPBPRTJUBTAFBYZ33Q");
        creds.setBearerToken("ZLBW5NR4U5PKD5PNP3ZP3OZS5U");
        creds.setSigningKey("9c6a5e8e763df1c9256e3d72bd7f53dfbd07312938131c75b3bfd254da787947");

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        EnrollRequest request = new EnrollRequest();
        request.setTest(true);
        request.setTerminalName("Test Terminal");

        EnrollResponse response = client.enroll(request);

        //process the result

        if (response.isApproved()) {
            System.out.println("Approved");
        }

    System.out.println(response.getToken());
    }


}


```

#### Gift Card Activation

Activates or recharges a gift card.

```java
package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.GiftActivateRequest;
import com.blockchyp.client.dto.GiftActivateResponse;


public class GiftActivateExample {

    public void runSampleTransaction() throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey("ZDSMMZLGRPBPRTJUBTAFBYZ33Q");
        creds.setBearerToken("ZLBW5NR4U5PKD5PNP3ZP3OZS5U");
        creds.setSigningKey("9c6a5e8e763df1c9256e3d72bd7f53dfbd07312938131c75b3bfd254da787947");

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        GiftActivateRequest request = new GiftActivateRequest();
        request.setTest(true);
        request.setTerminalName("Test Terminal");
        request.setAmount("50.00");

        GiftActivateResponse response = client.giftActivate(request);

        //process the result

        if (response.isApproved()) {
            System.out.println("Approved");
        }

    System.out.println(response.getAmount());
    System.out.println(response.getCurrentBalance());
    System.out.println(response.getPublicKey());
    }


}


```

#### Time Out Reversal

Executes a manual time out reversal.

We love time out reversals. Don't be afraid to use them whenever a request to a
BlockChyp terminal times out. You have up to two minutes to reverse any
transaction. The only caveat is that you must assign transactionRef values when
you build the original request. Otherwise, we have no real way of knowing which
transaction you're trying to reverse because we may not have assigned it an id
yet. And if we did assign it an id, you wouldn't know what it is because your
request to the terminal timed out before you got a response.

```java
package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.AuthorizationRequest;
import com.blockchyp.client.dto.AuthorizationResponse;


public class ReverseExample {

    public void runSampleTransaction() throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey("ZDSMMZLGRPBPRTJUBTAFBYZ33Q");
        creds.setBearerToken("ZLBW5NR4U5PKD5PNP3ZP3OZS5U");
        creds.setSigningKey("9c6a5e8e763df1c9256e3d72bd7f53dfbd07312938131c75b3bfd254da787947");

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        AuthorizationRequest request = new AuthorizationRequest();
        request.setTerminalName("Test Terminal");
        request.setTransactionRef("<LAST TRANSACTION REF>");

        AuthorizationResponse response = client.reverse(request);

        //process the result

        if (response.isApproved()) {
            System.out.println("Approved");
        }

    }


}


```

#### Capture Preauthorization

Captures a preauthorization.

```java
package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.CaptureRequest;
import com.blockchyp.client.dto.CaptureResponse;


public class CaptureExample {

    public void runSampleTransaction() throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey("ZDSMMZLGRPBPRTJUBTAFBYZ33Q");
        creds.setBearerToken("ZLBW5NR4U5PKD5PNP3ZP3OZS5U");
        creds.setSigningKey("9c6a5e8e763df1c9256e3d72bd7f53dfbd07312938131c75b3bfd254da787947");

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        CaptureRequest request = new CaptureRequest();
        request.setTest(true);
        request.setTransactionId("<PREAUTH TRANSACTION ID>");

        CaptureResponse response = client.capture(request);

        //process the result

        if (response.isApproved()) {
            System.out.println("Approved");
        }

    }


}


```

#### Close Batch

Closes the current credit card batch.

```java
package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.CloseBatchRequest;
import com.blockchyp.client.dto.CloseBatchResponse;


public class CloseBatchExample {

    public void runSampleTransaction() throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey("ZDSMMZLGRPBPRTJUBTAFBYZ33Q");
        creds.setBearerToken("ZLBW5NR4U5PKD5PNP3ZP3OZS5U");
        creds.setSigningKey("9c6a5e8e763df1c9256e3d72bd7f53dfbd07312938131c75b3bfd254da787947");

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        CloseBatchRequest request = new CloseBatchRequest();
        request.setTest(true);

        CloseBatchResponse response = client.closeBatch(request);

        //process the result

        if (response.isSuccess()) {
            System.out.println("Success");
        }

    System.out.println(response.getCapturedTotal());
    System.out.println(response.getOpenPreauths());
    }


}


```

#### Void Transaction

Discards a previous preauth transaction.

```java
package com.blockchyp.client.examples;

import java.util.ArrayList;
import java.util.Collection;

import com.blockchyp.client.APICredentials;
import com.blockchyp.client.BlockChypClient;
import com.blockchyp.client.dto.VoidRequest;
import com.blockchyp.client.dto.VoidResponse;


public class VoidExample {

    public void runSampleTransaction() throws Exception {

        APICredentials creds = new APICredentials();
        creds.setApiKey("ZDSMMZLGRPBPRTJUBTAFBYZ33Q");
        creds.setBearerToken("ZLBW5NR4U5PKD5PNP3ZP3OZS5U");
        creds.setSigningKey("9c6a5e8e763df1c9256e3d72bd7f53dfbd07312938131c75b3bfd254da787947");

        BlockChypClient client = new BlockChypClient(creds);

        // setup request object
        VoidRequest request = new VoidRequest();
        request.setTest(true);
        request.setTransactionId("<PREVIOUS TRANSACTION ID>");

        VoidResponse response = client.voidTx(request);

        //process the result

        if (response.isApproved()) {
            System.out.println("Approved");
        }

    }


}


```

## Running Integration Tests

If you'd like to run the integration tests, create a new file on your system
called `sdk-itest-config.json` with the API credentials you'll be using as
shown in the example below.

```
{
 "gatewayHost": "https://api.blockchyp.com",
 "testGatewayHost": "https://test.blockchyp.com",
 "apiKey": "PZZNEFK7HFULCB3HTLA7HRQDJU",
 "bearerToken": "QUJCHIKNXOMSPGQ4QLT2UJX5DI",
 "signingKey": "f88a72d8bc0965f193abc7006bbffa240663c10e4d1dc3ba2f81e0ca10d359f5"
}
```

This file can be located in a few different places, but is usually located
at `<USER_HOME>/.config/blockchyp/sdk-itest-config.json`. All BlockChyp SDKs
use the same configuration file.

To run the integration test suite via `make`, type the following command:

`make integration`


## Running Integration Tests With Maven

If you'd like to bypass make and run the integration test suite directly,
use the following command:

`BC_TEST_DELAY=5 mvn test -P integration`

If you'd like to run individual tests, try the following command:

`mvn test -Dtest=TerminalChargeTest -P integration`

And these are all just JUnit tests, so feel free to run them your favorite
Java IDE.

## Contributions

BlockChyp welcomes contributions from the open source community, but bear in mind
that this repository has been generated by our internal SDK Generator tool. If
we choose to accept a PR or contribution, your code will be moved into our SDK
Generator project, which is a private repository.

## License

Copyright BlockChyp, Inc., 2019

Distributed under the terms of the [MIT] license, blockchyp-java is free and open source software.

[MIT]: https://github.com/blockchyp/blockchyp-java/blob/master/LICENSE
