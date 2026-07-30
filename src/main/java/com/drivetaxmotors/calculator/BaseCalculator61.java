package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator61 extends AbstractBaseCalculator {
    public BaseCalculator61() {
        super("basecalculator61", "Base Fee 61", BigDecimal.valueOf(1.6), false);
    }
}
