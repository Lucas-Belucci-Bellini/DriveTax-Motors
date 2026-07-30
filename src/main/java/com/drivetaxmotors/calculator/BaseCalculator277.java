package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 277. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator277 extends AbstractBaseCalculator {
    public BaseCalculator277() {
        super("base-fee-277", "Base Fee 277", BigDecimal.valueOf(3.7400), false);
    }
}
