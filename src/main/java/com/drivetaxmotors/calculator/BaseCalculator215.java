package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 215. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator215 extends AbstractBaseCalculator {
    public BaseCalculator215() {
        super("base-fee-215", "Base Fee 215", BigDecimal.valueOf(2.5000), false);
    }
}
