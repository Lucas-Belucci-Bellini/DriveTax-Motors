package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 366. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator366 extends AbstractBaseCalculator {
    public BaseCalculator366() {
        super("base-fee-366", "Base Fee 366", BigDecimal.valueOf(5.5200), false);
    }
}
