package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 476. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator476 extends AbstractBaseCalculator {
    public BaseCalculator476() {
        super("base-fee-476", "Base Fee 476", BigDecimal.valueOf(7.7200), false);
    }
}
