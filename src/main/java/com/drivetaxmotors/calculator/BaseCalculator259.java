package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 259. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator259 extends AbstractBaseCalculator {
    public BaseCalculator259() {
        super("base-fee-259", "Base Fee 259", BigDecimal.valueOf(3.3800), false);
    }
}
