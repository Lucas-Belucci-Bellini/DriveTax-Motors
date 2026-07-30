package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 245. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator245 extends AbstractBaseCalculator {
    public BaseCalculator245() {
        super("base-fee-245", "Base Fee 245", BigDecimal.valueOf(3.1000), false);
    }
}
