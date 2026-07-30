package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 161. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator161 extends AbstractBaseCalculator {
    public BaseCalculator161() {
        super("base-fee-161", "Base Fee 161", BigDecimal.valueOf(1.4200), false);
    }
}
