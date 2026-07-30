package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 231. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator231 extends AbstractBaseCalculator {
    public BaseCalculator231() {
        super("base-fee-231", "Base Fee 231", BigDecimal.valueOf(2.8200), false);
    }
}
