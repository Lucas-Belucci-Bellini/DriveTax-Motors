package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator80 extends AbstractBaseCalculator {
    public BaseCalculator80() {
        super("basecalculator80", "Base Fee 80", BigDecimal.valueOf(3.5), false);
    }
}
