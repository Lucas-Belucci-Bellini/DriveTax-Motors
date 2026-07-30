package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator94 extends AbstractBaseCalculator {
    public BaseCalculator94() {
        super("basecalculator94", "Base Fee 94", BigDecimal.valueOf(4.9), false);
    }
}
