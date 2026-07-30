package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 133. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator133 extends AbstractBaseCalculator {
    public BaseCalculator133() {
        super("base-fee-133", "Base Fee 133", BigDecimal.valueOf(0.8600), false);
    }
}
