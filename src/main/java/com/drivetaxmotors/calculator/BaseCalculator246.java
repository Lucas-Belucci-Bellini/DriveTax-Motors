package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 246. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator246 extends AbstractBaseCalculator {
    public BaseCalculator246() {
        super("base-fee-246", "Base Fee 246", BigDecimal.valueOf(3.1200), false);
    }
}
