package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator110 extends AbstractBaseCalculator {
    public BaseCalculator110() {
        super("basecalculator110", "Base Fee 110", BigDecimal.valueOf(6.5), false);
    }
}
