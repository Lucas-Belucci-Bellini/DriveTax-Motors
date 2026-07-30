package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 458. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator458 extends AbstractBaseCalculator {
    public BaseCalculator458() {
        super("base-fee-458", "Base Fee 458", BigDecimal.valueOf(7.3600), false);
    }
}
