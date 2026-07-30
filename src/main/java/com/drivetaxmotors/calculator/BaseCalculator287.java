package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 287. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator287 extends AbstractBaseCalculator {
    public BaseCalculator287() {
        super("base-fee-287", "Base Fee 287", BigDecimal.valueOf(3.9400), false);
    }
}
