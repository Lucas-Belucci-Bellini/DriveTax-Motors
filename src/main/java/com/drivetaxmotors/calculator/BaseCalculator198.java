package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 198. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator198 extends AbstractBaseCalculator {
    public BaseCalculator198() {
        super("base-fee-198", "Base Fee 198", BigDecimal.valueOf(2.1600), false);
    }
}
