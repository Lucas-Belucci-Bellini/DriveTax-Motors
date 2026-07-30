package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 91. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator91 extends AbstractVerifyCalculator {
    public VerifyCalculator91() {
        super("verify-check-91", "Verify Check 91", BigDecimal.valueOf(3.7100), true);
    }
}
