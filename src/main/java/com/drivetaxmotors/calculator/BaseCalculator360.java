package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 360. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator360 extends AbstractBaseCalculator {
    public BaseCalculator360() {
        super("base-fee-360", "Base Fee 360", BigDecimal.valueOf(5.4000), false);
    }
}
