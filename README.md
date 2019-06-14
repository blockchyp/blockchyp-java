# BlockChyp Java SDK

Javadocs: [https://docs.blockchyp.com/sdks/java/latest/index.html](https://docs.blockchyp.com/sdks/java/latest/index.html).

This is the recommended means for Java developers to access the BlockChyp gateway and BlockChyp terminals.
This SDK was designed to be compatible with the broadest possible range of Java point-of-sale systems.  We've
avoided some of the newer Java features we love like streams and generics in order to maintain compatibility
all the way back to Java 1.6.

We've tried to avoid introducing classpath problems for you whenever possible.  HTTP interaction is done using
commons-httpclient-3.1 and we also use commons-lang, commons-io, and commons-codec.  We're using the Bouncy Castle 
JCE provider for encryption services, but we don't use any Bouncy Castle specific classes so if you exclude this 
dependency you should still be fine with the standard Java stuff.

## Getting a Developer Terminal

If you don't already have a test terminal, login to the BlockChyp dashboard and order a developer terminal 
kit.  You'll get a swanky new Equinox Luxe 8500i terminal and a set of test cards.

If you don't have BlockChyp dashboard access, contact us at support@blockchyp.com to get setup.  Right now, developer
accounts are available by invitation only.  Just ping us and if we deem you worthy, we'll set you up with a developer account.
Don't worry.  We're pretty lenient when it comes to deeming.

## Getting the SDK

There are several techniques for getting your hands on the SDK.  Most developers use a dependency management system like
Maven.

#### Maven

The BlockChyp SDK is in Maven's Central Repository.  Just add this snippet to your pom:

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

You'll also need the Maven plugin turned on.  Make sure your Gradle build has something like this in it:

```
	apply plugin: 'maven'
```

#### Building From Source

The BlockChyp SDK has a pretty conventional Maven build with a single pom.xml and no weird repository dependencies.  Just clone this repository
and run `mvn package` to build a jar.

#### Download a Jar

We strongly recommend you get BlockChyp from the Maven repository, but just in case you want a jar, you can download one right here on 
Github from releases.


## Using the SDK

Once the BlockChyp SDK is in your classpath, you can start using it to run transactions.  All interaction with BlockChyp is done via the BlockChypClient class.

Just instantiate the BlockChypClient class, add your credentials and start charging.  Here's an example..

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

The above code is sufficient for running a basic charge transaction against a terminal.  You don't need to keep track of terminal IP addresses or anything like that.
Our terminal routing system, which is essentially a DNS system for payment terminals on private networks, handles everything for you.

#### What About Spring?

Don't worry.  We've got you covered.  The BlockChypClient was designed to be easy to use with Spring or other dependency injection frameworks.  We're former Spring developers ourselves.

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

This is pretty conventional Spring dependency injection.  The example below shows the Java code behind the above example.
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

We get it.  You're over XML.  We think XML's been unfairly maligned as a format for configuration, but we know we can't fight progress
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

## Best Practices For Production Use

We designed this SDK to work out of the box with no special configuration for those developers who never read this
(most developers, we assume), but there are a few recommended best practices for production use.

By default, the Java SDK communicates with terminals without SSL or TLS.  (Gateway communication is always TLS.)  The reason for 
this is that BlockChyp terminals
run on private networks where the standard root certificate authorities cannot be used and it's difficult, if not impossible,
to add new root CA's in Java programmatically.  We recommend you install our terminal root CA as a trusted CA and turn 
https on in your client.  In order to provide some extra protection in situations where developers choose not to do this, 
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

## Transaction Code Examples

You don't want to read words.  You want examples.  Here's a quick rundown of the stuff you can do with BlockChyp's Java
SDK.  Checkout the javadocs for more details.

#### Charge

This transaction is the basic authorize and capture transaction.

```
        AuthorizationRequest request = new AuthorizationRequest();
        request.setTransactionRef("your invoice or tender id");
        request.setTerminalName("Test Terminal");
        request.setAmount("50.00");

        AuthorizationResponse response = blockchypClient.charge(request);
        
        if (response.isApproved()) {
            System.out.println("Approved!");
        }
        
        String txId = response.getTransactionId(); //store this for refunding or voiding later

```


#### Preauth

This transaction preauthorizes a transaction.

```
        AuthorizationRequest request = new AuthorizationRequest();
        request.setTransactionRef("your invoice or tender id");
        request.setTerminalName("Test Terminal");
        request.setAmount("50.00");

        AuthorizationResponse response = blockchypClient.preauth(request);
        
        if (response.isApproved()) {
            System.out.println("Approved!");
        }
        
        String txId = response.getTransactionId(); //store this for capturing later

```

#### Capture

This one captures a preauth.  Can be for a different amount than the original authorization, optionally with a tip adjustment.

```
        CaptureRequest request = new CaptureRequest();
        request.setTransactionId("previous transaction id");
        request.setTipAmount("5.00"); //optional tip amount
        request.setAmount("55.00"); //total including the tip

        CaptureResponse response = blockchypClient.capture(request);
        
        if (response.isApproved()) {
            System.out.println("Approved!");
        }
```

#### Enroll

This captures a payment method on the terminal and then enrolls it in the token vault.  
You can then use the token for recurring payments.

```
        AuthorizationRequest request = new AuthorizationRequest();
        request.setTransactionRef("your invoice or tender id");
        request.setTerminalName("Test Terminal");

        AuthorizationResponse response = blockchypClient.enroll(request);
        
        if (response.isApproved()) {
            System.out.println("Approved!");
        }
        
        String token = response.getToken(); //here's your token!
```

#### Refunds the Right Way

If you need to execute a refund, the best way is to do so using the transaction id from the transaction you're refunding.
This lowers the surface area for fraud and makes refund easily traceable to the original purchase.

```
        RefundRequest request = new RefundRequest();
        request.setTransactionId("previous transaction id");
        request.setAmount("25.00"); //could be a reduced amount if it's a partial refund

        AuthorizationResponse response = blockchypClient.refund(request);
        
        if (response.isApproved()) {
            System.out.println("Approved!");
        }
```

#### Refunds the Wrong Way

If you absolutely must do a refund without referencing the previous transaction here's how you do it.  But please don't.

```
        
        RefundRequest request = new RefundRequest();
        request.setTransactionRef("your own refund id");
        request.setTerminalName("Test Terminal");
        request.setAmount("55.00");

        AuthorizationResponse response = blockchypClient.refund(request);
        
        if (response.isApproved()) {
            System.out.println("Approved!");
        }
```

#### Voids

You can void a transaction anytime before the batch closes.  Here's an example.

```
        VoidRequest request = new VoidRequest();
        request.setTransactionId("previous transaction id");

        VoidResponse response = blockchypClient.voidTx(request);
        
        if (response.isApproved()) {
            System.out.println("Approved!");
        }
```

#### Time Out Reversals

We love time out reversals.  Don't be afraid to use them whenever a request to a BlockChyp terminal times out. You have up to two minutes to reverse any transaction.
The only caveat is that you must use assign transactionRef values when you build the original request.  Otherwise, we have no real way of knowing which transaction
you're trying to reverse because we may not have assigned it an id yet.  And if we did assign it an id, you wouldn't know what it is because your request to the 
terminal timed out before you got a response.

```
        AuthorizationRequest request = new AuthorizationRequest();
        request.setTransactionRef("your invoice or tender id");
        request.setTerminalName("Test Terminal");
        request.setAmount("50.00");

        try {
            AuthorizationResponse response = blockchypClient.charge(request);
            
            if (response.isApproved()) {
                System.out.println("Approved!");
            }
        } catch (TimeoutException te) {
            //nope
            AuthorizationResponse response = blockchypClient.reverse(request);
            
           if (response.isApproved()) {
               //blockchyp authorized the transaction the first time
               //but it's now been reversed
           } else {
               //blockchyp never recieved the transaction
           }
        }
```


#### Batch Closure

By default, batches always close at 3 AM in the merchant's local time zone.  You can adjust this in the dashboard or turn off automatic batching.
In which case, you'll need this code snippet to close out a batch programmatically.

```
        CloseBatchRequest request = new CloseBatchRequest();

        CloseBatchResponse response = blockchypClient.closeBatch(request);
        
        if (response.isSuccess()) {
            System.out.println("Batch closed successfully!");
            System.out.println(response.getCapturedTotal()); //the amount of the expected deposit
            System.out.println(response.getOpenPreauths()); //the total of preauths opened during the batch that weren't captured
        }
```

#### Heartbeat

This method is used primarily to test connectivity with the gateway.  But it also returns a timestamp and 
some blockchain stuff you might find interesting.  Pro Tip: If merchantPk is non null in the response, your
credentials are valid.

```
        HeartbeatResponse response = blockchypClient.heartbeat(false);
        
        if (response.isSuccess()) {
            //the blockchyp gateway is up
        }
        
        if (response.getMerchantPk() != null) {
            //your gateway credentials are valid
        }
```

#### Terminal Ping

This gives you the ability to test if communication with a terminal is possible.

```
        PingRequest request = new PingRequest();
        request.setTerminalName("Test Terminal");
        
        
        Acknowledgement ack = blockchypClient.ping(request);
        
        if (ack.isSuccess()) {
            //the terminal is up and accessible!
        }     
```

#### Terminal Line Item Display

This fun option gives you the ability to display line items and totals on the terminals as orders
are scanned or entered.  Use liberally.

```
        TransactionDisplayRequest request = new TransactionDisplayRequest();
        request.setTerminalName("Test Terminal");
        
        TransactionDisplayDiscount discount = new TransactionDisplayDiscount();
        discount.setAmount("5.00");
        discount.setDescription("Member Discount");
        TransactionDisplayItem item = new TransactionDisplayItem();
        item.addDiscount(discount);
        item.setDescription("Leki Trekking Poles");  // these things saved Josiah's life once
        item.setPrice("150.00");
        item.setQuantity(1f);
        item.setExtended("145.00");
       
        
        TransactionDisplayTransaction tx = new TransactionDisplayTransaction();
        tx.addItem(item);
        tx.setSubtotal("145");
        tx.setTax("0.00");        
        request.setTransaction(tx);

        // newTransactionDisplay() replaces the terminal contents
        Acknowledgement ack = blockchypClient.newTransactionDisplay(request); 
     
        request = new TransactionDisplayRequest();
        request.setTerminalName("Test Terminal");
        
        item = new TransactionDisplayItem();
        item.setDescription("Northwest Forest Pass");  //you'll get a free one if you work here
        item.setPrice("30.00");
        item.setQuantity(1f);
        item.setExtended("30.00");
        
        tx.setSubtotal("175.00");
        tx.setTax("0.00");        
        tx.setTotal("175.00");

        // updateTransactionDisplay() adds more line items to the display
        ack = blockchypClient.updateTransactionDisplay(request);
```

#### Clearing The Terminal

This example shows you how to clear and reset the terminal.  The line item display will be cleared and any in progress transaction will be cancelled.

```
        ClearTerminalRequest request = new ClearTerminalRequest();
        request.setTerminalName("Test Terminal");

        Acknowledgement ack = blockchypClient.clear(request);
        
        if (ack.isSuccess()) {
            System.out.println("Terminal?  What terminal?");
        }
```

#### Terminal Messages

This one displays a message on the terminal.  These might be little thank you's or some kind of promotional 
message.  The message is displayed for thirty seconds before the terminal is placed in the idle state.

```
        MessageRequest request = new MessageRequest();
        request.setTerminalName("Test Terminal");
        request.setMessage("Something derogatory about about Verifone.");

        Acknowledgement ack = blockchypClient.message(request);
        
        if (ack.isSuccess()) {
            System.out.println("The truth is now out there.");
        }
```

#### Boolean Prompts

This one lets you ask the user yes or no questions.  You might do this for suggestive selling or maybe
just if the POS is feeling lonely.

```
        BooleanPromptRequest request = new BooleanPromptRequest();
        request.setTerminalName("Test Terminal");
        request.setPrompt("Is Game of Thrones overrated?");

        BooleanPromptResponse response = blockchypClient.booleanPrompt(request);
        
        if (response.isResponse()) {
            // Well, at least Josiah agrees with you.
        } else {
            // Night gathers, and now your watch begins.
        }    
```


#### Text Prompts

This option allows you to prompt the user for text or numeric data.  As of this writing, you can use this 
email to capture email address, phone numbers, customer numbers, and rewards numbers.  

Unlike boolean prompts, which support freeform prompt text, PCI rules restrict free form prompts when text can
be entered because you might prompt the user for card numbers or pins - and that would be bad.

```
        TextPromptRequest request = new TextPromptRequest();
        request.setTerminalName("Test Terminal");
        request.setPromptType("email");

        TextPromptResponse response = blockchypClient.textPrompt(request);
        
        if (response.isSuccess()) {
            System.out.println("The user's email is " + response.getResponse());
        }       
```