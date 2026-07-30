package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 412. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator412 extends AbstractBaseCalculator {
    public BaseCalculator412() {
        super("base-fee-412", "Base Fee 412", BigDecimal.valueOf(6.4400), false);
    }
}
