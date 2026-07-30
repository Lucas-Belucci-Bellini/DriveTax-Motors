package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 374. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator374 extends AbstractBaseCalculator {
    public BaseCalculator374() {
        super("base-fee-374", "Base Fee 374", BigDecimal.valueOf(5.6800), false);
    }
}
