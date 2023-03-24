package demo.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {

       

        // Camel route definition
        from("file:src/input?noop=true&delay=60000")
                .routeId("MyRoute")
                .log("initial : ${body}")
                .to("xslt:myXsltTemplate.xslt")
                .log("final : ${body}")
                .to("file:src/output");
    }
}
