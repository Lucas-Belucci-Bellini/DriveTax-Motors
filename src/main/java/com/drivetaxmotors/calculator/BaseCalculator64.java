package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator64 extends AbstractBaseCalculator {
    public BaseCalculator64() {
        super("basecalculator64", "Base Fee 64", BigDecimal.valueOf(1.9000000000000001), false);
    }
}
