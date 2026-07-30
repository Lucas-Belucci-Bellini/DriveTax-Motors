package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 235. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator235 extends AbstractBaseCalculator {
    public BaseCalculator235() {
        super("base-fee-235", "Base Fee 235", BigDecimal.valueOf(2.9000), false);
    }
}
