package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 334. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator334 extends AbstractBaseCalculator {
    public BaseCalculator334() {
        super("base-fee-334", "Base Fee 334", BigDecimal.valueOf(4.8800), false);
    }
}
