package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 123. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator123 extends AbstractBaseCalculator {
    public BaseCalculator123() {
        super("base-fee-123", "Base Fee 123", BigDecimal.valueOf(0.6600), false);
    }
}
