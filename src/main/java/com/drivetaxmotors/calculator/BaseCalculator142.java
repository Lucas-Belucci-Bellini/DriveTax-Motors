package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 142. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator142 extends AbstractBaseCalculator {
    public BaseCalculator142() {
        super("base-fee-142", "Base Fee 142", BigDecimal.valueOf(1.0400), false);
    }
}
