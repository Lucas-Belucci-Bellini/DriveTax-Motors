package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator83 extends AbstractBaseCalculator {
    public BaseCalculator83() {
        super("basecalculator83", "Base Fee 83", BigDecimal.valueOf(3.8000000000000003), false);
    }
}
