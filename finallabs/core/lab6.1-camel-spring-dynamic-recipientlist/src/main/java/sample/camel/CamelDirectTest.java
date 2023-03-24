package sample.camel;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CamelDirectTest {

	@Autowired
	ProducerTemplate producerTemplate;
	
	@GetMapping
	public String testClient(@RequestParam String msg)
	{
		String data = "good message";
   
       String result =  (String) producerTemplate.requestBodyAndHeader("direct:a",data,"myHeader",msg);
        
        return result;
        
	}
}
