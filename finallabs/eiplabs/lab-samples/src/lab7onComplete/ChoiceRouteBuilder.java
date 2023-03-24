package lab7onComplete;

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


    	CustomProcessor cust = new CustomProcessor();

    	
       onCompletion().log("on completion block");
    //	onCompletion().parallelProcessing().to("log:global");

    	from("direct:simple")
    	.log("simple is invoked")
    //	.process(cust)
    	 .to("direct:end");
    	
    
             
             from("direct:end")
           .onCompletion().log("inside oncompletion").end()
           //  .onCompletion().onWhen(body().contains("Hello"))
             .log("end is invoked");
             

            
    

    }

}
