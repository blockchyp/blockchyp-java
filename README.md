# BlockChyp Java SDK

Javadocs: [https://docs.blockchyp.com/sdks/java/latest/index.html](https://docs.blockchyp.com/sdks/java/latest/index.html).

This is the recommended means for Java developers to access the BlockChyp gateway and BlockChyp terminals.
This SDK was designed to be compatible with the broadest possible range of Java point-of-sale systems.  We've
avoided some of the newer Java features we love like streams and generics in order to maintain compatibility
all the way back to Java 1.6.

We've tried to avoid introducing classpath problems for you whenever possible.  HTTP interaction is done using
commons-httpclient-3.1 and we use also use commons-lang, commons-io, and commons-codec.  We're using the Bouncy Castle 
JCE provider for encryption services, but we don't use any Bouncy Castle specific classes so if you exclude this 
dependency you should still be fine with the standard Java stuff.

## Getting the Code

There are several techniques for getting your hands on the SDK.  Most developers use a dependency management system like
Maven or Gradle.

#### Maven

The BlockChyp SDK is in Maven's repo 1.  Just add this snippet to your pom:

```
	<dependency>
	    <groupId>com.blockchyp</groupId>
	    <artifactId>blockchyp-java</artifactId>
	    <version>1.0.0</version>
	</dependency>
```

#### Gradle

For the hipster's among you who've moved up to Gradle, try adding this snippet under dependencies in your Gradle build file.

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


## Best Practices For Production Use

We designed this SDK to work out of the box with no special configuration for those developers who never read this
(most developers, we assume), but there are a few recommended best practices for production use.

By default, the Java SDK communicates with terminals without SSL or TLS.  The reason for this is that BlockChyp terminals
run on private networks where the standard root certificate authorities cannot be used and it's difficult, if not impossible,
to add new root CA's in Java programmatically.  We recommend you install our terminal root CA as a trusted CA and turn 
https on in your client.  In order to provide some extra protection in situations where developers choose not to do this, 
the SDK uses transient credentials when communicating with terminals.

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


