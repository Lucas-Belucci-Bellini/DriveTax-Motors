package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 400. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator400 extends AbstractBaseCalculator {
    public BaseCalculator400() {
        super("base-fee-400", "Base Fee 400", BigDecimal.valueOf(6.2000), false);
    }
}
