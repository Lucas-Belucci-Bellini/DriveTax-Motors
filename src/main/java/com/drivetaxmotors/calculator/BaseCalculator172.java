package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 172. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator172 extends AbstractBaseCalculator {
    public BaseCalculator172() {
        super("base-fee-172", "Base Fee 172", BigDecimal.valueOf(1.6400), false);
    }
}
