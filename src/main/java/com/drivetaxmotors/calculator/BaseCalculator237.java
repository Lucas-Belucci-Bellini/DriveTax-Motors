package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 237. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator237 extends AbstractBaseCalculator {
    public BaseCalculator237() {
        super("base-fee-237", "Base Fee 237", BigDecimal.valueOf(2.9400), false);
    }
}
