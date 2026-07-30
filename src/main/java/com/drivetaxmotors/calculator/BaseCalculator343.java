package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 343. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator343 extends AbstractBaseCalculator {
    public BaseCalculator343() {
        super("base-fee-343", "Base Fee 343", BigDecimal.valueOf(5.0600), false);
    }
}
