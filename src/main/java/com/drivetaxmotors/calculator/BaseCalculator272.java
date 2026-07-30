package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 272. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator272 extends AbstractBaseCalculator {
    public BaseCalculator272() {
        super("base-fee-272", "Base Fee 272", BigDecimal.valueOf(3.6400), false);
    }
}
