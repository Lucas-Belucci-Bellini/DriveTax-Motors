package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 377. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator377 extends AbstractBaseCalculator {
    public BaseCalculator377() {
        super("base-fee-377", "Base Fee 377", BigDecimal.valueOf(5.7400), false);
    }
}
