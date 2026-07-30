package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator109 extends AbstractBaseCalculator {
    public BaseCalculator109() {
        super("basecalculator109", "Base Fee 109", BigDecimal.valueOf(6.4), false);
    }
}
