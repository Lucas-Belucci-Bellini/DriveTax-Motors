package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 173. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator173 extends AbstractBaseCalculator {
    public BaseCalculator173() {
        super("base-fee-173", "Base Fee 173", BigDecimal.valueOf(1.6600), false);
    }
}
