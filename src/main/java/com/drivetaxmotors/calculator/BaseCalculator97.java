package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator97 extends AbstractBaseCalculator {
    public BaseCalculator97() {
        super("basecalculator97", "Base Fee 97", BigDecimal.valueOf(5.2), false);
    }
}
