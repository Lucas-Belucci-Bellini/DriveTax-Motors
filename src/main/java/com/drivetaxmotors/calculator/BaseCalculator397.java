package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 397. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator397 extends AbstractBaseCalculator {
    public BaseCalculator397() {
        super("base-fee-397", "Base Fee 397", BigDecimal.valueOf(6.1400), false);
    }
}
