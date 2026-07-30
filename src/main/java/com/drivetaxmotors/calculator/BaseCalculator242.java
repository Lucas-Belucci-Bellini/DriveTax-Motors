package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 242. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator242 extends AbstractBaseCalculator {
    public BaseCalculator242() {
        super("base-fee-242", "Base Fee 242", BigDecimal.valueOf(3.0400), false);
    }
}
