package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator70 extends AbstractBaseCalculator {
    public BaseCalculator70() {
        super("basecalculator70", "Base Fee 70", BigDecimal.valueOf(2.5), false);
    }
}
