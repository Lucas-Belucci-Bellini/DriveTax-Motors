package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 441. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator441 extends AbstractBaseCalculator {
    public BaseCalculator441() {
        super("base-fee-441", "Base Fee 441", BigDecimal.valueOf(7.0200), false);
    }
}
