package org.demo.camel;

import java.util.Map;

import org.apache.camel.Endpoint;

import org.apache.camel.support.DefaultComponent;

@org.apache.camel.spi.annotations.Component("echo")
public class echoComponent extends DefaultComponent {
    
    protected Endpoint createEndpoint(String uri, String remaining, Map<String, Object> parameters) throws Exception {
        Endpoint endpoint = new echoEndpoint(uri, this);
        setProperties(endpoint, parameters);
        return endpoint;
    }
}
