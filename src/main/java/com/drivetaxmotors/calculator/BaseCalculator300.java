package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 300. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator300 extends AbstractBaseCalculator {
    public BaseCalculator300() {
        super("base-fee-300", "Base Fee 300", BigDecimal.valueOf(4.2000), false);
    }
}
