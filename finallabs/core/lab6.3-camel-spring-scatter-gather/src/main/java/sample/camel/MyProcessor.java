package sample.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component("myprocessor")
public class MyProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		
		
	}

}
