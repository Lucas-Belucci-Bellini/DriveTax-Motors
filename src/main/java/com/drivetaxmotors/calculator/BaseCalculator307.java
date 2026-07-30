package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 307. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator307 extends AbstractBaseCalculator {
    public BaseCalculator307() {
        super("base-fee-307", "Base Fee 307", BigDecimal.valueOf(4.3400), false);
    }
}
