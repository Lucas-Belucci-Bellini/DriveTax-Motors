package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 383. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator383 extends AbstractBaseCalculator {
    public BaseCalculator383() {
        super("base-fee-383", "Base Fee 383", BigDecimal.valueOf(5.8600), false);
    }
}
