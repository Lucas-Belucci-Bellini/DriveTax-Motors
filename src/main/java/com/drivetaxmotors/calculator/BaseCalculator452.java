package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 452. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator452 extends AbstractBaseCalculator {
    public BaseCalculator452() {
        super("base-fee-452", "Base Fee 452", BigDecimal.valueOf(7.2400), false);
    }
}
