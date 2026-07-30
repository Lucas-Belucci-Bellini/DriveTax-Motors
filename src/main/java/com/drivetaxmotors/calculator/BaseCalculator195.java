package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 195. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator195 extends AbstractBaseCalculator {
    public BaseCalculator195() {
        super("base-fee-195", "Base Fee 195", BigDecimal.valueOf(2.1000), false);
    }
}
