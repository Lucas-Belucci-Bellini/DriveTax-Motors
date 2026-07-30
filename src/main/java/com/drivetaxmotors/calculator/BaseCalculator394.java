package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 394. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator394 extends AbstractBaseCalculator {
    public BaseCalculator394() {
        super("base-fee-394", "Base Fee 394", BigDecimal.valueOf(6.0800), false);
    }
}
