package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 233. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator233 extends AbstractBaseCalculator {
    public BaseCalculator233() {
        super("base-fee-233", "Base Fee 233", BigDecimal.valueOf(2.8600), false);
    }
}
