package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator100 extends AbstractBaseCalculator {
    public BaseCalculator100() {
        super("basecalculator100", "Base Fee 100", BigDecimal.valueOf(5.5), false);
    }
}
