package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 257. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator257 extends AbstractBaseCalculator {
    public BaseCalculator257() {
        super("base-fee-257", "Base Fee 257", BigDecimal.valueOf(3.3400), false);
    }
}
