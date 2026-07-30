package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 84. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator84 extends AbstractVerifyCalculator {
    public VerifyCalculator84() {
        super("verify-check-84", "Verify Check 84", BigDecimal.valueOf(3.6400), true);
    }
}
