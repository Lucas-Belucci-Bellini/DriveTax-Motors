package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 183. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator183 extends AbstractBaseCalculator {
    public BaseCalculator183() {
        super("base-fee-183", "Base Fee 183", BigDecimal.valueOf(1.8600), false);
    }
}
