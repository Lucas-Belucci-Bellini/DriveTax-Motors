package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 124. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator124 extends AbstractBaseCalculator {
    public BaseCalculator124() {
        super("base-fee-124", "Base Fee 124", BigDecimal.valueOf(0.6800), false);
    }
}
