package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator72 extends AbstractBaseCalculator {
    public BaseCalculator72() {
        super("basecalculator72", "Base Fee 72", BigDecimal.valueOf(2.7), false);
    }
}
