package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 314. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator314 extends AbstractBaseCalculator {
    public BaseCalculator314() {
        super("base-fee-314", "Base Fee 314", BigDecimal.valueOf(4.4800), false);
    }
}
