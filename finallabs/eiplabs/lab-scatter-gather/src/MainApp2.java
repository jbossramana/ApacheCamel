

import java.util.List;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.main.Main;

/**
 * A Camel Application
 */
public class MainApp2 {

    /**
     * A main() so we can easily run these routing rules in our IDE
     */
    public static void main(String... args) throws Exception {
    	 String product = "laptop";
       
    	 CamelContext context = new DefaultCamelContext();
    	 
        context.addRoutes(new ChoiceRouteBuilder());
       
        context.start();
        ProducerTemplate template = context.createProducerTemplate();
  
        template.sendBody("direct:start", product);
        
        Thread.sleep(500000);
            }

}
