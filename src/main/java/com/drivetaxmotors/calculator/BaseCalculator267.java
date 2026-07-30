package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 267. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator267 extends AbstractBaseCalculator {
    public BaseCalculator267() {
        super("base-fee-267", "Base Fee 267", BigDecimal.valueOf(3.5400), false);
    }
}
