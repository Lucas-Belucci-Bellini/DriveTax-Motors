package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 212. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator212 extends AbstractBaseCalculator {
    public BaseCalculator212() {
        super("base-fee-212", "Base Fee 212", BigDecimal.valueOf(2.4400), false);
    }
}
