package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 263. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator263 extends AbstractBaseCalculator {
    public BaseCalculator263() {
        super("base-fee-263", "Base Fee 263", BigDecimal.valueOf(3.4600), false);
    }
}
