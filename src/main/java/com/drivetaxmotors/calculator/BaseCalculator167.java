package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 167. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator167 extends AbstractBaseCalculator {
    public BaseCalculator167() {
        super("base-fee-167", "Base Fee 167", BigDecimal.valueOf(1.5400), false);
    }
}
