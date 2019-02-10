package com.camel.processor;

import org.apache.camel.Exchange;

public class CapitalizeFileContentProcessor implements org.apache.camel.Processor {


    @Override
    public void process(Exchange exchange) throws Exception {

        String originalFileContent = exchange.getIn().getBody(String.class);
        String upperCaseFileContent = originalFileContent.toUpperCase();
        exchange.getIn().setBody(upperCaseFileContent);

    }
}
