package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 356. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator356 extends AbstractBaseCalculator {
    public BaseCalculator356() {
        super("base-fee-356", "Base Fee 356", BigDecimal.valueOf(5.3200), false);
    }
}
