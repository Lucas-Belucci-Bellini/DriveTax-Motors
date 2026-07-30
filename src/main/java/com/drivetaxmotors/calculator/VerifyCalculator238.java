package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 238. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator238 extends AbstractVerifyCalculator {
    public VerifyCalculator238() {
        super("verify-check-238", "Verify Check 238", BigDecimal.valueOf(5.1800), true);
    }
}
