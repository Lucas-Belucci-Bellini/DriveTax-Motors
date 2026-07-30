package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 425. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator425 extends AbstractBaseCalculator {
    public BaseCalculator425() {
        super("base-fee-425", "Base Fee 425", BigDecimal.valueOf(6.7000), false);
    }
}
