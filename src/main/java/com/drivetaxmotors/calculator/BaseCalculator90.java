package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator90 extends AbstractBaseCalculator {
    public BaseCalculator90() {
        super("basecalculator90", "Base Fee 90", BigDecimal.valueOf(4.5), false);
    }
}
