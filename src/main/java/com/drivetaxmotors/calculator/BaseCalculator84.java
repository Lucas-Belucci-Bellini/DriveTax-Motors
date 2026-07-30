package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator84 extends AbstractBaseCalculator {
    public BaseCalculator84() {
        super("basecalculator84", "Base Fee 84", BigDecimal.valueOf(3.9000000000000004), false);
    }
}
