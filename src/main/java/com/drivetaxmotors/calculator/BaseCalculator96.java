package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator96 extends AbstractBaseCalculator {
    public BaseCalculator96() {
        super("basecalculator96", "Base Fee 96", BigDecimal.valueOf(5.1000000000000005), false);
    }
}
