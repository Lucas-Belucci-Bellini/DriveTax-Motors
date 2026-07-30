package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 275. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator275 extends AbstractBaseCalculator {
    public BaseCalculator275() {
        super("base-fee-275", "Base Fee 275", BigDecimal.valueOf(3.7000), false);
    }
}
