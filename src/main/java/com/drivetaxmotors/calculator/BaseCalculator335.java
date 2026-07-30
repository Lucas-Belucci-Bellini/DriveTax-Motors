package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 335. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator335 extends AbstractBaseCalculator {
    public BaseCalculator335() {
        super("base-fee-335", "Base Fee 335", BigDecimal.valueOf(4.9000), false);
    }
}
