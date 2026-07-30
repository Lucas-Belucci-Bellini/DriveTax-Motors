package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 402. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator402 extends AbstractBaseCalculator {
    public BaseCalculator402() {
        super("base-fee-402", "Base Fee 402", BigDecimal.valueOf(6.2400), false);
    }
}
