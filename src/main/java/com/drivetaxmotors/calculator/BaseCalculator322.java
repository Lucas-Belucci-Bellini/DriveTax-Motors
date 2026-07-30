package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 322. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator322 extends AbstractBaseCalculator {
    public BaseCalculator322() {
        super("base-fee-322", "Base Fee 322", BigDecimal.valueOf(4.6400), false);
    }
}
