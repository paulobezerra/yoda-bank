package com.yoda.loans.services;

import com.yoda.insurances.wsdl.GetInsurancesRequest;
import com.yoda.insurances.wsdl.GetInsurancesResponse;
import com.yoda.loans.entities.Product;
import com.yoda.loans.entities.ProductTypeEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import java.util.List;

public class InsuranceService extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(InsuranceService.class);

    public List<Product> getInsurances(String userId) {

        GetInsurancesRequest request = new GetInsurancesRequest();
        request.setUserId(userId);

        log.info("Requesting location for " + userId);

        GetInsurancesResponse response = (GetInsurancesResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8081/ws/insurances", request,
                        new SoapActionCallback(
                                "http://yoda.com/insurances-ws/GetInsurancesRequest"));

        return response.getInsurences().stream().map((insurance) -> {
            return (new Product())
                    .setId(insurance.getId())
                    .setType(ProductTypeEnum.INSURANCE)
                    .setTitle(insurance.getTitle())
                    .setDescription(insurance.getDescription())
                    .setValue(insurance.getValue());
        }).toList();
    }
}
