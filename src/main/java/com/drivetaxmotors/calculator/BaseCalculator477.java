package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 477. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator477 extends AbstractBaseCalculator {
    public BaseCalculator477() {
        super("base-fee-477", "Base Fee 477", BigDecimal.valueOf(7.7400), false);
    }
}
