
import org.apache.camel.builder.RouteBuilder;


/**
 * A Camel Java DSL Router
 */
public class ChoiceRouteBuilder extends RouteBuilder {

    /**
     * Let's configure the Camel routing rules using Java code...
     */
    public void configure() {

    	//staic recipient list
    	
    //	from("seda:start")

    	//	.to("seda:vendor1")
    //	.to("seda:vendor2")
    //	.to("seda:vendor3")
    //	.log("final message : ${body}");
    	
    	
    	
    	
    	
  from("direct:start").multicast().parallelProcessing().to("seda:vendor1", "seda:vendor2", "seda:vendor3");
    	
    	//dynamic recipient list
    	
		
		/*
		 * from("direct:start").recipientList(
		 * header("recipientListHeader").tokenize(","));
		 */
		  
		  
		  from("seda:vendor1").transform().simple("done2").log("vendor1");
		  from("seda:vendor2").transform().simple("done3").log("vendor2");
		  from("seda:vendor3").transform().simple("done4").log("vendor3");
		 
    	  
  	
    	
    }

}
