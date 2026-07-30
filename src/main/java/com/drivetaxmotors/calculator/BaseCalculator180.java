package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 180. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator180 extends AbstractBaseCalculator {
    public BaseCalculator180() {
        super("base-fee-180", "Base Fee 180", BigDecimal.valueOf(1.8000), false);
    }
}
