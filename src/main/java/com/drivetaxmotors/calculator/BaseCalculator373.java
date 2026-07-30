package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 373. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator373 extends AbstractBaseCalculator {
    public BaseCalculator373() {
        super("base-fee-373", "Base Fee 373", BigDecimal.valueOf(5.6600), false);
    }
}
