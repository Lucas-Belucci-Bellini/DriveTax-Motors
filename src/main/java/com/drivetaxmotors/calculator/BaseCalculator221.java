package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 221. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator221 extends AbstractBaseCalculator {
    public BaseCalculator221() {
        super("base-fee-221", "Base Fee 221", BigDecimal.valueOf(2.6200), false);
    }
}
