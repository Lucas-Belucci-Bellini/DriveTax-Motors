package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 364. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator364 extends AbstractBaseCalculator {
    public BaseCalculator364() {
        super("base-fee-364", "Base Fee 364", BigDecimal.valueOf(5.4800), false);
    }
}
