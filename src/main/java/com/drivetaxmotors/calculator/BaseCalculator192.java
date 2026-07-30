package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 192. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator192 extends AbstractBaseCalculator {
    public BaseCalculator192() {
        super("base-fee-192", "Base Fee 192", BigDecimal.valueOf(2.0400), false);
    }
}
