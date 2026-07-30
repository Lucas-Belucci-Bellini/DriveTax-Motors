package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 180. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator180 extends AbstractVerifyCalculator {
    public VerifyCalculator180() {
        super("verify-check-180", "Verify Check 180", BigDecimal.valueOf(4.6000), true);
    }
}
