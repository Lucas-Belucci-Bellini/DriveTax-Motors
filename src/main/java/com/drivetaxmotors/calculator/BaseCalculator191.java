package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 191. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator191 extends AbstractBaseCalculator {
    public BaseCalculator191() {
        super("base-fee-191", "Base Fee 191", BigDecimal.valueOf(2.0200), false);
    }
}
