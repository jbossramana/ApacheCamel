package demo.web;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component("custom")
public class CustomProcessor implements Processor{

	@Override
	public void process(Exchange exchange) throws Exception {
		
		User user = new User();
		String name = (String) exchange.getMessage().getBody();
		user.setName(name);
		exchange.getMessage().setBody(user);
		
	}

}
