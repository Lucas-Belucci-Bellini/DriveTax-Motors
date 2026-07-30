package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 368. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator368 extends AbstractBaseCalculator {
    public BaseCalculator368() {
        super("base-fee-368", "Base Fee 368", BigDecimal.valueOf(5.5600), false);
    }
}
