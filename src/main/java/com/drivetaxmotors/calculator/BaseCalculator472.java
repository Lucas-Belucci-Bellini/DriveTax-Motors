package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 472. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator472 extends AbstractBaseCalculator {
    public BaseCalculator472() {
        super("base-fee-472", "Base Fee 472", BigDecimal.valueOf(7.6400), false);
    }
}
