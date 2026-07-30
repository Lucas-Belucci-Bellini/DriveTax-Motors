package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator102 extends AbstractBaseCalculator {
    public BaseCalculator102() {
        super("basecalculator102", "Base Fee 102", BigDecimal.valueOf(5.7), false);
    }
}
