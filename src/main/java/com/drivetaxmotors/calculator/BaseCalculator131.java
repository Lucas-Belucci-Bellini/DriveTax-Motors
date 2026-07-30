package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 131. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator131 extends AbstractBaseCalculator {
    public BaseCalculator131() {
        super("base-fee-131", "Base Fee 131", BigDecimal.valueOf(0.8200), false);
    }
}
