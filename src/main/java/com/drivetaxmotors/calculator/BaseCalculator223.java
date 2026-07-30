package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 223. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator223 extends AbstractBaseCalculator {
    public BaseCalculator223() {
        super("base-fee-223", "Base Fee 223", BigDecimal.valueOf(2.6600), false);
    }
}
