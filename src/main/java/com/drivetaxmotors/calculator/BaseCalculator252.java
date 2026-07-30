package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 252. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator252 extends AbstractBaseCalculator {
    public BaseCalculator252() {
        super("base-fee-252", "Base Fee 252", BigDecimal.valueOf(3.2400), false);
    }
}
