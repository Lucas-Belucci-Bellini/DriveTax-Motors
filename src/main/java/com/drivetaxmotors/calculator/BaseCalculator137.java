package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 137. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator137 extends AbstractBaseCalculator {
    public BaseCalculator137() {
        super("base-fee-137", "Base Fee 137", BigDecimal.valueOf(0.9400), false);
    }
}
