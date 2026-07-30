package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 365. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator365 extends AbstractBaseCalculator {
    public BaseCalculator365() {
        super("base-fee-365", "Base Fee 365", BigDecimal.valueOf(5.5000), false);
    }
}
