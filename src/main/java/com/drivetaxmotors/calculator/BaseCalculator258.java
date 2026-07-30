package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 258. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator258 extends AbstractBaseCalculator {
    public BaseCalculator258() {
        super("base-fee-258", "Base Fee 258", BigDecimal.valueOf(3.3600), false);
    }
}
