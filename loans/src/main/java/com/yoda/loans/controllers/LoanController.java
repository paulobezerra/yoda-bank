package com.yoda.loans.controllers;

import com.yoda.loans.entities.Loan;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@RestController
public class LoanController {

    @GetMapping("/loans/{userId}")
    public List<Loan> getLoansByUser(@PathVariable String userId) throws InterruptedException {

        TimeUnit.MILLISECONDS.sleep(850);

        Assert.notNull(userId, "UserId deve ser informado");

        var loans = new ArrayList<Loan>();

        var loan1 = (new Loan())
                .setId(Double.valueOf(Math.random()*Long.MAX_VALUE).longValue())
                .setTitle("Empréstimo Automático")
                .setDescription("Mussum Ipsum, cacilds vidis litro abertis. Manduma pindureta quium dia nois paga.Aenean aliquam molestie leo, vitae iaculis nisl.Paisis, filhis, espiritis santis.Suco de cevadiss, é um leite divinis, qui tem lupuliz, matis, aguis e fermentis.")
                .setAnualInterestRate(BigDecimal.valueOf(Math.random() * 10));
        loans.add(loan1);

        var loan2 = (new Loan())
                .setId(Double.valueOf(Math.random()*Long.MAX_VALUE).longValue())
                .setTitle("Empréstimo Consignado")
                .setDescription("Mussum Ipsum, cacilds vidis litro abertis. Manduma pindureta quium dia nois paga.Aenean aliquam molestie leo, vitae iaculis nisl.Paisis, filhis, espiritis santis.Suco de cevadiss, é um leite divinis, qui tem lupuliz, matis, aguis e fermentis.")
                .setAnualInterestRate(BigDecimal.valueOf(Math.random() * 10));
        loans.add(loan2);

        var loan3 = (new Loan())
                .setId(Double.valueOf(Math.random()*Long.MAX_VALUE).longValue())
                .setTitle("Financimaneto de Veicúlo")
                .setDescription("Mussum Ipsum, cacilds vidis litro abertis. Manduma pindureta quium dia nois paga.Aenean aliquam molestie leo, vitae iaculis nisl.Paisis, filhis, espiritis santis.Suco de cevadiss, é um leite divinis, qui tem lupuliz, matis, aguis e fermentis.")
                .setAnualInterestRate(BigDecimal.valueOf(Math.random() * 10));
        loans.add(loan3);

        var loan4 = (new Loan())
                .setId(Double.valueOf(Math.random()*Long.MAX_VALUE).longValue())
                .setTitle("Financimaneto Imobiliário")
                .setDescription("Mussum Ipsum, cacilds vidis litro abertis. Manduma pindureta quium dia nois paga.Aenean aliquam molestie leo, vitae iaculis nisl.Paisis, filhis, espiritis santis.Suco de cevadiss, é um leite divinis, qui tem lupuliz, matis, aguis e fermentis.")
                .setAnualInterestRate(BigDecimal.valueOf(Math.random() * 10));
        loans.add(loan4);

        return loans;
    }
}
