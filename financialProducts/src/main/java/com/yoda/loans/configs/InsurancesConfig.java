package com.yoda.loans.configs;

import com.yoda.loans.services.InsuranceService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class InsurancesConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("com.yoda.insurances.wsdl");
        return marshaller;
    }

    @Bean
    public InsuranceService insuranceService(Jaxb2Marshaller marshaller) {
        InsuranceService client = new InsuranceService();
        client.setDefaultUri("http://localhost:8081/ws");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
