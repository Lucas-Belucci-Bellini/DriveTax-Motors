package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 199. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator199 extends AbstractBaseCalculator {
    public BaseCalculator199() {
        super("base-fee-199", "Base Fee 199", BigDecimal.valueOf(2.1800), false);
    }
}
