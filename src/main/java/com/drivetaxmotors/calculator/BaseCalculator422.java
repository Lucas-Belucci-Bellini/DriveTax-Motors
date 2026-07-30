package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 422. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator422 extends AbstractBaseCalculator {
    public BaseCalculator422() {
        super("base-fee-422", "Base Fee 422", BigDecimal.valueOf(6.6400), false);
    }
}
