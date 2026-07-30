package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 297. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator297 extends AbstractBaseCalculator {
    public BaseCalculator297() {
        super("base-fee-297", "Base Fee 297", BigDecimal.valueOf(4.1400), false);
    }
}
