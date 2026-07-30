package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 281. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator281 extends AbstractBaseCalculator {
    public BaseCalculator281() {
        super("base-fee-281", "Base Fee 281", BigDecimal.valueOf(3.8200), false);
    }
}
