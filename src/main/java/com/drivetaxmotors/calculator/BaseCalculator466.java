package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 466. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator466 extends AbstractBaseCalculator {
    public BaseCalculator466() {
        super("base-fee-466", "Base Fee 466", BigDecimal.valueOf(7.5200), false);
    }
}
