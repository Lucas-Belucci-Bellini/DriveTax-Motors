package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 216. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator216 extends AbstractBaseCalculator {
    public BaseCalculator216() {
        super("base-fee-216", "Base Fee 216", BigDecimal.valueOf(2.5200), false);
    }
}
