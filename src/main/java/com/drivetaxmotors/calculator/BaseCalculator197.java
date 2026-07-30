package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 197. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator197 extends AbstractBaseCalculator {
    public BaseCalculator197() {
        super("base-fee-197", "Base Fee 197", BigDecimal.valueOf(2.1400), false);
    }
}
