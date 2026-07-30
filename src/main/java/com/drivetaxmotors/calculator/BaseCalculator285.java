package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 285. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator285 extends AbstractBaseCalculator {
    public BaseCalculator285() {
        super("base-fee-285", "Base Fee 285", BigDecimal.valueOf(3.9000), false);
    }
}
