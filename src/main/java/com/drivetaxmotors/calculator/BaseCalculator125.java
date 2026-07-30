package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 125. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator125 extends AbstractBaseCalculator {
    public BaseCalculator125() {
        super("base-fee-125", "Base Fee 125", BigDecimal.valueOf(0.7000), false);
    }
}
