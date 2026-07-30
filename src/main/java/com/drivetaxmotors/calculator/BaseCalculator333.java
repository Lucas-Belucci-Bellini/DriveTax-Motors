package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 333. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator333 extends AbstractBaseCalculator {
    public BaseCalculator333() {
        super("base-fee-333", "Base Fee 333", BigDecimal.valueOf(4.8600), false);
    }
}
