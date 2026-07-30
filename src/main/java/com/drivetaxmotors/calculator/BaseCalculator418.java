package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 418. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator418 extends AbstractBaseCalculator {
    public BaseCalculator418() {
        super("base-fee-418", "Base Fee 418", BigDecimal.valueOf(6.5600), false);
    }
}
