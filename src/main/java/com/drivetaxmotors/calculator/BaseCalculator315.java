package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 315. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator315 extends AbstractBaseCalculator {
    public BaseCalculator315() {
        super("base-fee-315", "Base Fee 315", BigDecimal.valueOf(4.5000), false);
    }
}
