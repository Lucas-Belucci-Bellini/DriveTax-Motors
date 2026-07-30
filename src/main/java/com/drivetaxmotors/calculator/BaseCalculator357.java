package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 357. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator357 extends AbstractBaseCalculator {
    public BaseCalculator357() {
        super("base-fee-357", "Base Fee 357", BigDecimal.valueOf(5.3400), false);
    }
}
