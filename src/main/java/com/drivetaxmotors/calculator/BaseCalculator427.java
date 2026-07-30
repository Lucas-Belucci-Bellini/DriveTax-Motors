package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 427. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator427 extends AbstractBaseCalculator {
    public BaseCalculator427() {
        super("base-fee-427", "Base Fee 427", BigDecimal.valueOf(6.7400), false);
    }
}
