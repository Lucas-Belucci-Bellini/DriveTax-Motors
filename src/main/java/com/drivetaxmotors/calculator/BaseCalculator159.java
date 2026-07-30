package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 159. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator159 extends AbstractBaseCalculator {
    public BaseCalculator159() {
        super("base-fee-159", "Base Fee 159", BigDecimal.valueOf(1.3800), false);
    }
}
