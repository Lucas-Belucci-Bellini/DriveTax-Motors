package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 211. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator211 extends AbstractBaseCalculator {
    public BaseCalculator211() {
        super("base-fee-211", "Base Fee 211", BigDecimal.valueOf(2.4200), false);
    }
}
