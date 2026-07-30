package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 156. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator156 extends AbstractBaseCalculator {
    public BaseCalculator156() {
        super("base-fee-156", "Base Fee 156", BigDecimal.valueOf(1.3200), false);
    }
}
