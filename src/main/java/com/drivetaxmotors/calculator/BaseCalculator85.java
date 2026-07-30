package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator85 extends AbstractBaseCalculator {
    public BaseCalculator85() {
        super("basecalculator85", "Base Fee 85", BigDecimal.valueOf(4.0), false);
    }
}
