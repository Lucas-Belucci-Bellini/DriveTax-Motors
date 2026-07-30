package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 416. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator416 extends AbstractBaseCalculator {
    public BaseCalculator416() {
        super("base-fee-416", "Base Fee 416", BigDecimal.valueOf(6.5200), false);
    }
}
