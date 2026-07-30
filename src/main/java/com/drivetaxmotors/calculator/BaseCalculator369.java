package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 369. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator369 extends AbstractBaseCalculator {
    public BaseCalculator369() {
        super("base-fee-369", "Base Fee 369", BigDecimal.valueOf(5.5800), false);
    }
}
