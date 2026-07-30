package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 301. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator301 extends AbstractBaseCalculator {
    public BaseCalculator301() {
        super("base-fee-301", "Base Fee 301", BigDecimal.valueOf(4.2200), false);
    }
}
