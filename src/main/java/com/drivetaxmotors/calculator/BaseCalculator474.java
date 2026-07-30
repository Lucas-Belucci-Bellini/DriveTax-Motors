package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 474. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator474 extends AbstractBaseCalculator {
    public BaseCalculator474() {
        super("base-fee-474", "Base Fee 474", BigDecimal.valueOf(7.6800), false);
    }
}
