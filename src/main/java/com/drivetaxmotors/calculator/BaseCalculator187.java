package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 187. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator187 extends AbstractBaseCalculator {
    public BaseCalculator187() {
        super("base-fee-187", "Base Fee 187", BigDecimal.valueOf(1.9400), false);
    }
}
