package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 437. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator437 extends AbstractBaseCalculator {
    public BaseCalculator437() {
        super("base-fee-437", "Base Fee 437", BigDecimal.valueOf(6.9400), false);
    }
}
