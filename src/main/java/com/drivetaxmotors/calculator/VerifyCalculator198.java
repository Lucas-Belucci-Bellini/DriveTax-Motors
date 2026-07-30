package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 198. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator198 extends AbstractVerifyCalculator {
    public VerifyCalculator198() {
        super("verify-check-198", "Verify Check 198", BigDecimal.valueOf(4.7800), true);
    }
}
