package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 478. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator478 extends AbstractBaseCalculator {
    public BaseCalculator478() {
        super("base-fee-478", "Base Fee 478", BigDecimal.valueOf(7.7600), false);
    }
}
