package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator95 extends AbstractBaseCalculator {
    public BaseCalculator95() {
        super("basecalculator95", "Base Fee 95", BigDecimal.valueOf(5.0), false);
    }
}
