package demo.web.service;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

import demo.web.model.User;

@Component("custom")
public class CustomProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		// TODO Auto-generated method stub
		User user = new User();
		String name = (String) exchange.getMessage().getBody();
		user.setName(name);
        exchange.getMessage().setBody(user);
	}

}
