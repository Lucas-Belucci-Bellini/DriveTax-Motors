package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 341. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator341 extends AbstractBaseCalculator {
    public BaseCalculator341() {
        super("base-fee-341", "Base Fee 341", BigDecimal.valueOf(5.0200), false);
    }
}
