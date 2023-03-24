package com.fusesource.camel.exercises.exception;

import org.apache.camel.Endpoint;
import org.apache.camel.EndpointInject;
import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.support.builder.Namespaces;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class RouteByCurrencyRouter extends RouteBuilder {

    private static final Logger logger = LoggerFactory.getLogger(RouteByCurrencyRouter.class);
    private static int count = 0;

    @EndpointInject(value = "sourceDirectoryXml")
    Endpoint sourceUri;

    @EndpointInject(value = "moneyUriXml")
    Endpoint moneyUriXml;

    @EndpointInject(value = "directErrorHandler")
    Endpoint directErrorHandler;

    @EndpointInject(value = "directErrorHandlerWithException")
    Endpoint directErrorHandlerWithException;

    @EndpointInject(value = "directDLQError")
    Endpoint directDLQError;


    public void configure() throws Exception {

    	Namespaces ns = new Namespaces("pay", "http://www.fusesource.com/training/payment");
    	
        onException(MyFunctionalException.class).routeId("myfunctional-exception")
                .maximumRedeliveries(0)
                .handled(true)
                .log(LoggingLevel.INFO, "%%% MyFunctional Exception handled.");

        from(sourceUri).routeId("cbr")
        .convertBodyTo(String.class)
        .log(LoggingLevel.INFO, "Message to be handled: ${file:onlyname}, body: ${body}")
            .choice()
                .when(xpath("/pay:Payments/pay:Currency = 'EUR'",ns))
                             
                    .log(LoggingLevel.INFO, "This is an Euro XML Payment: ${file:onlyname}")
                    .setHeader("Payment").simple("EUR")
                    .to(directErrorHandlerWithException)
                .when(
                    xpath("/pay:Payments/pay:Currency = 'USD'",ns))
                       
                    .log(LoggingLevel.INFO,  "This is an USD XML Payment: ${file:onlyname}" )
                    .setHeader("Payment").simple("USD")
                    .to( directErrorHandler )
                .otherwise()
                    .log(LoggingLevel.INFO, "This is an Other Currency XML Payment: ${file:onlyname}" )
                    .to( moneyUriXml );


        from(directErrorHandlerWithException).routeId("direct-error-handler-with-exception")
        // DefaultErroHandler will be used as default
        .log("Message will be processed only 1 time.")
        .bean("myBeanErrorException");

        from(directErrorHandler)
        .routeId("direct-error-handler")
        .errorHandler(deadLetterChannel(directDLQError).maximumRedeliveries(2))
        .log("Message will be processed 2 times.")
        .bean("myBeanError");

		/*
		 * from(directDLQError).routeId("DLQ")
		 * .to("file:/camel-exercises/exception/in/pending");
		 */
       

    }

}

class MyFunctionalException extends Exception {

    public MyFunctionalException(String message) {
        super(message);
    }
}