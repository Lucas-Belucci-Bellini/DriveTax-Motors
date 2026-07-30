package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 354. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator354 extends AbstractBaseCalculator {
    public BaseCalculator354() {
        super("base-fee-354", "Base Fee 354", BigDecimal.valueOf(5.2800), false);
    }
}
