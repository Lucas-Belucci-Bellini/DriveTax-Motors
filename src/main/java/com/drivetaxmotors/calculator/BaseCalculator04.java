package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

public class BaseCalculator04 extends AbstractBaseCalculator {
    public BaseCalculator04() {
        super("luxury-car-tax", "Luxury Car Tax", BigDecimal.valueOf(12.5), false);
    }
}
