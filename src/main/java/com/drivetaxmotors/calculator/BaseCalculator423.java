package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 423. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator423 extends AbstractBaseCalculator {
    public BaseCalculator423() {
        super("base-fee-423", "Base Fee 423", BigDecimal.valueOf(6.6600), false);
    }
}
