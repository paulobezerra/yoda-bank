package com.yoda.loans.entities;

public enum ProductTypeEnum {
    LOAN("Emprestimo"),
    INSURANCE("Seguro"),
    CREDIT_CARD("Cartão de Credito");

    public final String label;

    ProductTypeEnum(String label) {
        this.label = label;
    }
}
