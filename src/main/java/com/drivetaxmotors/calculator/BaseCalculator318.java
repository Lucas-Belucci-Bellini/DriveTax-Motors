package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 318. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator318 extends AbstractBaseCalculator {
    public BaseCalculator318() {
        super("base-fee-318", "Base Fee 318", BigDecimal.valueOf(4.5600), false);
    }
}
