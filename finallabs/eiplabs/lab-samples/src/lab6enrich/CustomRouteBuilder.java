package lab6enrich;

import org.apache.camel.builder.RouteBuilder;

/**
 * A Camel Java DSL Router
 */
public class CustomRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
	   
	 ExampleAggregationStrategy aggr = new ExampleAggregationStrategy();
     
    public void configure() {

    	from("direct:start")
        .enrich("direct:resource")
  //  	.enrich("direct:resource", aggr)
    	.to("direct:result");
    	
    	
    	from("direct:resource")
    	.transform()
    	.simple("${body} middle");
    	
    	from("direct:result")
    	.log("final: ${body}");
    	
} 
}
