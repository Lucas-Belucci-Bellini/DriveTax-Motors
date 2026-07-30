package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 249. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator249 extends AbstractBaseCalculator {
    public BaseCalculator249() {
        super("base-fee-249", "Base Fee 249", BigDecimal.valueOf(3.1800), false);
    }
}
