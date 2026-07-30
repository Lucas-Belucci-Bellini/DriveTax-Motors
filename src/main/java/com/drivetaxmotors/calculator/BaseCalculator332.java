package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 332. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator332 extends AbstractBaseCalculator {
    public BaseCalculator332() {
        super("base-fee-332", "Base Fee 332", BigDecimal.valueOf(4.8400), false);
    }
}
