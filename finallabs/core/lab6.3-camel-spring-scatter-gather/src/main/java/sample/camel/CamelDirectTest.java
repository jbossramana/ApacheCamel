package sample.camel;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CamelDirectTest {

	@Autowired
	ProducerTemplate producerTemplate;
	
	@GetMapping
	public String testClient()
	{
		 String product = "laptop";
		 
		 producerTemplate.sendBody("direct:start", product);
        
        return "Excellent";
	}
}
