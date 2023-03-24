package lab8csv;

import java.util.ArrayList;
import java.util.List;

import org.apache.camel.builder.RouteBuilder;
import org.w3c.dom.Document;


/**
 * A Camel Java DSL Router
 */
public class ChoiceRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {


    	from("direct:start")
        .marshal().csv()
       .log("${body}");
            
    

    }

}
