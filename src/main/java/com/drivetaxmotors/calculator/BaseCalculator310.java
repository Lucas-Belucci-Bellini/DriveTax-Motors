package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 310. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator310 extends AbstractBaseCalculator {
    public BaseCalculator310() {
        super("base-fee-310", "Base Fee 310", BigDecimal.valueOf(4.4000), false);
    }
}
