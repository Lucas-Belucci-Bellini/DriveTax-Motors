package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 239. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator239 extends AbstractBaseCalculator {
    public BaseCalculator239() {
        super("base-fee-239", "Base Fee 239", BigDecimal.valueOf(2.9800), false);
    }
}
