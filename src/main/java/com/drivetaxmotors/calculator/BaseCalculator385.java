package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 385. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator385 extends AbstractBaseCalculator {
    public BaseCalculator385() {
        super("base-fee-385", "Base Fee 385", BigDecimal.valueOf(5.9000), false);
    }
}
