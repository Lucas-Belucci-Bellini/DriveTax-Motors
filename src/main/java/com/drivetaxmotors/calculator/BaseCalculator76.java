package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator76 extends AbstractBaseCalculator {
    public BaseCalculator76() {
        super("basecalculator76", "Base Fee 76", BigDecimal.valueOf(3.1), false);
    }
}
