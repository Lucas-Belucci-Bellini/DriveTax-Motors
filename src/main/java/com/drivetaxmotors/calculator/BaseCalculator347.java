package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 347. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator347 extends AbstractBaseCalculator {
    public BaseCalculator347() {
        super("base-fee-347", "Base Fee 347", BigDecimal.valueOf(5.1400), false);
    }
}
