package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 451. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator451 extends AbstractBaseCalculator {
    public BaseCalculator451() {
        super("base-fee-451", "Base Fee 451", BigDecimal.valueOf(7.2200), false);
    }
}
