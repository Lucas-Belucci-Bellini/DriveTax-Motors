package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 181. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator181 extends AbstractBaseCalculator {
    public BaseCalculator181() {
        super("base-fee-181", "Base Fee 181", BigDecimal.valueOf(1.8200), false);
    }
}
