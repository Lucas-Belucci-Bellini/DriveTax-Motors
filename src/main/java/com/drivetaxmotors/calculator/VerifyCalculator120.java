package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 120. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator120 extends AbstractVerifyCalculator {
    public VerifyCalculator120() {
        super("verify-check-120", "Verify Check 120", BigDecimal.valueOf(4.0000), true);
    }
}
