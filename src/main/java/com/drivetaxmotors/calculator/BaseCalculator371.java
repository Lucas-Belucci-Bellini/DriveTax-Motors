package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 371. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator371 extends AbstractBaseCalculator {
    public BaseCalculator371() {
        super("base-fee-371", "Base Fee 371", BigDecimal.valueOf(5.6200), false);
    }
}
