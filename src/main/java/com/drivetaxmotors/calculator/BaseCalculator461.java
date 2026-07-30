package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 461. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator461 extends AbstractBaseCalculator {
    public BaseCalculator461() {
        super("base-fee-461", "Base Fee 461", BigDecimal.valueOf(7.4200), false);
    }
}
