package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

public class BaseCalculator02 extends AbstractBaseCalculator {
    public BaseCalculator02() {
        super("state-sales-tax", "State Sales Tax", BigDecimal.valueOf(8.5), false);
    }
}
