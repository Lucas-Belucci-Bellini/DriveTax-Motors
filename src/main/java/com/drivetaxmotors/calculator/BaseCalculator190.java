package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 190. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator190 extends AbstractBaseCalculator {
    public BaseCalculator190() {
        super("base-fee-190", "Base Fee 190", BigDecimal.valueOf(2.0000), false);
    }
}
