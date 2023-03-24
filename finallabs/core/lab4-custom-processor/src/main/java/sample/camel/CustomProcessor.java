package sample.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component("customProcessor")
public class CustomProcessor implements Processor {
    public void process(Exchange exchange) throws Exception {
      String msg = exchange.getMessage().getBody().toString();
      System.out.println("inside custom processor: " + msg);
      Account acc= new Account();
      acc.setName(exchange.getIn().getBody().toString());
      exchange.getMessage().setBody(acc);
  
    }
}