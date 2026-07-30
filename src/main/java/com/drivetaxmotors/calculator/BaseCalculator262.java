package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 262. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator262 extends AbstractBaseCalculator {
    public BaseCalculator262() {
        super("base-fee-262", "Base Fee 262", BigDecimal.valueOf(3.4400), false);
    }
}
