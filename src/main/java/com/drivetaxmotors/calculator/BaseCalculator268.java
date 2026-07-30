package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 268. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator268 extends AbstractBaseCalculator {
    public BaseCalculator268() {
        super("base-fee-268", "Base Fee 268", BigDecimal.valueOf(3.5600), false);
    }
}
