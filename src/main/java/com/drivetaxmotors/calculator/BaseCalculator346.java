package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 346. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator346 extends AbstractBaseCalculator {
    public BaseCalculator346() {
        super("base-fee-346", "Base Fee 346", BigDecimal.valueOf(5.1200), false);
    }
}
