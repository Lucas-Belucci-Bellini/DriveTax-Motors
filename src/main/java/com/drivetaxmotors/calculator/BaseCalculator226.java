package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 226. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator226 extends AbstractBaseCalculator {
    public BaseCalculator226() {
        super("base-fee-226", "Base Fee 226", BigDecimal.valueOf(2.7200), false);
    }
}
