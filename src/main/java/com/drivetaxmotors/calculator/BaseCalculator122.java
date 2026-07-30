package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 122. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator122 extends AbstractBaseCalculator {
    public BaseCalculator122() {
        super("base-fee-122", "Base Fee 122", BigDecimal.valueOf(0.6400), false);
    }
}
