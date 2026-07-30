package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 407. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator407 extends AbstractBaseCalculator {
    public BaseCalculator407() {
        super("base-fee-407", "Base Fee 407", BigDecimal.valueOf(6.3400), false);
    }
}
