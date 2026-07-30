package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 229. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator229 extends AbstractBaseCalculator {
    public BaseCalculator229() {
        super("base-fee-229", "Base Fee 229", BigDecimal.valueOf(2.7800), false);
    }
}
