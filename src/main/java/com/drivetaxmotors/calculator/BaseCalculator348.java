package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 348. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator348 extends AbstractBaseCalculator {
    public BaseCalculator348() {
        super("base-fee-348", "Base Fee 348", BigDecimal.valueOf(5.1600), false);
    }
}
