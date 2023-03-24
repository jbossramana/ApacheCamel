


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
    
    	String data ="laptop price:5ok";
    	
    	 CamelContext context = new DefaultCamelContext();
    	 
         context.addRoutes(new TestBuilder());
        
         context.start();
         
         ProducerTemplate template = context.createProducerTemplate();
         
        // template.sendBody("seda:start",data);
         
         template.sendBodyAndHeader("seda:dynamic",data,"recipientListHeader","seda:vendor3");
         
         Thread.sleep(500000);
      
    }

}
