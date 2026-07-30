package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 176. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator176 extends AbstractBaseCalculator {
    public BaseCalculator176() {
        super("base-fee-176", "Base Fee 176", BigDecimal.valueOf(1.7200), false);
    }
}
