package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 210. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator210 extends AbstractBaseCalculator {
    public BaseCalculator210() {
        super("base-fee-210", "Base Fee 210", BigDecimal.valueOf(2.4000), false);
    }
}
