package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 429. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator429 extends AbstractBaseCalculator {
    public BaseCalculator429() {
        super("base-fee-429", "Base Fee 429", BigDecimal.valueOf(6.7800), false);
    }
}
