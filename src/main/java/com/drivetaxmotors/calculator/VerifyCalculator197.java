package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 197. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator197 extends AbstractVerifyCalculator {
    public VerifyCalculator197() {
        super("verify-check-197", "Verify Check 197", BigDecimal.valueOf(4.7700), true);
    }
}
