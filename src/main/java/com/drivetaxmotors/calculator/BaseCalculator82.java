package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator82 extends AbstractBaseCalculator {
    public BaseCalculator82() {
        super("basecalculator82", "Base Fee 82", BigDecimal.valueOf(3.7), false);
    }
}
