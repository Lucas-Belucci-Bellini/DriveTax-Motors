package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 433. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator433 extends AbstractBaseCalculator {
    public BaseCalculator433() {
        super("base-fee-433", "Base Fee 433", BigDecimal.valueOf(6.8600), false);
    }
}
