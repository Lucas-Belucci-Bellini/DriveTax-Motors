package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 123. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator123 extends AbstractVerifyCalculator {
    public VerifyCalculator123() {
        super("verify-check-123", "Verify Check 123", BigDecimal.valueOf(4.0300), true);
    }
}
