package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 413. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator413 extends AbstractBaseCalculator {
    public BaseCalculator413() {
        super("base-fee-413", "Base Fee 413", BigDecimal.valueOf(6.4600), false);
    }
}
