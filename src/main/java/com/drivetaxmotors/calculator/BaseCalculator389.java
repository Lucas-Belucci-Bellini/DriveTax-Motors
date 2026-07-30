package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 389. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator389 extends AbstractBaseCalculator {
    public BaseCalculator389() {
        super("base-fee-389", "Base Fee 389", BigDecimal.valueOf(5.9800), false);
    }
}
