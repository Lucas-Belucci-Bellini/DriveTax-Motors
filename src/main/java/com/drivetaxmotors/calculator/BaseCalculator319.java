package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 319. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator319 extends AbstractBaseCalculator {
    public BaseCalculator319() {
        super("base-fee-319", "Base Fee 319", BigDecimal.valueOf(4.5800), false);
    }
}
