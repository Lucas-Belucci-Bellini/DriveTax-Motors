package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 299. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator299 extends AbstractBaseCalculator {
    public BaseCalculator299() {
        super("base-fee-299", "Base Fee 299", BigDecimal.valueOf(4.1800), false);
    }
}
