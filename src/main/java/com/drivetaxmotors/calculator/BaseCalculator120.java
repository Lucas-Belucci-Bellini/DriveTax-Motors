package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator120 extends AbstractBaseCalculator {
    public BaseCalculator120() {
        super("basecalculator120", "Base Fee 120", BigDecimal.valueOf(7.5), false);
    }
}
