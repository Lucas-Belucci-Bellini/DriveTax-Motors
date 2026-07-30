package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 379. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator379 extends AbstractBaseCalculator {
    public BaseCalculator379() {
        super("base-fee-379", "Base Fee 379", BigDecimal.valueOf(5.7800), false);
    }
}
