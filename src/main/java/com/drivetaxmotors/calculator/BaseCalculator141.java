package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 141. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator141 extends AbstractBaseCalculator {
    public BaseCalculator141() {
        super("base-fee-141", "Base Fee 141", BigDecimal.valueOf(1.0200), false);
    }
}
