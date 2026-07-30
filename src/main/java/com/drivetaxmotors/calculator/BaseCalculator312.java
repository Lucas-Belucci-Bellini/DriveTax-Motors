package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 312. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator312 extends AbstractBaseCalculator {
    public BaseCalculator312() {
        super("base-fee-312", "Base Fee 312", BigDecimal.valueOf(4.4400), false);
    }
}
