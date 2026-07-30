package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 290. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator290 extends AbstractBaseCalculator {
    public BaseCalculator290() {
        super("base-fee-290", "Base Fee 290", BigDecimal.valueOf(4.0000), false);
    }
}
