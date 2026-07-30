package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 403. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator403 extends AbstractBaseCalculator {
    public BaseCalculator403() {
        super("base-fee-403", "Base Fee 403", BigDecimal.valueOf(6.2600), false);
    }
}
