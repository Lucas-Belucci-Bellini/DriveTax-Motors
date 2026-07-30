package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator81 extends AbstractBaseCalculator {
    public BaseCalculator81() {
        super("basecalculator81", "Base Fee 81", BigDecimal.valueOf(3.6), false);
    }
}
