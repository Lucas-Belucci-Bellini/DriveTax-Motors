package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator92 extends AbstractBaseCalculator {
    public BaseCalculator92() {
        super("basecalculator92", "Base Fee 92", BigDecimal.valueOf(4.7), false);
    }
}
