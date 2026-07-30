package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator91 extends AbstractBaseCalculator {
    public BaseCalculator91() {
        super("basecalculator91", "Base Fee 91", BigDecimal.valueOf(4.6000000000000005), false);
    }
}
