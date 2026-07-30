package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 174. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator174 extends AbstractBaseCalculator {
    public BaseCalculator174() {
        super("base-fee-174", "Base Fee 174", BigDecimal.valueOf(1.6800), false);
    }
}
