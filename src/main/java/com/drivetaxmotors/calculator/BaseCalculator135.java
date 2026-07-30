package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 135. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator135 extends AbstractBaseCalculator {
    public BaseCalculator135() {
        super("base-fee-135", "Base Fee 135", BigDecimal.valueOf(0.9000), false);
    }
}
