package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 306. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator306 extends AbstractBaseCalculator {
    public BaseCalculator306() {
        super("base-fee-306", "Base Fee 306", BigDecimal.valueOf(4.3200), false);
    }
}
