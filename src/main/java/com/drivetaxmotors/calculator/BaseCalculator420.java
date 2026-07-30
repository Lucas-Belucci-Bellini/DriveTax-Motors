package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 420. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator420 extends AbstractBaseCalculator {
    public BaseCalculator420() {
        super("base-fee-420", "Base Fee 420", BigDecimal.valueOf(6.6000), false);
    }
}
