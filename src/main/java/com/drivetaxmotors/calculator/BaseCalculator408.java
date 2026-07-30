package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 408. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator408 extends AbstractBaseCalculator {
    public BaseCalculator408() {
        super("base-fee-408", "Base Fee 408", BigDecimal.valueOf(6.3600), false);
    }
}
