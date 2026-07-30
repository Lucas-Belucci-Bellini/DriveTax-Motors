package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 392. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator392 extends AbstractBaseCalculator {
    public BaseCalculator392() {
        super("base-fee-392", "Base Fee 392", BigDecimal.valueOf(6.0400), false);
    }
}
