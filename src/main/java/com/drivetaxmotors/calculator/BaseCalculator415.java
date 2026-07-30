package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 415. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator415 extends AbstractBaseCalculator {
    public BaseCalculator415() {
        super("base-fee-415", "Base Fee 415", BigDecimal.valueOf(6.5000), false);
    }
}
