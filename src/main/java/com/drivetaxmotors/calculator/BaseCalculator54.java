package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator54 extends AbstractBaseCalculator {
    public BaseCalculator54() {
        super("basecalculator54", "Base Fee 54", BigDecimal.valueOf(0.9), false);
    }
}
