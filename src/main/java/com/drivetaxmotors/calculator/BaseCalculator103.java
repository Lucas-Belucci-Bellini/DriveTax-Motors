package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator103 extends AbstractBaseCalculator {
    public BaseCalculator103() {
        super("basecalculator103", "Base Fee 103", BigDecimal.valueOf(5.800000000000001), false);
    }
}
