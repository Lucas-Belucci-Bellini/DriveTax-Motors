package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 253. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator253 extends AbstractBaseCalculator {
    public BaseCalculator253() {
        super("base-fee-253", "Base Fee 253", BigDecimal.valueOf(3.2600), false);
    }
}
