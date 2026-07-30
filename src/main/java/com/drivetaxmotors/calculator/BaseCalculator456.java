package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 456. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator456 extends AbstractBaseCalculator {
    public BaseCalculator456() {
        super("base-fee-456", "Base Fee 456", BigDecimal.valueOf(7.3200), false);
    }
}
