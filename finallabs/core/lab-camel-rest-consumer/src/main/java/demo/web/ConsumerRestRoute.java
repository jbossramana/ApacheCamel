package demo.web;


import java.util.ArrayList;
import java.util.UUID;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;
import org.apache.camel.model.rest.RestBindingMode;

/**
 * A Camel route that calls the REST service using a timer
 * <p/>
 * Use <tt>@Component</tt> to make Camel auto detect this route when starting.
 */
@Component
public class ConsumerRestRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {

		restConfiguration().host("localhost").port(8080);
		
		from("file:src/data?noop=true")
		.split(body().tokenize("\\r\\n|\\n"))
		   .convertBodyTo(java.lang.String.class).process("custom")
		   .to("rest:post:camel/user");

		from("timer://timer2?period={{timer.period}}").to("rest:get:camel/user").log("${body}");
}
}