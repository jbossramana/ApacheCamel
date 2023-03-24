
package org.apache.camel.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
// load the spring xml file from classpath
@ImportResource("classpath:camel-context.xml")
public class SampleCamelApplication {

    /**
     * A main method to start this application.
     */
    public static void main(String[] args) {
        SpringApplication.run(SampleCamelApplication.class, args);
    }

}
//CHECKSTYLE:ON
