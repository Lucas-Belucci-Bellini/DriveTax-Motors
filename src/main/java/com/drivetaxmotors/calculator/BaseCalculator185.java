package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 185. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator185 extends AbstractBaseCalculator {
    public BaseCalculator185() {
        super("base-fee-185", "Base Fee 185", BigDecimal.valueOf(1.9000), false);
    }
}
