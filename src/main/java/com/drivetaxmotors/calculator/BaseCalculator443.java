package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage BASE calculator number 443. This calculator applies a unique base fee rate.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class BaseCalculator443 extends AbstractBaseCalculator {
    public BaseCalculator443() {
        super("base-fee-443", "Base Fee 443", BigDecimal.valueOf(7.0600), false);
    }
}
