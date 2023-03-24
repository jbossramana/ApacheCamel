package demo.web;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.jackson.JacksonDataFormat;

import org.springframework.stereotype.Component;

/**
 * A Camel route that calls the REST service using a timer
 * <p/>
 * Use <tt>@Component</tt> to make Camel auto detect this route when starting.
 */
@Component
public class RestRouter extends RouteBuilder {
	JacksonDataFormat jsonDataFormat = new JacksonDataFormat(Timer.class);

	@Override
	public void configure() throws Exception {
		restConfiguration().host("localhost").port(8080);

		from("timer:timer1?period={{timer.period}}").setHeader("id", simple("${random(6,9)}"))
				.to("rest:get:random/{id}").log("${body}");

		from("timer://timer2?period={{timer.period}}").setBody().simple("Current time is ${header.firedTime}")
				.process(new TimerProcessor()).marshal(jsonDataFormat).to("rest:post:time").log("${body}");

	}

}