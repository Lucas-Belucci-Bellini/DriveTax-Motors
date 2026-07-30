package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

public class BaseCalculator01 extends AbstractBaseCalculator {
    public BaseCalculator01() {
        super("base-price", "Base Sale Price", BigDecimal.valueOf(0.0), false);
    }
}
