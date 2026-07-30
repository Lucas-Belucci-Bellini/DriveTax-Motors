package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 362. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator362 extends AbstractBaseCalculator {
    public BaseCalculator362() {
        super("base-fee-362", "Base Fee 362", BigDecimal.valueOf(5.4400), false);
    }
}
