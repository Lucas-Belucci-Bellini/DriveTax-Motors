package com.drivetaxmotors.calculator;

import java.math.BigDecimal;

/**
 * Stage VERIFY calculator number 104. This calculator performs a unique verification step.
 * Generated calculator class for the drive-tax pipeline.
 * Each class implements a distinct calculation stage and returns
 * a result based on a fixed rate and stage semantics.
 */
public class VerifyCalculator104 extends AbstractVerifyCalculator {
    public VerifyCalculator104() {
        super("verify-check-104", "Verify Check 104", BigDecimal.valueOf(3.8400), true);
    }
}
