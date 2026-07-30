package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 175. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator175 extends AbstractBaseCalculator {
    public BaseCalculator175() {
        super("base-fee-175", "Base Fee 175", BigDecimal.valueOf(1.7000), false);
    }
}
