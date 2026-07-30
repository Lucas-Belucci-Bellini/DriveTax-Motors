package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 375. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator375 extends AbstractBaseCalculator {
    public BaseCalculator375() {
        super("base-fee-375", "Base Fee 375", BigDecimal.valueOf(5.7000), false);
    }
}
