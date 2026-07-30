package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 336. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator336 extends AbstractBaseCalculator {
    public BaseCalculator336() {
        super("base-fee-336", "Base Fee 336", BigDecimal.valueOf(4.9200), false);
    }
}
