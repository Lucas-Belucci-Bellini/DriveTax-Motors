package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 410. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator410 extends AbstractBaseCalculator {
    public BaseCalculator410() {
        super("base-fee-410", "Base Fee 410", BigDecimal.valueOf(6.4000), false);
    }
}
