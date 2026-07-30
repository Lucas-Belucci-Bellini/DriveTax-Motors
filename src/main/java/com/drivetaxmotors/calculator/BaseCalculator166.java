package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 166. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator166 extends AbstractBaseCalculator {
    public BaseCalculator166() {
        super("base-fee-166", "Base Fee 166", BigDecimal.valueOf(1.5200), false);
    }
}
