package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 186. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator186 extends AbstractBaseCalculator {
    public BaseCalculator186() {
        super("base-fee-186", "Base Fee 186", BigDecimal.valueOf(1.9200), false);
    }
}
