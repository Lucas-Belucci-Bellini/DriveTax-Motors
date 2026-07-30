package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 469. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator469 extends AbstractBaseCalculator {
    public BaseCalculator469() {
        super("base-fee-469", "Base Fee 469", BigDecimal.valueOf(7.5800), false);
    }
}
