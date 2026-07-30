package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 316. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator316 extends AbstractBaseCalculator {
    public BaseCalculator316() {
        super("base-fee-316", "Base Fee 316", BigDecimal.valueOf(4.5200), false);
    }
}
