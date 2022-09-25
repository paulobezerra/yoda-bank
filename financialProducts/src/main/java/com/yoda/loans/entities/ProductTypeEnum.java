package com.yoda.loans.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum ProductTypeEnum {
    LOAN("Emprestimo"),
    INSURANCE("Seguro"),
    CREDIT_CARD("Cartão de Credito");

    public final String label;

    ProductTypeEnum(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
