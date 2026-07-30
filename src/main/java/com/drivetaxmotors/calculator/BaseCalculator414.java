package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 414. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator414 extends AbstractBaseCalculator {
    public BaseCalculator414() {
        super("base-fee-414", "Base Fee 414", BigDecimal.valueOf(6.4800), false);
    }
}
