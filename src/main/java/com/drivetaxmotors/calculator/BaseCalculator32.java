package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

public class BaseCalculator32 extends AbstractBaseCalculator {
    public BaseCalculator32() {
        super("hybrid-vehicle-tax", "Hybrid Vehicle Tax", BigDecimal.valueOf(2.3), false);
    }
}
