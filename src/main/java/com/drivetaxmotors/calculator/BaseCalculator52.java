package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator52 extends AbstractBaseCalculator {
    public BaseCalculator52() {
        super("basecalculator52", "Base Fee 52", BigDecimal.valueOf(0.7), false);
    }
}
