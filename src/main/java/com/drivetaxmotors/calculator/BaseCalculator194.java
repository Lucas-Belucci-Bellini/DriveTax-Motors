package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 194. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator194 extends AbstractBaseCalculator {
    public BaseCalculator194() {
        super("base-fee-194", "Base Fee 194", BigDecimal.valueOf(2.0800), false);
    }
}
