package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 342. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator342 extends AbstractBaseCalculator {
    public BaseCalculator342() {
        super("base-fee-342", "Base Fee 342", BigDecimal.valueOf(5.0400), false);
    }
}
