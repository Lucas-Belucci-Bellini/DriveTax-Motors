package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 367. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator367 extends AbstractBaseCalculator {
    public BaseCalculator367() {
        super("base-fee-367", "Base Fee 367", BigDecimal.valueOf(5.5400), false);
    }
}
