package com.yoda.loans.services;


import com.yoda.loans.entities.Loan;
import com.yoda.loans.entities.Product;
import com.yoda.loans.entities.ProductTypeEnum;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class LoanService {
    final String URI = "http://localhost:8083/loans/";

    public List<Product> getLoans(String userId) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Loan[]> response = restTemplate.getForEntity(URI + userId, Loan[].class);
        List<Loan> loans = List.of(response.getBody());

        return loans.stream().map(loan -> (new Product())
                .setId(loan.getId())
                .setType(ProductTypeEnum.LOAN)
                .setTitle(loan.getTitle())
                .setDescription(loan.getDescription())
                .setRate(loan.getAnualInterestRate())
        ).toList();
    }

}
