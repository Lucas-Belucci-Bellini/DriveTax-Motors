package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 126. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator126 extends AbstractVerifyCalculator {
    public VerifyCalculator126() {
        super("verify-check-126", "Verify Check 126", BigDecimal.valueOf(4.0600), true);
    }
}
