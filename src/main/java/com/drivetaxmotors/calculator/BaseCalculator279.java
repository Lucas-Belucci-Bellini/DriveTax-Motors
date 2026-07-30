package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 279. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator279 extends AbstractBaseCalculator {
    public BaseCalculator279() {
        super("base-fee-279", "Base Fee 279", BigDecimal.valueOf(3.7800), false);
    }
}
