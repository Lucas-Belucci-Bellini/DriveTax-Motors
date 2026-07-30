package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 391. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator391 extends AbstractBaseCalculator {
    public BaseCalculator391() {
        super("base-fee-391", "Base Fee 391", BigDecimal.valueOf(6.0200), false);
    }
}
