package lab5simple;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;




/**
 * A Camel Application
 */
public class MainApp {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
    	 String inhouse = "0000005555000001144120091209  2319@1108";
       
    	 CamelContext context = new DefaultCamelContext();
    	 
        context.addRoutes(new CustomRouteBuilder());
       
        context.start();
        ProducerTemplate template = context.createProducerTemplate();
  
       template.sendBody("direct:start", inhouse);
        
        Thread.sleep(50000);
        
            }

}
