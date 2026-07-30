package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 214. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator214 extends AbstractBaseCalculator {
    public BaseCalculator214() {
        super("base-fee-214", "Base Fee 214", BigDecimal.valueOf(2.4800), false);
    }
}
