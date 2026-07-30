package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 217. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator217 extends AbstractBaseCalculator {
    public BaseCalculator217() {
        super("base-fee-217", "Base Fee 217", BigDecimal.valueOf(2.5400), false);
    }
}
