package sample.camel;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;
import org.apache.camel.attachment.AttachmentMessage;
import org.apache.camel.attachment.DefaultAttachment;
import org.springframework.stereotype.Component;

@Component("customProcessor")
public class CustomProcessor implements Processor {
    public void process(Exchange exchange) throws Exception {
    	
    	
    	AttachmentMessage am = exchange.getMessage(AttachmentMessage.class); 
            am.addAttachment("jndi-example", new DataHandler(new FileDataSource("src/main/resources/jndi.properties")));
        
        
      String msg = exchange.getMessage().getBody().toString();
      System.out.println("inside custom processor: " + msg);
      Account acc= new Account();
      acc.setName(exchange.getIn().getBody().toString());
      exchange.getMessage().setBody(acc);
  
    }
}