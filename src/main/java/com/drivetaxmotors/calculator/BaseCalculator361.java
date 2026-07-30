package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 361. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator361 extends AbstractBaseCalculator {
    public BaseCalculator361() {
        super("base-fee-361", "Base Fee 361", BigDecimal.valueOf(5.4200), false);
    }
}
