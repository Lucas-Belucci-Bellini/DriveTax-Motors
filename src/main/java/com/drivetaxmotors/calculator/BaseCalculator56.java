package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator56 extends AbstractBaseCalculator {
    public BaseCalculator56() {
        super("basecalculator56", "Base Fee 56", BigDecimal.valueOf(1.1), false);
    }
}
