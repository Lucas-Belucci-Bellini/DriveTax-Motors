package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 232. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator232 extends AbstractBaseCalculator {
    public BaseCalculator232() {
        super("base-fee-232", "Base Fee 232", BigDecimal.valueOf(2.8400), false);
    }
}
