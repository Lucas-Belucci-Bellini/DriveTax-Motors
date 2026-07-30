package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 291. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator291 extends AbstractBaseCalculator {
    public BaseCalculator291() {
        super("base-fee-291", "Base Fee 291", BigDecimal.valueOf(4.0200), false);
    }
}
