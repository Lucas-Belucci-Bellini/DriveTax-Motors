package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator93 extends AbstractBaseCalculator {
    public BaseCalculator93() {
        super("basecalculator93", "Base Fee 93", BigDecimal.valueOf(4.8), false);
    }
}
