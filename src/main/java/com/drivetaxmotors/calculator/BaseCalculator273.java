package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 273. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator273 extends AbstractBaseCalculator {
    public BaseCalculator273() {
        super("base-fee-273", "Base Fee 273", BigDecimal.valueOf(3.6600), false);
    }
}
