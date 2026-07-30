package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 189. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator189 extends AbstractBaseCalculator {
    public BaseCalculator189() {
        super("base-fee-189", "Base Fee 189", BigDecimal.valueOf(1.9800), false);
    }
}
