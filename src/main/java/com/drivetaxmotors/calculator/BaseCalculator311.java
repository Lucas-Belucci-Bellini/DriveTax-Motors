package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 311. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator311 extends AbstractBaseCalculator {
    public BaseCalculator311() {
        super("base-fee-311", "Base Fee 311", BigDecimal.valueOf(4.4200), false);
    }
}
