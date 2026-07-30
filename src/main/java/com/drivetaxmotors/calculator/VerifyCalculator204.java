package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 204. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator204 extends AbstractVerifyCalculator {
    public VerifyCalculator204() {
        super("verify-check-204", "Verify Check 204", BigDecimal.valueOf(4.8400), true);
    }
}
