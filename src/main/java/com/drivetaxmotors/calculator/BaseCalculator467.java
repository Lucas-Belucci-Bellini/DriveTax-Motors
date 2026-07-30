package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 467. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator467 extends AbstractBaseCalculator {
    public BaseCalculator467() {
        super("base-fee-467", "Base Fee 467", BigDecimal.valueOf(7.5400), false);
    }
}
