package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 370. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator370 extends AbstractBaseCalculator {
    public BaseCalculator370() {
        super("base-fee-370", "Base Fee 370", BigDecimal.valueOf(5.6000), false);
    }
}
