package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 372. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator372 extends AbstractBaseCalculator {
    public BaseCalculator372() {
        super("base-fee-372", "Base Fee 372", BigDecimal.valueOf(5.6400), false);
    }
}
