package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 124. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator124 extends AbstractVerifyCalculator {
    public VerifyCalculator124() {
        super("verify-check-124", "Verify Check 124", BigDecimal.valueOf(4.0400), true);
    }
}
