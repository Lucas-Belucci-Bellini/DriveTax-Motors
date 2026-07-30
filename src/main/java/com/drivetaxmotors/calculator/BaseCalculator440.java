package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 440. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator440 extends AbstractBaseCalculator {
    public BaseCalculator440() {
        super("base-fee-440", "Base Fee 440", BigDecimal.valueOf(7.0000), false);
    }
}
