package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 196. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator196 extends AbstractBaseCalculator {
    public BaseCalculator196() {
        super("base-fee-196", "Base Fee 196", BigDecimal.valueOf(2.1200), false);
    }
}
