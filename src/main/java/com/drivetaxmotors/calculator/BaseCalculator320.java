package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 320. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator320 extends AbstractBaseCalculator {
    public BaseCalculator320() {
        super("base-fee-320", "Base Fee 320", BigDecimal.valueOf(4.6000), false);
    }
}
