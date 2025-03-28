/**
 * @author higor.robinn on 27/03/2025.
 */

package com.example.higor.webservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.wsdl.wsdl11.DefaultWsdl11Definition;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

@Configuration
public class WsdlConfig {

    @Bean(name = "motorista")
    public DefaultWsdl11Definition defaultWsdl11Definition (XsdSchema motoristaSchema) {
        DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
        wsdl11Definition.setPortTypeName("MotoristaPort");
        wsdl11Definition.setLocationUri("/ws");
        wsdl11Definition.setTargetNamespace("http://localhost:8080/motorista");
        wsdl11Definition.setSchema(motoristaSchema);
        return wsdl11Definition;
    }

    @Bean
    public XsdSchema motoristaSchema() {
        return new SimpleXsdSchema(new org.springframework.core.io.ClassPathResource("motorista-carro.xsd"));
    }
}
