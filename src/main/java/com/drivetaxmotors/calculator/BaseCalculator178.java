package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 178. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator178 extends AbstractBaseCalculator {
    public BaseCalculator178() {
        super("base-fee-178", "Base Fee 178", BigDecimal.valueOf(1.7600), false);
    }
}
