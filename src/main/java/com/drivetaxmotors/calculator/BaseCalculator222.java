package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 222. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator222 extends AbstractBaseCalculator {
    public BaseCalculator222() {
        super("base-fee-222", "Base Fee 222", BigDecimal.valueOf(2.6400), false);
    }
}
