package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 184. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator184 extends AbstractBaseCalculator {
    public BaseCalculator184() {
        super("base-fee-184", "Base Fee 184", BigDecimal.valueOf(1.8800), false);
    }
}
