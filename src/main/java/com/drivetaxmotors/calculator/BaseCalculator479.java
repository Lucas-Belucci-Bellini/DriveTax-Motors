package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 479. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator479 extends AbstractBaseCalculator {
    public BaseCalculator479() {
        super("base-fee-479", "Base Fee 479", BigDecimal.valueOf(7.7800), false);
    }
}
