package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 447. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator447 extends AbstractBaseCalculator {
    public BaseCalculator447() {
        super("base-fee-447", "Base Fee 447", BigDecimal.valueOf(7.1400), false);
    }
}
