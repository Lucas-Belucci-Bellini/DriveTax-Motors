package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 193. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator193 extends AbstractBaseCalculator {
    public BaseCalculator193() {
        super("base-fee-193", "Base Fee 193", BigDecimal.valueOf(2.0600), false);
    }
}
