package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 225. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator225 extends AbstractVerifyCalculator {
    public VerifyCalculator225() {
        super("verify-check-225", "Verify Check 225", BigDecimal.valueOf(5.0500), true);
    }
}
