package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 350. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator350 extends AbstractBaseCalculator {
    public BaseCalculator350() {
        super("base-fee-350", "Base Fee 350", BigDecimal.valueOf(5.2000), false);
    }
}
