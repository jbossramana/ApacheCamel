package demo.web.camel.consumer;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class ConsumerRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		// TODO Auto-generated method stub

		   restConfiguration().host("http://localhost").port(8080);
		   
		   from("file:src/data?noop=true")
		       .convertBodyTo(java.lang.String.class)
		      .split(body().tokenize("\\r\\n|\\n"))
		      .process("custom")
		      .to("rest:post:camel/user")
		      .to("rest:get:msg").log("Body : ${body}");
		   
		   
		//   from("timer://timerA?period={{timer.period}}").to("rest:get:camel/user").log("Body : ${body}");
	}

}
