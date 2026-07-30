package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 468. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator468 extends AbstractBaseCalculator {
    public BaseCalculator468() {
        super("base-fee-468", "Base Fee 468", BigDecimal.valueOf(7.5600), false);
    }
}
