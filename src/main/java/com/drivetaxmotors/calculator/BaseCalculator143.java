package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 143. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator143 extends AbstractBaseCalculator {
    public BaseCalculator143() {
        super("base-fee-143", "Base Fee 143", BigDecimal.valueOf(1.0600), false);
    }
}
