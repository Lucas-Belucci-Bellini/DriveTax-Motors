package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 282. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator282 extends AbstractBaseCalculator {
    public BaseCalculator282() {
        super("base-fee-282", "Base Fee 282", BigDecimal.valueOf(3.8400), false);
    }
}
