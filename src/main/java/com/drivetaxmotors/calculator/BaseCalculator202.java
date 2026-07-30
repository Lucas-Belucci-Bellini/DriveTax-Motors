package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 202. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator202 extends AbstractBaseCalculator {
    public BaseCalculator202() {
        super("base-fee-202", "Base Fee 202", BigDecimal.valueOf(2.2400), false);
    }
}
