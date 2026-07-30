package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator86 extends AbstractBaseCalculator {
    public BaseCalculator86() {
        super("basecalculator86", "Base Fee 86", BigDecimal.valueOf(4.1), false);
    }
}
