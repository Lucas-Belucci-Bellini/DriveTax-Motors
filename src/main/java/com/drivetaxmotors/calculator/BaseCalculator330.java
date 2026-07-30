package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 330. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator330 extends AbstractBaseCalculator {
    public BaseCalculator330() {
        super("base-fee-330", "Base Fee 330", BigDecimal.valueOf(4.8000), false);
    }
}
