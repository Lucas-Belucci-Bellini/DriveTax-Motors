package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 147. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator147 extends AbstractBaseCalculator {
    public BaseCalculator147() {
        super("base-fee-147", "Base Fee 147", BigDecimal.valueOf(1.1400), false);
    }
}
