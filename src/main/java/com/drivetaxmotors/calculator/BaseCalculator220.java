package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 220. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator220 extends AbstractBaseCalculator {
    public BaseCalculator220() {
        super("base-fee-220", "Base Fee 220", BigDecimal.valueOf(2.6000), false);
    }
}
