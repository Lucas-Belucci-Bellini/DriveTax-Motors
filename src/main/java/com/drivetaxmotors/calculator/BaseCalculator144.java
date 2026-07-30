package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 144. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator144 extends AbstractBaseCalculator {
    public BaseCalculator144() {
        super("base-fee-144", "Base Fee 144", BigDecimal.valueOf(1.0800), false);
    }
}
