package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 381. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator381 extends AbstractBaseCalculator {
    public BaseCalculator381() {
        super("base-fee-381", "Base Fee 381", BigDecimal.valueOf(5.8200), false);
    }
}
