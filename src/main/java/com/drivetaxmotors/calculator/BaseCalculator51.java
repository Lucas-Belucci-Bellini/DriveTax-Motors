package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator51 extends AbstractBaseCalculator {
    public BaseCalculator51() {
        super("basecalculator51", "Base Fee 51", BigDecimal.valueOf(0.6), false);
    }
}
