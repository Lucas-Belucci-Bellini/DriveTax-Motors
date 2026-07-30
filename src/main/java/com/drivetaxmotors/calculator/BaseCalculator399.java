package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 399. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator399 extends AbstractBaseCalculator {
    public BaseCalculator399() {
        super("base-fee-399", "Base Fee 399", BigDecimal.valueOf(6.1800), false);
    }
}
