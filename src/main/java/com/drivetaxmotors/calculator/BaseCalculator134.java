package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 134. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator134 extends AbstractBaseCalculator {
    public BaseCalculator134() {
        super("base-fee-134", "Base Fee 134", BigDecimal.valueOf(0.8800), false);
    }
}
