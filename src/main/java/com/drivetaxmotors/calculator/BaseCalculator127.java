package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 127. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator127 extends AbstractBaseCalculator {
    public BaseCalculator127() {
        super("base-fee-127", "Base Fee 127", BigDecimal.valueOf(0.7400), false);
    }
}
