package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 251. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator251 extends AbstractBaseCalculator {
    public BaseCalculator251() {
        super("base-fee-251", "Base Fee 251", BigDecimal.valueOf(3.2200), false);
    }
}
