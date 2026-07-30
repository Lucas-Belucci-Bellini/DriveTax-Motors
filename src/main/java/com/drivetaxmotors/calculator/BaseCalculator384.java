package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 384. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator384 extends AbstractBaseCalculator {
    public BaseCalculator384() {
        super("base-fee-384", "Base Fee 384", BigDecimal.valueOf(5.8800), false);
    }
}
