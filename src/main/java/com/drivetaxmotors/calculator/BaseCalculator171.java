package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 171. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator171 extends AbstractBaseCalculator {
    public BaseCalculator171() {
        super("base-fee-171", "Base Fee 171", BigDecimal.valueOf(1.6200), false);
    }
}
