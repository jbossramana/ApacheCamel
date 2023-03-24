package demo.camel;

import java.io.StringReader;
import java.util.List;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // Poll the input directory every 5 seconds
        from("file:src/input?noop=true&delay=5000")
            // Convert the XML file to a String
            .convertBodyTo(String.class)
            // Unmarshal the String to a list of Order objects using JAXB
            .process(exchange -> {
                JAXBContext jaxbContext = JAXBContext.newInstance(Order.class);
                Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
                StringReader reader = new StringReader(exchange.getIn().getBody(String.class));
                Order order = (Order) jaxbUnmarshaller.unmarshal(reader);
                exchange.getIn().setBody(order);
            })
            // Log each Order object
         //   .split(body())
            .to("log:com.example.myapp?level=INFO");
    }
}
