package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 449. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator449 extends AbstractBaseCalculator {
    public BaseCalculator449() {
        super("base-fee-449", "Base Fee 449", BigDecimal.valueOf(7.1800), false);
    }
}
