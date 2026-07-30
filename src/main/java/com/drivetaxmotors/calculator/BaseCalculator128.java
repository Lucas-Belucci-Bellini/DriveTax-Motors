package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 128. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator128 extends AbstractBaseCalculator {
    public BaseCalculator128() {
        super("base-fee-128", "Base Fee 128", BigDecimal.valueOf(0.7600), false);
    }
}
