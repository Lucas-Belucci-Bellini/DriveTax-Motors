package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 442. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator442 extends AbstractBaseCalculator {
    public BaseCalculator442() {
        super("base-fee-442", "Base Fee 442", BigDecimal.valueOf(7.0400), false);
    }
}
