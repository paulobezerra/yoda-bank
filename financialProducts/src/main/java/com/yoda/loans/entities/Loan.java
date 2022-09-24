package com.yoda.loans.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Loan {
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

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", anualInterestRate=" + anualInterestRate +
                '}';
    }
}
