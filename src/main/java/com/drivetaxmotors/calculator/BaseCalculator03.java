package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

public class BaseCalculator03 extends AbstractBaseCalculator {
    public BaseCalculator03() {
        super("federal-motor-tax", "Federal Motor Tax", BigDecimal.valueOf(7.0), false);
    }
}
