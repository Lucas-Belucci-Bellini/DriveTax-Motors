package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator53 extends AbstractBaseCalculator {
    public BaseCalculator53() {
        super("basecalculator53", "Base Fee 53", BigDecimal.valueOf(0.8), false);
    }
}
