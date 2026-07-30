package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 292. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator292 extends AbstractBaseCalculator {
    public BaseCalculator292() {
        super("base-fee-292", "Base Fee 292", BigDecimal.valueOf(4.0400), false);
    }
}
