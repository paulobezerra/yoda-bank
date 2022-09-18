package com.yoda.loans.repositories;

import com.yoda.insurances_ws.Insurance;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.PostConstruct;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class InsurancesRepository {
    private static final List<Insurance> insurances = new ArrayList<>();

    @PostConstruct
    public void initData() {
        Insurance carInsurance = new Insurance();
        carInsurance.setId(Double.valueOf(Math.random()).longValue());
        carInsurance.setTitle("Car Insurance");
        carInsurance.setDescription("Mussum Ipsum, cacilds vidis litro abertis. Si num tem leite então bota uma " +
                "pinga aí cumpadi!Tá deprimidis, eu conheço uma cachacis que pode alegrar sua vidis.Paisis, filhis, " +
                "espiritis santis.Admodum accumsan disputationi eu sit. Vide electram sadipscing et per.");
        carInsurance.setValue(BigDecimal.valueOf(1800));
        insurances.add(carInsurance);

        Insurance homeInsurance = new Insurance();
        homeInsurance.setId(Double.valueOf(Math.random()).longValue());
        homeInsurance.setTitle("House Insurance");
        homeInsurance.setDescription("Mussum Ipsum, cacilds vidis litro abertis. Si num tem leite então bota uma " +
                "pinga aí cumpadi!Tá deprimidis, eu conheço uma cachacis que pode alegrar sua vidis.Paisis, filhis, " +
                "espiritis santis.Admodum accumsan disputationi eu sit. Vide electram sadipscing et per.");
        homeInsurance.setValue(BigDecimal.valueOf(2400));
        insurances.add(homeInsurance);

        Insurance lifeInsurance = new Insurance();
        lifeInsurance.setId(Double.valueOf(Math.random()).longValue());
        lifeInsurance.setTitle("House Insurance");
        lifeInsurance.setDescription("Mussum Ipsum, cacilds vidis litro abertis. Si num tem leite então bota uma " +
                "pinga aí cumpadi!Tá deprimidis, eu conheço uma cachacis que pode alegrar sua vidis.Paisis, filhis, " +
                "espiritis santis.Admodum accumsan disputationi eu sit. Vide electram sadipscing et per.");
        lifeInsurance.setValue(BigDecimal.valueOf(1200));
        insurances.add(lifeInsurance);
    }

    public List<Insurance> findInsurance(String userId) {
        Assert.notNull(userId, "The userId must not be null");
        return insurances;
    }
}
