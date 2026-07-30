package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator60 extends AbstractBaseCalculator {
    public BaseCalculator60() {
        super("basecalculator60", "Base Fee 60", BigDecimal.valueOf(1.5), false);
    }
}
