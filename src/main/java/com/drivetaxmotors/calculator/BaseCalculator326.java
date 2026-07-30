package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 326. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator326 extends AbstractBaseCalculator {
    public BaseCalculator326() {
        super("base-fee-326", "Base Fee 326", BigDecimal.valueOf(4.7200), false);
    }
}
