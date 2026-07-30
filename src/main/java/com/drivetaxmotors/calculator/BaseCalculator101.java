package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator101 extends AbstractBaseCalculator {
    public BaseCalculator101() {
        super("basecalculator101", "Base Fee 101", BigDecimal.valueOf(5.6000000000000005), false);
    }
}
