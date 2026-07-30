package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 284. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator284 extends AbstractBaseCalculator {
    public BaseCalculator284() {
        super("base-fee-284", "Base Fee 284", BigDecimal.valueOf(3.8800), false);
    }
}
