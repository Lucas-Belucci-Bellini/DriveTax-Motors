package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 202. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator202 extends AbstractVerifyCalculator {
    public VerifyCalculator202() {
        super("verify-check-202", "Verify Check 202", BigDecimal.valueOf(4.8200), true);
    }
}
