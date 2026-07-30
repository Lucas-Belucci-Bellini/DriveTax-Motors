package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator65 extends AbstractBaseCalculator {
    public BaseCalculator65() {
        super("basecalculator65", "Base Fee 65", BigDecimal.valueOf(2.0), false);
    }
}
