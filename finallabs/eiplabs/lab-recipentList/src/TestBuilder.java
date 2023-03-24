
import org.apache.camel.builder.RouteBuilder;


/**
 * A Camel Java DSL Router
 */
public class TestBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

    	//staic recipient list
    	
    	from("seda:start").log("start ${body}").multicast().parallelProcessing().to("direct:vendor1").to("seda:vendor2").to("seda:vendor3").log("final message : ${body}");
    	
    	
    	from("seda:dynamic").recipientList(header("recipientListHeader").tokenize(","));
		  
		  
		  from("seda:vendor1").log("vendor1 ${body}"); 
		  from("seda:vendor2").log("vendor2 ${body}");
		  from("seda:vendor3").log("vendor3 ${body}"); 
		 
    	  
  	
    	
    }

}
