package com.yoda.loans.entities;

import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable {

    private Long id;
    private String title;
    private String description;
    private BigDecimal value;
    private BigDecimal rate;
    private ProductTypeEnum type;

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public Product setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Product setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Product setDescription(String description) {
        this.description = description;
        return this;
    }

    public BigDecimal getValue() {
        return value;
    }

    public Product setValue(BigDecimal value) {
        this.value = value;
        return this;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public Product setRate(BigDecimal rate) {
        this.rate = rate;
        return this;
    }

    public ProductTypeEnum getType() {
        return type;
    }

    public Product setType(ProductTypeEnum type) {
        this.type = type;
        return this;
    }
}
