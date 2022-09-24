package com.yoda.loans.controllers;

import com.yoda.insurances.wsdl.GetInsurancesResponse;
import com.yoda.loans.entities.Product;
import com.yoda.loans.services.CreditCardService;
import com.yoda.loans.services.InsuranceService;
import com.yoda.loans.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.stream.Stream;

@RestController
public class ProductsController {

    @Autowired
    InsuranceService insuranceService;

    @Autowired
    CreditCardService creditCardService;

    @Autowired
    LoanService loanService;

    @GetMapping("/products/{userId}")
    public List<Product> getProductsByUser(@PathVariable String userId) throws ExecutionException, InterruptedException {
        Assert.notNull(userId, "UserId deve ser informado");

        var products = new ArrayList<Product>();

        products.addAll(insuranceService.getInsurances(userId));
        products.addAll(creditCardService.getCreditCards(userId));
        products.addAll(loanService.getLoans(userId));

        return products;
    }

    @GetMapping("/products/{userId}/async")
    public List<Product> getLoansByUser(@PathVariable String userId) throws ExecutionException, InterruptedException {
        Assert.notNull(userId, "UserId deve ser informado");

        var products = new ArrayList<Product>();

        CompletableFuture<List<Product>> insurancesFuture = CompletableFuture.supplyAsync(() -> insuranceService.getInsurances(userId));
        CompletableFuture<List<Product>> creditCardsFuture = CompletableFuture.supplyAsync(() -> creditCardService.getCreditCards(userId));
        CompletableFuture<List<Product>> loansFuture = CompletableFuture.supplyAsync(() -> loanService.getLoans(userId));

        CompletableFuture<Void> completableFuture = CompletableFuture.allOf(insurancesFuture, creditCardsFuture, loansFuture);
        completableFuture.get();

        products.addAll(insurancesFuture.get());
        products.addAll(creditCardsFuture.get());
        products.addAll(loansFuture.get());

        return products;
    }
}
