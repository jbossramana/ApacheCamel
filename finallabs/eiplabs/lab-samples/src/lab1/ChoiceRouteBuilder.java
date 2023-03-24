package lab1;

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
    	BeanA beanA = new BeanA();
    	
    	//Customer customer = new Customer();
    	
    	
    	from("direct:simple")
       	.log("message : ${body}");
    	
    	
    	
             from("direct:start")
             .log("output : ${body}")
             .process(cust)
             .bean(beanA, "disp1")
             .bean(beanA, "disp2")
             .to("direct:end");
             
             from("direct:end")
             .bean(beanA, "setCustomer")
             .log("inside main, body : ${body}")
             .bean(beanA, "disp1");
             

            
    

    }

}
