package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator99 extends AbstractBaseCalculator {
    public BaseCalculator99() {
        super("basecalculator99", "Base Fee 99", BigDecimal.valueOf(5.4), false);
    }
}
