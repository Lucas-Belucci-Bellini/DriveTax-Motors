package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 149. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator149 extends AbstractBaseCalculator {
    public BaseCalculator149() {
        super("base-fee-149", "Base Fee 149", BigDecimal.valueOf(1.1800), false);
    }
}
