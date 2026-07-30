package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 276. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator276 extends AbstractBaseCalculator {
    public BaseCalculator276() {
        super("base-fee-276", "Base Fee 276", BigDecimal.valueOf(3.7200), false);
    }
}
