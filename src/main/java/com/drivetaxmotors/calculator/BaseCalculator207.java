package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 207. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator207 extends AbstractBaseCalculator {
    public BaseCalculator207() {
        super("base-fee-207", "Base Fee 207", BigDecimal.valueOf(2.3400), false);
    }
}
