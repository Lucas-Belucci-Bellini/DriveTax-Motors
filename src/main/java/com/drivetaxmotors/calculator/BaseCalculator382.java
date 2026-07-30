package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 382. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator382 extends AbstractBaseCalculator {
    public BaseCalculator382() {
        super("base-fee-382", "Base Fee 382", BigDecimal.valueOf(5.8400), false);
    }
}
