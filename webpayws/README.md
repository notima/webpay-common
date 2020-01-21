# webpayws

This is a maven module that generates java classes to access the webservice located 
at https://webpayws.svea.com/SveaWebPay.asmx?WSDL using the [cxf-codegen-plugin](http://cxf.apache.org/docs/maven-cxf-codegen-plugin-wsdl-to-java.html).

A detailed description of the SOAP-service is found here
https://www.svea.com/globalassets/sweden/foretag/betallosningar/e-handel/moduler-integration/webpay_eu_webservice_nov2017.pdf  

The generated classes are placed in the package `com.svea.webpayws`

See class `com.svea.webpayws.client.WebpayWsClient` for example on how to use the API.
