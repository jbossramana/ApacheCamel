package demo.web.camel.producer;

import java.util.ArrayList;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;
import org.springframework.stereotype.Component;

import demo.web.model.User;

@Component
public class UserServiceRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
	
		   restConfiguration().component("servlet").bindingMode(RestBindingMode.auto);
		   
		   rest().path("/user").consumes("application/json").produces("application/json")
		          .get().outType(ArrayList.class).to("bean:userService?method=getUsers")
		          .post().type(User.class).outType(User.class).to("bean:userService?method=addUser");
		          
	 
	  
				   
		   
	}

}
