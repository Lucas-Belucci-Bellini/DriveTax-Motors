package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 450. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator450 extends AbstractBaseCalculator {
    public BaseCalculator450() {
        super("base-fee-450", "Base Fee 450", BigDecimal.valueOf(7.2000), false);
    }
}
