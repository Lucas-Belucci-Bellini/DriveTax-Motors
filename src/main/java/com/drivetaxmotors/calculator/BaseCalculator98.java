package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Generated calculator class for the drive-tax pipeline.
 * This class uses the shared AbstractBaseCalculator implementation and a configured rate.
 */
public class BaseCalculator98 extends AbstractBaseCalculator {
    public BaseCalculator98() {
        super("basecalculator98", "Base Fee 98", BigDecimal.valueOf(5.300000000000001), false);
    }
}
