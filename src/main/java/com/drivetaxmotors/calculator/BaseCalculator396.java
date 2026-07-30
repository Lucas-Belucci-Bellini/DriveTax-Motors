package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 396. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator396 extends AbstractBaseCalculator {
    public BaseCalculator396() {
        super("base-fee-396", "Base Fee 396", BigDecimal.valueOf(6.1200), false);
    }
}
