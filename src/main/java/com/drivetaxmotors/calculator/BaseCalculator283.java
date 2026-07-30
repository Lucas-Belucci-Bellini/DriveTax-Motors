package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 283. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator283 extends AbstractBaseCalculator {
    public BaseCalculator283() {
        super("base-fee-283", "Base Fee 283", BigDecimal.valueOf(3.8600), false);
    }
}
