package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator58 extends AbstractBaseCalculator {
    public BaseCalculator58() {
        super("basecalculator58", "Base Fee 58", BigDecimal.valueOf(1.3), false);
    }
}
