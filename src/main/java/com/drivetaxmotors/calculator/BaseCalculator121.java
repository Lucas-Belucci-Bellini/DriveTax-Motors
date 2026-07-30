package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 121. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator121 extends AbstractBaseCalculator {
    public BaseCalculator121() {
        super("base-fee-121", "Base Fee 121", BigDecimal.valueOf(0.6200), false);
    }
}
