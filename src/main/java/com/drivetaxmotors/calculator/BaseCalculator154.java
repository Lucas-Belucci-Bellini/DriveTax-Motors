package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 154. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator154 extends AbstractBaseCalculator {
    public BaseCalculator154() {
        super("base-fee-154", "Base Fee 154", BigDecimal.valueOf(1.2800), false);
    }
}
