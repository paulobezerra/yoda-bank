package com.yoda.loans.entities;

import java.io.Serializable;
import java.math.BigDecimal;

public class Loan implements Serializable {

    private Long id;
    private String title;
    private String description;
    private BigDecimal anualInterestRate;

    public Loan() {
    }

    public Long getId() {
        return id;
    }

    public Loan setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Loan setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Loan setDescription(String description) {
        this.description = description;
        return this;
    }

    public BigDecimal getAnualInterestRate() {
        return anualInterestRate;
    }

    public Loan setAnualInterestRate(BigDecimal anualInterestRate) {
        this.anualInterestRate = anualInterestRate;
        return this;
    }
}
