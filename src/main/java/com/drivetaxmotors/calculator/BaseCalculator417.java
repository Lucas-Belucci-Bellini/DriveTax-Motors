package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 417. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator417 extends AbstractBaseCalculator {
    public BaseCalculator417() {
        super("base-fee-417", "Base Fee 417", BigDecimal.valueOf(6.5400), false);
    }
}
