package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator105 extends AbstractBaseCalculator {
    public BaseCalculator105() {
        super("basecalculator105", "Base Fee 105", BigDecimal.valueOf(6.0), false);
    }
}
