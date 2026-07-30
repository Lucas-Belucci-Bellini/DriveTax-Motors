package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 432. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator432 extends AbstractBaseCalculator {
    public BaseCalculator432() {
        super("base-fee-432", "Base Fee 432", BigDecimal.valueOf(6.8400), false);
    }
}
