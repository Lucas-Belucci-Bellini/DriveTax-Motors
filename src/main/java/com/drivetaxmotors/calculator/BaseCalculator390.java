package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 390. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator390 extends AbstractBaseCalculator {
    public BaseCalculator390() {
        super("base-fee-390", "Base Fee 390", BigDecimal.valueOf(6.0000), false);
    }
}
