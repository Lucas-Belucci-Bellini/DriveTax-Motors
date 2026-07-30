package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator87 extends AbstractBaseCalculator {
    public BaseCalculator87() {
        super("basecalculator87", "Base Fee 87", BigDecimal.valueOf(4.2), false);
    }
}
