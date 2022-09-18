package com.yoda.loans.services;

import com.yoda.insurances_ws.GetInsurancesRequest;
import com.yoda.insurances_ws.GetInsurancesResponse;
import com.yoda.insurances_ws.Insurance;
import com.yoda.loans.repositories.InsurancesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Endpoint
public class InsuranceEndpoint {

    private static final String NAMESPACE_URI = "http://yoda.com/insurances-ws";

    private InsurancesRepository insurancesRepository;

    @Autowired
    public InsuranceEndpoint(InsurancesRepository insurancesRepository) {
        this.insurancesRepository = insurancesRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getInsurancesRequest")
    @ResponsePayload
    public GetInsurancesResponse getInsurance(@RequestPayload GetInsurancesRequest request) throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(960);
        GetInsurancesResponse response = new GetInsurancesResponse();
        List<Insurance> insuranceList = insurancesRepository.findInsurance(request.getUserId());
        response.getInsurences().addAll(insuranceList);
        return response;
    }
}
