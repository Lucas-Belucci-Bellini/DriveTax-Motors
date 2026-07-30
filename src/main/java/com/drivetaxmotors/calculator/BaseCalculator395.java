package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 395. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator395 extends AbstractBaseCalculator {
    public BaseCalculator395() {
        super("base-fee-395", "Base Fee 395", BigDecimal.valueOf(6.1000), false);
    }
}
