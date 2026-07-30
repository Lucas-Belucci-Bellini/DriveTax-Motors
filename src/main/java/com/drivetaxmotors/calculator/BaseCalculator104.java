package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator104 extends AbstractBaseCalculator {
    public BaseCalculator104() {
        super("basecalculator104", "Base Fee 104", BigDecimal.valueOf(5.9), false);
    }
}
