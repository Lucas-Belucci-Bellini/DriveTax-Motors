package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 305. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator305 extends AbstractBaseCalculator {
    public BaseCalculator305() {
        super("base-fee-305", "Base Fee 305", BigDecimal.valueOf(4.3000), false);
    }
}
