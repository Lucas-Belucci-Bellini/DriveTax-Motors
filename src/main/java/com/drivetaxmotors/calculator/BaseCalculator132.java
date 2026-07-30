package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 132. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator132 extends AbstractBaseCalculator {
    public BaseCalculator132() {
        super("base-fee-132", "Base Fee 132", BigDecimal.valueOf(0.8400), false);
    }
}
