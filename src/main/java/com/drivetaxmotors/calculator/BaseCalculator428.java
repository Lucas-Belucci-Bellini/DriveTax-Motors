package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 428. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator428 extends AbstractBaseCalculator {
    public BaseCalculator428() {
        super("base-fee-428", "Base Fee 428", BigDecimal.valueOf(6.7600), false);
    }
}
