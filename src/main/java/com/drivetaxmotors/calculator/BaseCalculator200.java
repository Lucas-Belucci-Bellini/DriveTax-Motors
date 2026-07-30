package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 200. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator200 extends AbstractBaseCalculator {
    public BaseCalculator200() {
        super("base-fee-200", "Base Fee 200", BigDecimal.valueOf(2.2000), false);
    }
}
