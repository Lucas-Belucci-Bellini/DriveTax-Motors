package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 150. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator150 extends AbstractBaseCalculator {
    public BaseCalculator150() {
        super("base-fee-150", "Base Fee 150", BigDecimal.valueOf(1.2000), false);
    }
}
