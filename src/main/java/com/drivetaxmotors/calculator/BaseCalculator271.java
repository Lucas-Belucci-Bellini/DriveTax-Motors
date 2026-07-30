package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 271. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator271 extends AbstractBaseCalculator {
    public BaseCalculator271() {
        super("base-fee-271", "Base Fee 271", BigDecimal.valueOf(3.6200), false);
    }
}
