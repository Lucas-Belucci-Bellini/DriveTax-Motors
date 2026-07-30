package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator89 extends AbstractBaseCalculator {
    public BaseCalculator89() {
        super("basecalculator89", "Base Fee 89", BigDecimal.valueOf(4.4), false);
    }
}
