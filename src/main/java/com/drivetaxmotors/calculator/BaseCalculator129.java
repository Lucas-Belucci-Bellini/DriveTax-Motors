package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 129. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator129 extends AbstractBaseCalculator {
    public BaseCalculator129() {
        super("base-fee-129", "Base Fee 129", BigDecimal.valueOf(0.7800), false);
    }
}
