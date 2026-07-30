package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 457. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator457 extends AbstractBaseCalculator {
    public BaseCalculator457() {
        super("base-fee-457", "Base Fee 457", BigDecimal.valueOf(7.3400), false);
    }
}
