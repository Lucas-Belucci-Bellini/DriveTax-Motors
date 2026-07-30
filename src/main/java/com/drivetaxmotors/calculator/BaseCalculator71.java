package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator71 extends AbstractBaseCalculator {
    public BaseCalculator71() {
        super("basecalculator71", "Base Fee 71", BigDecimal.valueOf(2.6), false);
    }
}
