package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 302. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator302 extends AbstractBaseCalculator {
    public BaseCalculator302() {
        super("base-fee-302", "Base Fee 302", BigDecimal.valueOf(4.2400), false);
    }
}
