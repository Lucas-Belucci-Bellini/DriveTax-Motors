package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 206. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator206 extends AbstractBaseCalculator {
    public BaseCalculator206() {
        super("base-fee-206", "Base Fee 206", BigDecimal.valueOf(2.3200), false);
    }
}
