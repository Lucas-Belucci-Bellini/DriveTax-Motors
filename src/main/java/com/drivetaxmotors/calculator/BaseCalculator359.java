package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 359. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator359 extends AbstractBaseCalculator {
    public BaseCalculator359() {
        super("base-fee-359", "Base Fee 359", BigDecimal.valueOf(5.3800), false);
    }
}
