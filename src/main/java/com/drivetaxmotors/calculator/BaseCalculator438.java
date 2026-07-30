package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 438. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator438 extends AbstractBaseCalculator {
    public BaseCalculator438() {
        super("base-fee-438", "Base Fee 438", BigDecimal.valueOf(6.9600), false);
    }
}
