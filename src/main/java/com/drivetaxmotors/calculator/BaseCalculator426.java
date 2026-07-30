package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 426. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator426 extends AbstractBaseCalculator {
    public BaseCalculator426() {
        super("base-fee-426", "Base Fee 426", BigDecimal.valueOf(6.7200), false);
    }
}
