package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 127. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator127 extends AbstractVerifyCalculator {
    public VerifyCalculator127() {
        super("verify-check-127", "Verify Check 127", BigDecimal.valueOf(4.0700), true);
    }
}
