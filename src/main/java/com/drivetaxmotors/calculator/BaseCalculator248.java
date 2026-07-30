package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 248. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator248 extends AbstractBaseCalculator {
    public BaseCalculator248() {
        super("base-fee-248", "Base Fee 248", BigDecimal.valueOf(3.1600), false);
    }
}
