package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator62 extends AbstractBaseCalculator {
    public BaseCalculator62() {
        super("basecalculator62", "Base Fee 62", BigDecimal.valueOf(1.7000000000000002), false);
    }
}
