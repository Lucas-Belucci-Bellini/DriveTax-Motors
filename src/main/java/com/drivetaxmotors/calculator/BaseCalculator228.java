package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 228. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator228 extends AbstractBaseCalculator {
    public BaseCalculator228() {
        super("base-fee-228", "Base Fee 228", BigDecimal.valueOf(2.7600), false);
    }
}
