package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 256. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator256 extends AbstractBaseCalculator {
    public BaseCalculator256() {
        super("base-fee-256", "Base Fee 256", BigDecimal.valueOf(3.3200), false);
    }
}
