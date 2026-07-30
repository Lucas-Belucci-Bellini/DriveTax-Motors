package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 439. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator439 extends AbstractBaseCalculator {
    public BaseCalculator439() {
        super("base-fee-439", "Base Fee 439", BigDecimal.valueOf(6.9800), false);
    }
}
