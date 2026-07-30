package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 280. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator280 extends AbstractBaseCalculator {
    public BaseCalculator280() {
        super("base-fee-280", "Base Fee 280", BigDecimal.valueOf(3.8000), false);
    }
}
