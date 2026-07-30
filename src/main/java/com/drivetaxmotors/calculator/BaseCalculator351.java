package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 351. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator351 extends AbstractBaseCalculator {
    public BaseCalculator351() {
        super("base-fee-351", "Base Fee 351", BigDecimal.valueOf(5.2200), false);
    }
}
