package sample.camel;

import java.util.ArrayList;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

	@Autowired
	ProducerTemplate  producerTemplate;
	
	@RequestMapping
	public String testService()
	{
		ArrayList<String>  fruits = new ArrayList<String>();
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("grapes");
		
		producerTemplate.sendBody("direct:splitUsingBody", fruits);
		return "success";
		
		
	}
}
