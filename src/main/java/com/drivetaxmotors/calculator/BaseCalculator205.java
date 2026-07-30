package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 205. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator205 extends AbstractBaseCalculator {
    public BaseCalculator205() {
        super("base-fee-205", "Base Fee 205", BigDecimal.valueOf(2.3000), false);
    }
}
