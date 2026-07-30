package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 238. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator238 extends AbstractBaseCalculator {
    public BaseCalculator238() {
        super("base-fee-238", "Base Fee 238", BigDecimal.valueOf(2.9600), false);
    }
}
