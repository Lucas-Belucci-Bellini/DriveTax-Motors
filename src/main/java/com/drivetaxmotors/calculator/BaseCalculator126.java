package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 126. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator126 extends AbstractBaseCalculator {
    public BaseCalculator126() {
        super("base-fee-126", "Base Fee 126", BigDecimal.valueOf(0.7200), false);
    }
}
