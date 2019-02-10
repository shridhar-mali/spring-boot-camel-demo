package com.camel.routes;

import com.camel.processor.CapitalizeFileContentProcessor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

import static java.util.logging.Logger.getLogger;

@Component
public class CopyFileRoute extends RouteBuilder {

    private static final Logger LOG = getLogger("CopyFileRoute.class");

    @Override
    public void configure() throws Exception {
        LOG.info("inside configure route.");

        from("file:/Users/shridharshilpa/source").
                log("original file contents : ${body}")
                .process(new CapitalizeFileContentProcessor())
                .log("After Processing file contents : ${body}")
                .to("file:/Users/shridharshilpa/destination");
    }
}
