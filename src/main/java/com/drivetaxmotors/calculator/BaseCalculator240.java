package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 240. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator240 extends AbstractBaseCalculator {
    public BaseCalculator240() {
        super("base-fee-240", "Base Fee 240", BigDecimal.valueOf(3.0000), false);
    }
}
