package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 324. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator324 extends AbstractBaseCalculator {
    public BaseCalculator324() {
        super("base-fee-324", "Base Fee 324", BigDecimal.valueOf(4.6800), false);
    }
}
