package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 463. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator463 extends AbstractBaseCalculator {
    public BaseCalculator463() {
        super("base-fee-463", "Base Fee 463", BigDecimal.valueOf(7.4600), false);
    }
}
