package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 459. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator459 extends AbstractBaseCalculator {
    public BaseCalculator459() {
        super("base-fee-459", "Base Fee 459", BigDecimal.valueOf(7.3800), false);
    }
}
