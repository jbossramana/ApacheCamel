package lab8csv;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

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
    	Map<String, Object> body = new HashMap<String, Object>();
    	body.put("foo", "abc");
    	body.put("bar", 123);
       
    	 CamelContext context = new DefaultCamelContext();
    	 
        context.addRoutes(new ChoiceRouteBuilder());
       
        context.start();
        ProducerTemplate template = context.createProducerTemplate();
  
        template.sendBody("direct:start",body);
        
       Thread.sleep(5000);
        
            }

}
