package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator63 extends AbstractBaseCalculator {
    public BaseCalculator63() {
        super("basecalculator63", "Base Fee 63", BigDecimal.valueOf(1.8), false);
    }
}
